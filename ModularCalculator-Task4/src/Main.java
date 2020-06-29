
import java.util.List;

import interfaces.Calculation;
import interfaces.Configuration;
import interfaces.Logging;
import loader.PluginLoader;


public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		List<Calculation> calcs = PluginLoader.load(Calculation.class);
		List<Logging> logger = PluginLoader.load(Logging.class);
		List<Configuration> conf = PluginLoader.load(Configuration.class);
		
		for (Configuration cf : conf) {
			cf.loadConfig();
		}
		
		for (Logging lg : logger) {
			lg.init();
		}
		
		if(calcs.isEmpty()) {
			
		}
		
		float[][] res = new float[10][3];
		float[][] resConf = new float[10][2];
		
		for (int i=0; i<calcs.size(); i++) {
			Calculation cl = calcs.get(i);
			res[i][0] = 3;
			res[i][1] = 2;
			res[i][2] = cl.calculate(res[i][0], res[i][1]);
			
			for (Logging lg : logger) {
				String s = ("New Calculation using " + cl.getClass().descriptorString() + ", result is: " + res[i][2]);
				lg.message(s);
			}
			
		}
		
		for (int i=0; i<calcs.size(); i++) {
			for (int j=0; j<conf.size();j++) {
				Configuration cf = conf.get(j);
				resConf[i][j]=cf.applyConf(res[i][2]);
				
				for (Logging lg : logger) {
					String s = ("Used Configuration " + cf.getClass().descriptorString() + ", result is: " + resConf[i][j]);
					lg.message(s);
				}
			}
		}
	}
	
}
