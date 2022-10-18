package php.crm.vtiger.project101.genericUtitlity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class JavaUtility {
	
	public int generateRandomNumber(int limit) {
		Random random =new Random();
		return random.nextInt(limit);
		
	}
	public String fetchDataFromPropertyFile(String key) throws IOException   {
		FileInputStream fis = new FileInputStream("./src/test/resources/PropertyData.Properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

}
