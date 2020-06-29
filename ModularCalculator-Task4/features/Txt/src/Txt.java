import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Txt implements interfaces.Logging{

	final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public void init() {
		FileHandler txt;  
		try {  
	        txt = new FileHandler("CalculatorLog.txt");
			LOGGER.addHandler(txt);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        txt.setFormatter(formatter);  

	        LOGGER.info("Initialized txt Logger");  

	    } catch (Exception e) {  
	        e.printStackTrace();  
	    }		
	}

	public void message(String msg) {
		LOGGER.info(msg);		
	}

}
