
public class Main {
	
	public static void calculate(float a, float b) {
		original(a, b);
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
}