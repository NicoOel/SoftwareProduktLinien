import java.util.logging.Logger;

public class Main {
	
	static float add, sub, mul, div, root, powe=0;
	static boolean addb, subb, mulb, divb, rootb, poweb = false;
	final static Logger LOGGERH = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	final static Logger LOGGERT = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	static boolean roundToIntegerXml = false;
	static boolean xmlIsSet = false;
	static boolean roundToIntegerTxt = false;
	static boolean txtIsSet = false;
	
	public static void init() {
		
	}
	
	public void loadConfig() {
		
	}
	
	public static void calculate(float a, float b) {
		
	}
	
	
	public static void log(String calculation, float c) {
		
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