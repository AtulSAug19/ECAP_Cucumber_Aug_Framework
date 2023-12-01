package ulility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	public Properties init_Properties() {
		prop = new Properties();
		try {
			File file = new File("./src/test/resources/config/config.properties");
			FileInputStream fileInput = new FileInputStream(file);
			prop.load(fileInput);
		} catch (IOException i) {
			System.out.println("Exception occured in reading proeprties file :" + i.getMessage());
		}
		return prop;
	}

}
