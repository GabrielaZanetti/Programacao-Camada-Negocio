package aula14;

import aula14.model.Address;
import aula14.model.Customer;
import aula14.model.Phone;
import org.w3c.dom.Document;

/**
 *
 * @author gabriela.zanetti
 */
public class XmlManipulation {

    public static void main(String[] args) {
        Phone phone = new Phone("Residencial", "55999999999");
        Address address = new Address("Av. do Comercio", 23, "Centro", "Ijui", "RS", "98700000");
        Customer customer = new Customer(1, "Mariana", "mariana@gmail.com", phone, address);
        
        Document xmlDoc = XmlHandler.createEmptyXmlDocument();
                
        XmlHandler.customerToXmlDocument(xmlDoc, customer);
        
        XmlHandler.xmlDocToString(xmlDoc);
    }
}
