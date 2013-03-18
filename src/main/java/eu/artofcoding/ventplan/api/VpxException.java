/*
 * ventplan-api
 * ventplan-api
 * Copyright (C) 2011-2013 art of coding UG, http://www.art-of-coding.eu
 * Copyright (C) 2005-2010 Informationssysteme Ralf Bensmann, http://www.bensmann.com
 *
 * Alle Rechte vorbehalten. Nutzung unterliegt Lizenzbedingungen.
 * All rights reserved. Use is subject to license terms.
 *
 * rbe, 02.02.13 17:36
 */

package eu.artofcoding.ventplan.api;

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

    /* Java 7
    public VpxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    */

}
