/*
 * ventplan-api
 * ventplan-api
 * Copyright (C) 2011-2013 art of coding UG, http://www.art-of-coding.eu
 * Copyright (C) 2005-2010 Informationssysteme Ralf Bensmann, http://www.bensmann.com
 *
 * Alle Rechte vorbehalten. Nutzung unterliegt Lizenzbedingungen.
 * All rights reserved. Use is subject to license terms.
 *
 * rbe, 04.02.13 09:11
 */

package eu.artofcoding.ventplan.api;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import eu.artofcoding.ventplan.api.vpx.VentplanProject;

import javax.ws.rs.core.MediaType;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.prefs.Preferences;

public class VpxClientImpl implements VpxClient {

    private final URI uri;

    private final DefaultClientConfig clientConfig;

    private final Client client;

    public VpxClientImpl(URI uri) {
        this.uri = uri;
        clientConfig = new DefaultClientConfig();
        client = Client.create(clientConfig);
    }

    @Override
    public URI makeURI(String projectname) throws VpxException {
        try {
            String username = URLEncoder.encode(getUsername(), VpxConstants.UTF8);
            String project = URLEncoder.encode(projectname, VpxConstants.UTF8);
            String format = String.format("%s/%s/project/%s", uri.toString(), username, project);
            return URI.create(format);
        } catch (UnsupportedEncodingException e) {
            throw new VpxException(e);
        }
    }

    @Override
    public String getUsername() {
        Preferences preferences = Preferences.userNodeForPackage(this.getClass());
        String username = preferences.get("username", null);
        if (null == username) {
            String osUsername = System.getProperty("user.name");
            username = String.format("%s-%s", osUsername, UUID.randomUUID());
            preferences.put("username", username);
        } else {
            // Got username through Preferences API 
        }
        return username;
    }

    @Override
    public VentplanProject create(VentplanProject ventplanProject) throws VpxException {
        String projectname = ventplanProject.getProjekt().getBauvorhaben();
        URI uri = makeURI(projectname);
        WebResource webResource = client.resource(uri);
        try {
            VentplanProject response = webResource.accept(MediaType.APPLICATION_XML).put(VentplanProject.class, ventplanProject);
            System.out.printf("create: %s response=%s%n", uri, response);
            return response;
        } catch (ClientHandlerException e) {
            throw new VpxException(e);
        }
    }

    @Override
    public VentplanProject update(VentplanProject ventplanProject) throws VpxException {
        String projectname = ventplanProject.getProjekt().getBauvorhaben();
        URI uri = makeURI(projectname);
        WebResource webResource = client.resource(uri);
        try {
            VentplanProject response = webResource.accept(MediaType.APPLICATION_XML).post(VentplanProject.class, ventplanProject);
            System.out.printf("update: %s response=%s%n", uri, response);
            return response;
        } catch (ClientHandlerException e) {
            throw new VpxException(e);
        }
    }

    @Override
    public VentplanProject delete(VentplanProject ventplanProject) throws VpxException {
        String projectname = ventplanProject.getProjekt().getBauvorhaben();
        URI uri = makeURI(projectname);
        WebResource webResource = client.resource(uri);
        try {
            VentplanProject response = webResource.accept(MediaType.APPLICATION_XML).delete(VentplanProject.class, ventplanProject);
            System.out.printf("delete: %s response=%s%n", uri, response);
            return response;
        } catch (ClientHandlerException e) {
            throw new VpxException(e);
        }
    }

}
