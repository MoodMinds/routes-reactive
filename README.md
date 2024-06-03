# Asynchronous Reactive implementation of the [Routes](https://github.com/MoodMinds/routes) SPI

This implementation of the [Routes SPI](https://github.com/MoodMinds/routes) offers support for asynchronous reactive execution
through subscription and utilizes [Reactive Streams Publishable](https://github.com/MoodMinds/reactive-streams-publishable)
for this. You can employ it as a foundational base to extend the [Routes SPI](https://github.com/MoodMinds/routes) or as a client
library for your code. This is particularly beneficial when complex logic definitions demand enhanced readability, surpassing
what [Project Reactor](https://projectreactor.io) can provide.

## Understanding the Core

The concrete execution representation of this [Routes](https://github.com/MoodMinds/routes) implementation is an extended
`FluxPublishable` or `MonoPublishable` derived from Reactor's `Flux` or `Mono`.

```java
import org.moodminds.reactive.FluxPublishable;
import org.moodminds.route.Stream;
import org.moodminds.route.Stream2;
import org.moodminds.route.reactive.FluxEmittable;
import org.moodminds.route.reactive.Routes;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.logging.Logger;

import static java.lang.System.getenv;

class Sample {

    static Logger LOG = Logger.getLogger(Sample.class.getName());

    static final Stream<String, RuntimeException> INTEGERS = $ -> $.source("1", "2", "3");

    static final Stream2<Boolean, String, String, Exception> STREAMING = ($, bool, str) -> $
            .either(bool, () -> $
                .source("a", "b", "c"))
            .option(str, String::isEmpty, INTEGERS)
            .option(str, "mm"::equals, () -> $
                .supply(() -> getenv("VAR1")))
            .option(str, "WW"::equals, () -> $
                .supply(() -> {
                    throw new IOException("Something went wrong");
                }))
            .option(() -> $
                .expect(str));

    static final Stream2<Boolean, String, String, RuntimeException> CATCHING = ($, bool, str) -> $
            .stream(STREAMING, bool, str)
            .caught(ex -> $
                .supply(ex, Exception::getMessage))
            .caught(IOException.class, ioEx -> $
                .supply(ioEx, RuntimeException::new, $::except));

    public void subscribe() {

        // materialize to FluxEmittable<String, RuntimeException>
        FluxPublishable<String, Exception> flux = new Routes().stream(CATCHING, true, "test");

        flux.subscribe();

        // get Mono<Long> count from Reactor's API, since this is a Flux instance
        Mono<Long> count = flux.count();
        count.subscribe(l -> LOG.info(l.toString()));
    }
}
```

## Maven configuration

Artifacts can be found on [Maven Central](https://search.maven.org/) after publication.

```xml
<dependency>
    <groupId>org.moodminds.routes</groupId>
    <artifactId>routes-reactive</artifactId>
    <version>${version}</version>
</dependency>
```

## Building from Source

You may need to build from source to use **Routes Reactive** (until it is in Maven Central) with Maven and JDK 1.8 at least.

## License
This project is going to be released under version 2.0 of the [Apache License][l].

[l]: https://www.apache.org/licenses/LICENSE-2.0