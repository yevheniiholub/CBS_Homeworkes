package Serialization_XML_and_JSON.Task_3;

/*
    Задание 3
    Создайте класс, используя SAXParser, в котором опишите иерархию XML файла.
    Необходимо, чтобы проект создавал XML файл и строил дерево (город, название улицы, дом).
    В городе используйте аттрибут(например, <city size=”big>Kiev</city>).
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Main {

    public static void generateXML(String filePath){
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = documentBuilderFactory.newDocumentBuilder();
            Document document = db.newDocument();

            Element rootElem = document.createElement("City");
            rootElem.setAttribute("Size", "big");
            rootElem.setTextContent("Kyiv");
            document.appendChild(rootElem);

            Element street1 = document.createElement("Street_name");
            street1.setTextContent("Vasylkivska");
            rootElem.appendChild(street1);

            Element streetNumber1 = document.createElement("Street_number");
            streetNumber1.setTextContent("1");
            street1.appendChild(streetNumber1);

            Element streetNumber2 = document.createElement("Street_number");
            streetNumber2.setTextContent("2");
            street1.appendChild(streetNumber2);

            Element streetNumber3 = document.createElement("Street_number");
            streetNumber3.setTextContent("3");
            street1.appendChild(streetNumber3);

            Element street2 = document.createElement("Street_name");
            street2.setTextContent("Darnytska");
            rootElem.appendChild(street2);

            Element streetNumber4 = document.createElement("Street_number");
            streetNumber4.setTextContent("1");
            street2.appendChild(streetNumber4);

            Element streetNumber5 = document.createElement("Street_number");
            streetNumber5.setTextContent("2");
            street2.appendChild(streetNumber5);

            Element streetNumber6 = document.createElement("Street_number");
            streetNumber6.setTextContent("3");
            street2.appendChild(streetNumber6);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult res = new StreamResult(new File(filePath));
            transformer.transform(source, res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static City parseXMLBySAX(String filePath){
        City resCity = new City();
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            // Здесь мы определили анонимный класс, расширяющий класс DefaultHandler
            DefaultHandler handler = new DefaultHandler() {
                boolean cityName;
                boolean streetName;
                boolean streetNumber;
                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("City")) {
                        cityName = true;
                    }
                    if (qName.equalsIgnoreCase("Street_name")) {
                        streetName = true;
                    }
                    if (qName.equalsIgnoreCase("Street_number")) {
                        streetNumber = true;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (cityName) {
                        resCity.setCityName(new String(ch, start, length));
                        cityName = false;
                    }
                    if (streetName) {
                        resCity.getStreets().add(new Street());
                        resCity.getStreets().get(resCity.getStreets().size() - 1).setStreetName(new String(ch, start, length));
                        streetName = false;
                    }
                    if (streetNumber) {
                        resCity.getStreets().get(resCity.getStreets().size() - 1).getStreetNumbers().add(Integer.parseInt(new String(ch, start, length)));
                        streetNumber = false;
                    }
                }
            };
            saxParser.parse(filePath, handler);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resCity;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\G33kk0N\\IdeaProjects\\CBS_Homeworkes\\Serialization_XML_and_JSON\\Task_3\\City.xml";
        generateXML(filePath);
        City parsedCity = parseXMLBySAX(filePath);
        System.out.println(parsedCity);
        // Out :City{cityName='Kyiv', streets=[Street{streetName='Vasylkivska', streetNumbers=[1, 2, 3]}, Street{streetName='Darnytska', streetNumbers=[1, 2, 3]}]}
    }
}
