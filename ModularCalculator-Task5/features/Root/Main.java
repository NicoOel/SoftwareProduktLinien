
public class Main {
	
	public static void calculate(float a, float b) {
		original(a, b);
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
}