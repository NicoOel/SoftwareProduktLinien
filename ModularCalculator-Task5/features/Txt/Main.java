import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Main {
		
	public static void init() {
		original();
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
	
	public static void log(String calculation, float c) {
		String msg = "New result using " + calculation + ": " + c;
		LOGGERT.info(msg);
	}
}