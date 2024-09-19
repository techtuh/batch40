package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
 
	public String getConfig(String value) throws IOException {
		
		String filepath = "config.properties";
		
		FileInputStream fis = new FileInputStream(filepath);
		Properties ps = new Properties();
		ps.load(fis);
		
	String	EachValue = ps.getProperty(value).toString();
		return EachValue;
	}
	
	public static void main(String[] args) throws IOException {
		
		BaseConfig bs = new BaseConfig();
		System.out.println(bs.getConfig("PASS"));
		
	}
}
