package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	//data type if properties, and golobal veriable is prop
	Properties prop;
	
	
//constructor: bares the name of its own name
	public ConfigDataProvider() {
		
		
		File src = new File("./Config/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			  prop = new Properties();
			  prop.load(fis);
		} catch (Exception e) {
			System.out.println("unable to read config");
		}
	
	}
	
	public String getBrowser() {
		  return prop.getProperty("browser");
		 }
		
	public String getUrl() {
		  return prop.getProperty("url");
		 }

		
	}
	
	
	
	

	
	
	

