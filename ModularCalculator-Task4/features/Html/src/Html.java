import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



public class Html implements interfaces.Logging{

	final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public void init() {
		FileHandler html;  
		try {  
	        html = new FileHandler("CalculatorLog.html");
			LOGGER.addHandler(html);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        html.setFormatter(formatter);  

	        LOGGER.info("Initialized html Logger");  

	    } catch (Exception e) {  
	        e.printStackTrace();  
	    }
	}

	public void message(String msg) {
		LOGGER.info(msg);
	}
	

}
