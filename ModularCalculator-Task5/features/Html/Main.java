import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
		
	public static void init() {
		original();
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
	
	public static void log(String calculation, float c) {
		String msg = "New result using " + calculation + ": " + c;
		LOGGERH.info(msg);
	}
}