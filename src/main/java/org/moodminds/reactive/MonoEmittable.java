package org.moodminds.reactive;

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
    public MonoEmittable(Mono<V> mono) {
        super(mono);
    }


    /**
     * Return a MonoPublishable by the given {@link Mono}.
     *
     * @param mono the given {@link Mono}
     * @param <V> the type of item values
     * @param <E> the type of potential exceptions
     * @return a MonoPublishable by the given {@link Mono}
     * @throws NullPointerException if the {@link Mono} specified is {@code null}
     */
    public static <V, E extends Exception> MonoEmittable<V, E> mono(Mono<V> mono) {
        return new MonoEmittable<>(mono);
    }
}
