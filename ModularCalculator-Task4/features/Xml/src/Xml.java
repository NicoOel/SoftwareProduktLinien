import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class Xml implements interfaces.Configuration{

	boolean roundToInteger = false;
	
	public void loadConfig() {
		
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
				roundToInteger = true;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
        
	}

	public float applyConf(float a) {
		if(roundToInteger) {
			return Math.round(a);
		}
		return a;	
	}

	
}
