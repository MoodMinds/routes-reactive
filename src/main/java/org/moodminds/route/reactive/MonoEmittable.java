package org.moodminds.route.reactive;

import org.moodminds.reactive.MonoPublishable;
import reactor.core.publisher.Mono;

/**
 * The {@link MonoPublishable} implementation of the {@link PublishableEmittable} interfaces.
 *
 * @param <V> the type of the emitting values
 * @param <E> the type of possible exception that might be thrown
 */
public class MonoEmittable<V, E extends Exception> extends MonoPublishable<V, E>
        implements PublishableEmittable<V, E> {

    /**
     * Construct the object with the given {@link Mono} instance.
     *
     * @param mono the given {@link Mono} instance
     * @throws NullPointerException if the {@link Mono} specified is {@code null}
     */
    protected MonoEmittable(Mono<V> mono) {
        super(mono);
    }
}
