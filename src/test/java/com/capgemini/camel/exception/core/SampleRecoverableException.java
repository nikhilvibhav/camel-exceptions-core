package com.capgemini.camel.exception.core;

/**
 * This is the Sample implementation of the {@link com.rmg.camel.exception.RecoverableException}
 *
 * @author Abbas Attarwala
 */
public class SampleRecoverableException extends RecoverableException {

    /**
     * Constructor with message arg
     * 
     * @param message 
     */
    public SampleRecoverableException(String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * 
     * @param message
     * @param cause 
     */
    public SampleRecoverableException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
