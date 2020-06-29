import java.io.BufferedReader;
import java.io.FileReader;

public class TxtConf implements interfaces.Configuration{

	boolean roundToInteger = false;
		
	public void loadConfig() {
		

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
			roundToInteger = true;
		}
	
	}

	public float applyConf(float a) {
		if(roundToInteger) {
			return Math.round(a);
		}
		return a;
	}

}
