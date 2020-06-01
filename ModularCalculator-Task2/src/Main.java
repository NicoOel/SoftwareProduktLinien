import properties.PropertyManager;

public class Main {

	public static void main(String[] args) {
		
		float in1 = 12;
		float in2 = 10;
		float out1 = 0;
		
		if (PropertyManager.getProperty("Addition")) {
			out1 = in1 + in2;
			System.out.println("Used Addition, result = " + out1);
		}
		
		if (PropertyManager.getProperty("Root")) {
			out1 = (float) Math.sqrt(in1);
			System.out.println("Used Root, result = " + out1);
		}

	}

}
