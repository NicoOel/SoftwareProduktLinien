
import java.util.logging.Logger; import java.util.logging.FileHandler; 
import java.util.logging.SimpleFormatter; import java.io.BufferedReader; 
import java.io.FileReader; import java.io.File; 

import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory; 

import org.w3c.dom.Document; 
import org.w3c.dom.Element; 
import org.w3c.dom.Node; 
import org.w3c.dom.NodeList; 

public   class  Main {
	
	
	static float add, sub, mul, div, root, powe=0;

	
	static boolean addb, subb, mulb, divb, rootb, poweb = false;

	
	final static Logger LOGGERH = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	
	final static Logger LOGGERT = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	
	static boolean roundToIntegerXml = false;

	
	static boolean xmlIsSet = false;

	
	static boolean roundToIntegerTxt = false;

	
	static boolean txtIsSet = false;

	
	
	 private static void  init__wrappee__BaseCalculator  () {
		
	}

	
		
	 private static void  init__wrappee__Html  () {
		init__wrappee__BaseCalculator();
		FileHandler html;  
		try {  
	        html = new FileHandler("CalculatorLog.html");
			LOGGERH.addHandler(html);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        html.setFormatter(formatter);  

	        LOGGERH.info("Initialized html Logger");  

	    } catch (Exception e) {  
	        e.printStackTrace();  
	    }
	}

	
		
	public static void init() {
		init__wrappee__Html();
		FileHandler txt;  
		try {  
	        txt = new FileHandler("CalculatorLog.txt");
			LOGGERT.addHandler(txt);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        txt.setFormatter(formatter);  

	        LOGGERT.info("Initialized txt Logger");  

	    } catch (Exception e) {  
	        e.printStackTrace();  
	    }	
	}

	
	
	 private void  loadConfig__wrappee__BaseCalculator  () {
		
	}

	
	
	 private void  loadConfig__wrappee__TxtConf  () {
		loadConfig__wrappee__BaseCalculator();
		
		String[] inputarray = new String[2];
		
		try {
			FileReader input = new FileReader("conf.txt");
			BufferedReader bufRead = new BufferedReader(input);
			String myLine = null;
			
			while ( (myLine = bufRead.readLine()) != null)
			{    
			    inputarray = myLine.split(":");
			}
			bufRead.close();

			} catch(Exception e) {
				e.printStackTrace();
			}
		
		if (inputarray[0].contentEquals("roundToInteger") && inputarray[1].contentEquals("true")) {
			roundToIntegerTxt = true;
		}
		txtIsSet = true;
		
	}

	
	
public void loadConfig() {
		loadConfig__wrappee__TxtConf();
		
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

	
	
	 private static void  calculate__wrappee__BaseCalculator  (float a, float b) {
		
	}

	
	
	 private static void  calculate__wrappee__Addition  (float a, float b) {
		calculate__wrappee__BaseCalculator(a, b);
		float c = a+b;
		
		if(xmlIsSet) {
			if(roundToIntegerXml) {
				c = Math.round(c);
			}
		} else if(txtIsSet) {
			if(roundToIntegerTxt) {
				c = Math.round(c);
			}
		}
		
		add = c;
		addb = true;
	}

	
	
	 private static void  calculate__wrappee__Substraction  (float a, float b) {
		calculate__wrappee__Addition(a, b);
		float c = a-b;
		
		if(xmlIsSet) {
			if(roundToIntegerXml) {
				c = Math.round(c);
			}
		} else if(txtIsSet) {
			if(roundToIntegerTxt) {
				c = Math.round(c);
			}
		}
		
		sub = c;
		subb = true;
	}

	
	
	 private static void  calculate__wrappee__Multtiplication  (float a, float b) {
		calculate__wrappee__Substraction(a, b);
		float c = a*b;
		
		if(xmlIsSet) {
			if(roundToIntegerXml) {
				c = Math.round(c);
			}
		} else if(txtIsSet) {
			if(roundToIntegerTxt) {
				c = Math.round(c);
			}
		}
		
		mul = c;
		mulb = true;
	}

	
	
	 private static void  calculate__wrappee__Division  (float a, float b) {
		calculate__wrappee__Multtiplication(a, b);
		float c = a/b;
		
		if(xmlIsSet) {
			if(roundToIntegerXml) {
				c = Math.round(c);
			}
		} else if(txtIsSet) {
			if(roundToIntegerTxt) {
				c = Math.round(c);
			}
		}
		
		div = c;
		divb = true;
	}

	
	
	 private static void  calculate__wrappee__Root  (float a, float b) {
		calculate__wrappee__Division(a, b);
		float c = (float) Math.sqrt(a);
		
		if(xmlIsSet) {
			if(roundToIntegerXml) {
				c = Math.round(c);
			}
		} else if(txtIsSet) {
			if(roundToIntegerTxt) {
				c = Math.round(c);
			}
		}
		
		root = c;
		rootb = true;
	}

	
	
	public static void calculate(float a, float b) {
		calculate__wrappee__Root(a, b);
		float c = a*a;
		
		if(xmlIsSet) {
			if(roundToIntegerXml) {
				c = Math.round(c);
			}
		} else if(txtIsSet) {
			if(roundToIntegerTxt) {
				c = Math.round(c);
			}
		}
		
		powe = c;
		poweb = true;
	}

	
	
	public static void log  (String calculation, float c) {
		String msg = "New result using " + calculation + ": " + c;
		LOGGERT.info(msg);
	}

	
	
	
	
	public static void main(String[] args) {
		
		//init Logging
		new Main().init();
		
		//load config
		new Main().loadConfig();
		
		if(xmlIsSet && txtIsSet) {
			System.out.println("Detected both xml and txt configuration, xml will be prioritized");
		}
		
		
		float a = 10;
		float b = 5;
		
		//calculation
		new Main().calculate(a, b);
				
		//Logging add
		if(addb) {
			new Main().log("Addition", add);
		}
		
		//Logging root
		if(rootb) {
			new Main().log("Root", root);
		}
		
		//Logging power
		if(poweb) {
			new Main().log("Power", powe);
		}
		//Logging sub
		if(subb) {
			new Main().log("Substraction", sub);
		}
		//Logging mul
		if(mulb) {
			new Main().log("Multiplication", mul);
		}
		//Logging div
		if(divb) {
			new Main().log("Division", div);
		}
		
	}


}
