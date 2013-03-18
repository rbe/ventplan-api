/*
 * ventplan-api
 * ventplan-api
 * Copyright (C) 2011-2013 art of coding UG, http://www.art-of-coding.eu
 * Copyright (C) 2005-2010 Informationssysteme Ralf Bensmann, http://www.bensmann.com
 *
 * Alle Rechte vorbehalten. Nutzung unterliegt Lizenzbedingungen.
 * All rights reserved. Use is subject to license terms.
 *
 * rbe, 04.02.13 10:51
 */

package eu.artofcoding.ventplan.api;

import eu.artofcoding.ventplan.api.vpx.VentplanProject;

import java.net.URI;

public interface VpxClient {

    URI makeURI(String projectname) throws VpxException;

    String getUsername();

    VentplanProject create(VentplanProject ventplanProject) throws VpxException;

    VentplanProject update(VentplanProject ventplanProject) throws VpxException;

    VentplanProject delete(VentplanProject ventplanProject) throws VpxException;

}
