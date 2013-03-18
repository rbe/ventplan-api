/*
 * ventplan-api
 * ventplan-api
 * Copyright (C) 2011-2013 art of coding UG, http://www.art-of-coding.eu
 * Copyright (C) 2005-2010 Informationssysteme Ralf Bensmann, http://www.bensmann.com
 *
 * Alle Rechte vorbehalten. Nutzung unterliegt Lizenzbedingungen.
 * All rights reserved. Use is subject to license terms.
 *
 * rbe, 04.02.13 10:18
 */

package eu.artofcoding.ventplan.api;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.InjectionPoint;
import java.net.URI;
import java.net.URISyntaxException;

public class VpxFactory {

    /**
     * Factory method to create a simple VpxClient instance.
     * @return {@link VpxClientImpl} instance.
     */
    @Produces
    @VpxCloud(protocol = "http")
    public VpxClient createHttpClient(InjectionPoint injectionPoint) throws VpxException {
        // CDI
        Annotated annotated = injectionPoint.getAnnotated();
        VpxCloud vpxCloud = annotated.getAnnotation(VpxCloud.class);
        // UserInfo
        String userInfo = null;
        if (null != vpxCloud.username() && vpxCloud.username().length() > 0) {
            userInfo = String.format("%s:%s", vpxCloud.username(), vpxCloud.password());
        }
        // Create client
        VpxClient vpxClient;
        try {
            URI uri = new URI(VpxConstants.HTTP, userInfo, vpxCloud.server(), vpxCloud.port(), "/vpx", null, null);
            vpxClient = new VpxClientImpl(uri);
        } catch (URISyntaxException e) {
            throw new VpxException(e);
        }
        return vpxClient;
    }

    /**
     * Factory method to create a simple VpxClient instance.
     * @return {@link VpxClientImpl} instance.
     */
    @Produces
    @VpxCloud(protocol = "https")
    public VpxClient createHttpsClient(InjectionPoint injectionPoint) throws VpxException {
        // CDI
        Annotated annotated = injectionPoint.getAnnotated();
        VpxCloud vpxCloud = annotated.getAnnotation(VpxCloud.class);
        // UserInfo
        String userInfo = null;
        if (null != vpxCloud.username() && vpxCloud.username().length() > 0) {
            userInfo = String.format("%s:%s", vpxCloud.username(), vpxCloud.password());
        }
        // Create client
        VpxClient vpxClient;
        try {
            URI uri = new URI(VpxConstants.HTTP, userInfo, vpxCloud.server(), vpxCloud.port(), "/vpx", null, null);
            vpxClient = new VpxClientImpl(uri);
        } catch (URISyntaxException e) {
            throw new VpxException(e);
        }
        return vpxClient;
    }

}
