package generaticutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	/*@author shadab khan
	 * Its return value from properties file
	 * This method takes key as an argument 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDatafromProperty(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testdata\\commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
}
