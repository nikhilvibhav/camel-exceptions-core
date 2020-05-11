package com.capgemini.camel.exception.core;

/**
 * Abstract, Camel-friendly Recoverable Exception
 *
 * @author Abbas Attarwala
 * @author Andrew Harmel-Law
 */
public abstract class RecoverableException extends Exception implements Recoverable {

    /**
     * Constructor with message arg.
     *
     * @param message the message
     */
    public RecoverableException(final String message) {
        super(message);
    }

    /**
     * Constructor with message and cause args.
     *
     * @param message the message
     * @param cause   the Throwable which caused this Exception
     */
    public RecoverableException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
