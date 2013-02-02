/*
 * ventplan-server
 * ventplan-api
 * Copyright (C) 2011-2013 art of coding UG, http://www.art-of-coding.eu/
 *
 * Alle Rechte vorbehalten. Nutzung unterliegt Lizenzbedingungen.
 * All rights reserved. Use is subject to license terms.
 *
 * rbe, 02.01.13 18:43
 */

package com.ventplan.model;

import com.ventplan.model.vpx.VentplanProject;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class VpxHelper {

    public static VentplanProject unmarshal(File file) throws VpxException {
        VentplanProject ventplanProject;
        try {
            // create a JAXBContext capable of handling classes generated into package
            JAXBContext jaxbContext = JAXBContext.newInstance("com.ventplan.model.vpx");
            // create an Unmarshaller
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            // unmarshal an instance document into a tree of Java content
            // objects composed of classes from the package.
            ventplanProject = (VentplanProject) unmarshaller.unmarshal(new FileInputStream(file));
        } catch (IOException e) {
            throw new VpxException(e);
        } catch (JAXBException e) {
            throw new VpxException(e);
        }
        return ventplanProject;
    }

    public static void marshal(VentplanProject objectToMarshal, File file) throws VpxException {
        try {
            // create a JAXBContext capable of handling classes generated into package
            JAXBContext jaxbContext = JAXBContext.newInstance("com.ventplan.model.vpx");
            // create a Marshaller and do marshal
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(objectToMarshal, new FileOutputStream(file));
        } catch (FileNotFoundException e) {
            throw new VpxException(e);
        } catch (JAXBException e) {
            throw new VpxException(e);
        }
    }

}
