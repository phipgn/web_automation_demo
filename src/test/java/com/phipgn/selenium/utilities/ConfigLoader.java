package com.phipgn.selenium.utilities;

import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
	private static final String PROP_FILE = "/application.properties";
	
	private ConfigLoader() {}
	
	public static String getConfig(String key) {
		Properties props = new Properties();
		try {
			props.load(ConfigLoader.class.getResourceAsStream(PROP_FILE));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String config = "";
		if (key != null)
			config = props.getProperty(key);
		return config;
	}
	
	
}
