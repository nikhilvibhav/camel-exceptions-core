package com.capgemini.camel.exception.core;

/**
 * An abstract Camel-friendly Irrecoverable Exception
 * 
 * @author Abbas Attarwala
 * @author Andrew Harmel-Law
 */
public abstract class IrrecoverableException extends Exception implements Irrecoverable {
    
    /**
     * Constructor with message arg.
     * @param message the message
     */
    public IrrecoverableException(final String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args.
     * @param message the message
     * @param cause the Throwable which caused this Exception
     */
    public IrrecoverableException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
