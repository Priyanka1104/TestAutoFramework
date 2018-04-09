package com.ebay.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/********************************************************************
 * Class Name: PropertyReader
 * Generated : 07 April 2018
 * Description: This class holds the various functions related to Properties file.
 * Author : Priyanka
 *******************************************************************/
public class PropertyReader {
	Properties properties = new Properties();
	InputStream inputStream = null;

	public PropertyReader() {
		loadProperties();
	}
 /********************************************************************
 * Function Name: loadProperties
 * Generated : 07 April 2018
 * Description: This method is for loading Key Value pair from config.properties file.
 * Return type : boolean
 * Author : Priyanka
 *******************************************************************/
 
	private void loadProperties() {
		try {
			inputStream = new FileInputStream("src/config.properties");
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String readProperty(String key) {
		return properties.getProperty(key);
	}
}
