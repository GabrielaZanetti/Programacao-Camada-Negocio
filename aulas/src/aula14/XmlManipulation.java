package aula14;

import aula14.model.Address;
import aula14.model.Customer;
import aula14.model.Phone;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author gabriela.zanetti
 */
public class XmlManipulation {

    public static void main(String[] args) throws ParserConfigurationException {
        Phone phone = new Phone("Residencial", "55999999999");
        Address address = new Address("Av. do Comercio", 23, "Centro", "Ijui", "RS", "98700000");
        Customer customer = new Customer(1, "Mariana", "mariana@gmail.com", phone, address);
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document xmlDoc = db.newDocument();
        
        Element customerElement = xmlDoc.createElement("costumer"); 
        xmlDoc.appendChild(customerElement);
        
        Element idElement = xmlDoc.createElement("id");
        Element nameElement = xmlDoc.createElement("name");
        Element emailElement = xmlDoc.createElement("email");
        Element phoneElement = xmlDoc.createElement("phone");
        Element addressElement = xmlDoc.createElement("address");
                
        customerElement.appendChild(idElement);
        customerElement.appendChild(nameElement);
        customerElement.appendChild(emailElement);
        customerElement.appendChild(phoneElement);
        customerElement.appendChild(addressElement);
        
        Element addressStreet = xmlDoc.createElement("street");
        Element addressNumber = xmlDoc.createElement("number");
        Element addressDistrict = xmlDoc.createElement("district");
        Element addressCity = xmlDoc.createElement("city");
        Element addressState = xmlDoc.createElement("state");
        Element addressZipCode = xmlDoc.createElement("zipCode");
        
        addressElement.appendChild(addressStreet);
        addressElement.appendChild(addressNumber);
        addressElement.appendChild(addressDistrict);
        addressElement.appendChild(addressCity);
        addressElement.appendChild(addressState);
        addressElement.appendChild(addressZipCode);
        
        phoneElement.setAttribute("type", customer.getPhone().getType());
        phoneElement.setTextContent(customer.getPhone().getNumber());
        
        idElement.setTextContent(customer.getId().toString());
        nameElement.setTextContent(customer.getName());
        emailElement.setTextContent(customer.getEmail());
        
        addressStreet.setTextContent(customer.getAddress().getStreet());
        addressNumber.setTextContent(Integer.toString(customer.getAddress().getNumber()));
        addressDistrict.setTextContent(customer.getAddress().getDistrict());
        addressCity.setTextContent(customer.getAddress().getCity());
        addressState.setTextContent(customer.getAddress().getState());
        addressZipCode.setTextContent(customer.getAddress().getZipCode());
    }

}
