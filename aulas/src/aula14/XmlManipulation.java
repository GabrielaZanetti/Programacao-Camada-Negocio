package aula14;

import aula14.model.Address;
import aula14.model.Customer;
import aula14.model.Phone;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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
        
       String xmlContentStr = XmlHandler.xmlDocToString(xmlDoc);
//        System.out.println(xmlContentStr);

        String filePath = "src/aula14/xml_files/customer.xml"; 
//        XmlHandler.xmlDocToFile(xmlDoc, filePath);
        
        Document docXmlRead = XmlHandler.readXml(filePath);
//        System.out.println("Imprimir XML lido!");
//        System.out.println(XmlHandler.xmlDocToString(docXmlRead));
        
        Document xmlD = XmlHandler.xmlToString(xmlContentStr);
//        System.out.println(XmlHandler.xmlDocToString(xmlDoc)); doc para string e imprime

        NodeList nodeList = docXmlRead.getElementsByTagName("customer");
        int size = nodeList.getLength();
//        System.out.println("Tamanho: " + size);
        
        Node node = nodeList.item(0);
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element customerElement = (Element) node;
            
            Node idNode = customerElement.getElementsByTagName("id").item(0);
            System.out.println(idNode.getNodeName());
            System.out.println(idNode.getTextContent());
            
            Node iphoneNode = customerElement.getElementsByTagName("phone").item(0);
            System.out.println(iphoneNode.getAttributes().item(0).getNodeValue());
        }
    }
}
