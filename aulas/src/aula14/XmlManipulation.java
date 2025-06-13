package aula14;

import aula14.model.Address;
import aula14.model.Customer;
import aula14.model.Phone;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author gabriela.zanetti
 */
public class XmlManipulation {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Phone phone = new Phone("Residencial", "55999999999");
        Address address = new Address("Av. do Comercio", 23, "Centro", "Ijui", "RS", "98700000");
        Customer customer = new Customer(1, "Mariana", "mariana@gmail.com", phone, address);
        
        Document xmlDoc = XmlHandler.createEmptyXmlDocument();
                
        XmlHandler.customerToXmlDocument(xmlDoc, customer);
        
       String xmlContent = XmlHandler.xmlDocToString(xmlDoc);
//        System.out.println(xmlContent);

        String filePath = "src/aula14/xml_files/customer.xml"; 
//        XmlHandler.xmlDocToFile(xmlDoc, filePath);
        
        Document docXmlRead = XmlHandler.readXml(filePath);
        
        System.out.println("Imprimir XML lido!");
        System.out.println(XmlHandler.xmlDocToString(docXmlRead));
    }
}
