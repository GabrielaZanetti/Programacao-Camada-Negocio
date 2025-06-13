package aula14;

import aula14.model.Customer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author gabriela.zanetti
 */
public class XmlHandler {

    public static Document createEmptyXmlDocument() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            return db.newDocument();
        } catch (ParserConfigurationException ex) {
            System.out.println("erro: " + ex.getMessage());
            return null;
        }
    }

    public static void customerToXmlDocument(Document xmlDoc, Customer customer) {
        Element customerElement = xmlDoc.createElement("customer");
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
        Element addressZipCode = xmlDoc.createElement("zipcode");

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
        addressNumber.setTextContent(String.valueOf(customer.getAddress().getNumber()));
        addressDistrict.setTextContent(customer.getAddress().getDistrict());
        addressCity.setTextContent(customer.getAddress().getCity());
        addressState.setTextContent(customer.getAddress().getState());
        addressZipCode.setTextContent(customer.getAddress().getZipCode());
    }

    public static String xmlDocToString(Document xmlDoc) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            StreamResult streamResult = new StreamResult(outputStream);
            DOMSource domSource = new DOMSource(xmlDoc);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(domSource, streamResult);
            return outputStream.toString();
        } catch (TransformerException ex) {
            System.out.println("erro: " + ex.getMessage());
            return null;
        }
    }

    public static void xmlDocToFile(Document xmlDoc, String filePath) {
        try {
            File file = new File(filePath);
            StreamResult streamResult = new StreamResult(file);
            DOMSource domSource = new DOMSource(xmlDoc);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(domSource, streamResult);
        } catch (TransformerException ex) {
            System.out.println("erro: " + ex.getMessage());
        }
    }
}
