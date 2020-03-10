package com.hhuda.dpj.afactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class JavaAbstractFactoryPatterns {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory abstractFactory=DocumentBuilderFactory.newInstance();

        DocumentBuilder factory=abstractFactory.newDocumentBuilder();

        Document doc=factory.parse(new ByteArrayInputStream("<body>test</body>".getBytes()));
        System.out.println(doc);
        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());
    }
}
