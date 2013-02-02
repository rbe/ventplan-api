/*
 * ventplan-server
 * ventplan-api
 * Copyright (C) 2011-2013 art of coding UG, http://www.art-of-coding.eu/
 *
 * Alle Rechte vorbehalten. Nutzung unterliegt Lizenzbedingungen.
 * All rights reserved. Use is subject to license terms.
 *
 * rbe, 02.01.13 16:11
 */

package com.ventplan.model;

public class VpxException extends Exception {

    public VpxException() {
    }

    public VpxException(String message) {
        super(message);
    }

    public VpxException(String message, Throwable cause) {
        super(message, cause);
    }

    public VpxException(Throwable cause) {
        super(cause);
    }

    public VpxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
