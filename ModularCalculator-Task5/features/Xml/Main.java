import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {
	
public void loadConfig() {
		original();
		
		try {
			File fXmlFile = new File("conf.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("conf");
			Node nNode = nList.item(0);
			Element eElement = (Element) nNode;
			String inputS = eElement.getElementsByTagName("value").item(0).getTextContent();
			
			if(inputS.contentEquals("true")) {
				roundToIntegerXml = true;
			}
			xmlIsSet = true;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
        
	}
	
}