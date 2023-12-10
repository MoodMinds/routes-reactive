package org.moodminds.route.reactive;

import org.moodminds.reactive.FluxPublishable;
import reactor.core.publisher.Flux;

/**
 * The {@link FluxPublishable} implementation of the {@link PublishableEmittable} interfaces.
 *
 * @param <V> the type of the emitting values
 * @param <E> the type of possible exception that might be thrown
 */
public class FluxEmittable<V, E extends Exception> extends FluxPublishable<V, E>
        implements PublishableEmittable<V, E> {

    /**
     * Construct the object with the given {@link Flux} instance.
     *
     * @param flux the given {@link Flux} instance
     * @throws NullPointerException if the {@link Flux} specified is {@code null}
     */
    protected FluxEmittable(Flux<V> flux) {
        super(flux);
    }
}
