package org.moodminds.reactive;

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
    public FluxEmittable(Flux<V> flux) {
        super(flux);
    }


    /**
     * Return a FluxEmittable by the given {@link Flux}.
     *
     * @param flux the given {@link Flux}
     * @param <V> the type of item values
     * @param <E> the type of potential exceptions
     * @return a FluxEmittable by the given {@link Flux}
     * @throws NullPointerException if the {@link Flux} specified is {@code null}
     */
    public static <V, E extends Exception> FluxEmittable<V, E> flux(Flux<V> flux) {
        return new FluxEmittable<>(flux);
    }
}
