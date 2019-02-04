/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlecalendar;

/**
 *
 * @author jedda_ibrahim
 */
import java.io.IOException;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Parser {

    private List Siti;

    public Parser() {
        Siti = new ArrayList();
    }

    public List parseDocument(String filename)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        String sito;
        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();
        // generazione della lista degli elementi "libro"
        nodelist = root.getElementsByTagName("td");
        if (nodelist != null && nodelist.getLength() > 0) {
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element) nodelist.item(i);
                sito = getLink(element);
                Siti.add(sito);
            }
        }
        return Siti;
    }
  
    public String getLink(Element element)
    {
       return element.getAttribute("colspan");
    }
}