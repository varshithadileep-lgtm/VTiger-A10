package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtilityFB {

	public String GetDataFromProperties(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\TestData1.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}
