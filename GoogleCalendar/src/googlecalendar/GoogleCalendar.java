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
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
public class GoogleCalendar {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        List libri = null;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("inserisci file");
        
        String percroso=reader.next();
        
        Parser dom = new Parser();
        
        try
        {
            libri = dom.parseDocument(percroso);
            
            System.out.println("Numero di siti: " + libri.size());
            
            for(int i=0;i<libri.size();i++)
            {
                System.out.println(i+" "+libri.get(i).toString());
            }
        } 
        
        catch (ParserConfigurationException | SAXException | IOException exception)
        {
            System.out.println("Errore!");
        }
  

    }
    
}
