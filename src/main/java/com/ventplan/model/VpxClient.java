/*
 * ventplan-server
 * ventplan-api
 * Copyright (C) 2011-2013 art of coding UG, http://www.art-of-coding.eu/
 *
 * Alle Rechte vorbehalten. Nutzung unterliegt Lizenzbedingungen.
 * All rights reserved. Use is subject to license terms.
 *
 * rbe, 02.01.13 18:25
 */

package com.ventplan.model;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.ventplan.model.vpx.VentplanProject;

import javax.ws.rs.core.MediaType;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;
import java.util.prefs.Preferences;

public class VpxClient {

    private final URI uri;

    private final DefaultClientConfig clientConfig;

    private final Client client;

    private VpxClient(URI uri) {
        this.uri = uri;
        clientConfig = new DefaultClientConfig();
        client = Client.create(clientConfig);
    }

    public static VpxClient createClient(String host, int port) throws VpxException {
        VpxClient vpxClient = null;
        String userInfo = null;
        URI uri = null;
        try {
            uri = new URI("http", userInfo, host, port, "/vpx", null, null);
            vpxClient = new VpxClient(uri);
        } catch (URISyntaxException e) {
            throw new VpxException(e);
        }
        return vpxClient;
    }

    public static VpxClient createClient(String host) throws VpxException {
        return createClient(host, 80);
    }

    public VentplanProject create(VentplanProject ventplanProject) {
        String projectname = ventplanProject.getProjekt().getBauvorhaben();
        String updateUri = String.format("%s/%s/project/%s", uri.toString(), username(), projectname);
        System.out.printf("update: URI=%s%n", updateUri);
        WebResource webResource = client.resource(updateUri);
        VentplanProject response = webResource.accept(MediaType.APPLICATION_XML).put(VentplanProject.class, ventplanProject);
        System.out.printf("update: response=%s%n", response);
        return response;
    }

    public VentplanProject update(VentplanProject ventplanProject) {
        String projectname = ventplanProject.getProjekt().getBauvorhaben();
        String updateUri = String.format("%s/%s/project/%s", uri.toString(), username(), projectname);
        System.out.printf("update: URI=%s%n", updateUri);
        WebResource webResource = client.resource(updateUri);
        VentplanProject response = webResource.accept(MediaType.APPLICATION_XML).post(VentplanProject.class, ventplanProject);
        System.out.printf("update: response=%s%n", response);
        return response;
    }

    public String username() {
        Preferences preferences = Preferences.userNodeForPackage(this.getClass());
        String username = preferences.get("username", null);
        if (null == username) {
            String osUsername = System.getProperty("user.name");
            username = String.format("%s-%s", osUsername, UUID.randomUUID());
            preferences.put("username", username);
            System.out.println("Generated username=" + username);
        } else {
            System.out.println("Read username from preferences=" + username);
        }
        return username;
    }

}
