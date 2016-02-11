package com.capgemini.camel.exception.core;

/**
 * Marker interface that marks any exception as a Recoverable
 * Camel Exception
 * 
 * @author Abbas Attarwala
 * @author Andrew Harmel-Law
 */
public interface Recoverable {
    String DESCRIPTION = "This is a recoverable exception";
}
