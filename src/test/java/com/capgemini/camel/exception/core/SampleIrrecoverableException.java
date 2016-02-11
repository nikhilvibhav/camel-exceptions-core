package com.capgemini.camel.exception.core;

/**
 * This is the Sample implementation of the {@link com.rmg.camel.exception.IrrecoverableException}
 *
 * @author Abbas Attarwala
 */
public class SampleIrrecoverableException extends IrrecoverableException {

    /**
     * Constructor with message arg
     * 
     * @param message 
     */
    public SampleIrrecoverableException(String message) {
        super(message);
    }
    
    /**
     * Constructor with message and cause args
     * 
     * @param message
     * @param cause 
     */
    public SampleIrrecoverableException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
