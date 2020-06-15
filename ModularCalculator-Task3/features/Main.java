import java.util.logging.*;

public class Main {
 
	public static void main(String[] args) {
		
		// initializing Logger
		final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
		/*if[Html]*/ FileHandler html;  
		try {  
	        html = new FileHandler("CalculatorLog.html");
			LOGGER.addHandler(html);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        html.setFormatter(formatter);  

	        LOGGER.info("Initialized html Logger");  

	    } catch (Exception e) {  
	        e.printStackTrace();  
	    } /*end[Html]*/

		/*if[Txt]*/ FileHandler txt;  
		try {  
	        txt = new FileHandler("CalculatorLog.txt");
			LOGGER.addHandler(txt);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        txt.setFormatter(formatter);  

	        LOGGER.info("Initialized txt Logger");  

	    } catch (Exception e) {  
	        e.printStackTrace();  
	    } /*end[txt]*/
	    		
		float in1=0, in2=0, out1=0;
		
		// getting  input
		try {
			in1 = 12;
			in2 = 10;
			out1 = 0;
		} catch (Exception e) {
			LOGGER.info("Error regarding input: " + e.getMessage());
		}
		
		
		// calculating
		/*if[Addition]*/ try{out1 = in1 + in2;
	 		System.out.println("Used Addition, result = " + out1); 
	 		LOGGER.info("Used Addition, result = " + out1);
		} catch(Exception e) {
			LOGGER.info("Error regarding addition: " + e.getMessage());
		}/*end[Addition]*/
		
		
	 	/*if[Root]*/ try {out1 = (float) Math.sqrt(in1);
	 		System.out.println("Used Root, result = " + out1); 
	 		LOGGER.info("Used Root, result = " + out1);
	 	} catch(Exception e) {
	 		LOGGER.info("Error calculating the root: " + e.getMessage());
	 	} /*end[Root]*/
 
	}

}
