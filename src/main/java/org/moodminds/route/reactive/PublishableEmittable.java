package org.moodminds.route.reactive;

import org.moodminds.elemental.Association;
import org.moodminds.elemental.KeyValue;
import org.moodminds.emission.Emittable;
import org.moodminds.reactive.Publishable;
import org.moodminds.function.Executable1Throwing2;
import org.moodminds.function.Executable1Throwing3;
import org.moodminds.traverse.TraverseSupportException;

import static java.util.Objects.requireNonNull;

/**
 * The {@link Publishable} extension of the {@link Emittable} interface.
 *
 * @param <V> the type of the emitting values
 * @param <E> the type of possible exception that might be thrown
 */
public interface PublishableEmittable<V, E extends Exception> extends Publishable<V, E>, Emittable<V, E> {

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception> boolean sequence(Executable1Throwing2<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2> traverse, KeyValue<?, ?>... ctx) throws E, H1, H2 {
        requireNonNull(traverse);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception> boolean sequence(Executable1Throwing2<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2> traverse, Association<?, ?, ?> ctx) throws E, H1, H2 {
        requireNonNull(traverse); requireNonNull(ctx);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception> boolean traverse(Executable1Throwing2<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2> traverse, KeyValue<?, ?>... ctx) throws E, H1, H2 {
        requireNonNull(traverse);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception> boolean traverse(Executable1Throwing2<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2> traverse, Association<?, ?, ?> ctx) throws E, H1, H2 {
        requireNonNull(traverse); requireNonNull(ctx);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception> boolean parallel(Executable1Throwing2<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2> traverse, KeyValue<?, ?>... ctx) throws E, H1, H2 {
        requireNonNull(traverse);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception> boolean parallel(Executable1Throwing2<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2> traverse, Association<?, ?, ?> ctx) throws E, H1, H2 {
        requireNonNull(traverse); requireNonNull(ctx);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception, H3 extends Exception> boolean sequence(Executable1Throwing3<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2, ? extends H3> traverse, KeyValue<?, ?>... ctx) throws E, H1, H2, H3 {
        requireNonNull(traverse);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception, H3 extends Exception> boolean sequence(Executable1Throwing3<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2, ? extends H3> traverse, Association<?, ?, ?> ctx) throws E, H1, H2, H3 {
        requireNonNull(traverse); requireNonNull(ctx);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception, H3 extends Exception> boolean traverse(Executable1Throwing3<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2, ? extends H3> traverse, KeyValue<?, ?>... ctx) throws E, H1, H2, H3 {
        requireNonNull(traverse);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception, H3 extends Exception> boolean traverse(Executable1Throwing3<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2, ? extends H3> traverse, Association<?, ?, ?> ctx) throws E, H1, H2, H3 {
        requireNonNull(traverse); requireNonNull(ctx);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception, H3 extends Exception> boolean parallel(Executable1Throwing3<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2, ? extends H3> traverse, KeyValue<?, ?>... ctx) throws E, H1, H2, H3 {
        requireNonNull(traverse);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }

    /**
     * {@inheritDoc}
     *
     * @param traverse {@inheritDoc}
     * @param ctx {@inheritDoc}
     * @return do not return, throw {@link TraverseSupportException}
     * @param <H1> {@inheritDoc}
     * @param <H2> {@inheritDoc}
     * @throws E {@inheritDoc}
     * @throws H1 {@inheritDoc}
     * @throws H2 {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     * @throws TraverseSupportException an exception indicating that synchronous traversal is not supported
     */
    @Override
    default <H1 extends Exception, H2 extends Exception, H3 extends Exception> boolean parallel(Executable1Throwing3<? super Traverser<? extends V, ? extends E>, ? extends H1, ? extends H2, ? extends H3> traverse, Association<?, ?, ?> ctx) throws E, H1, H2, H3 {
        requireNonNull(traverse); requireNonNull(ctx);
        throw new TraverseSupportException("Asynchronous subscription only.");
    }
}
