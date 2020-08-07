package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class ReadPropertiesFiles {
public static void main(String[] args)  {
	try {
		FileReader reader=new FileReader("config.properties");
		Properties props=new Properties();
		props.load(reader);
		
		System.out.println(props.get("firstName"));
		System.out.println(props.get("lastName"));
		
		System.out.println(getDataFromPropsFile("firstName"));
		
		//type(By.xpath,getDataFromPropsFile("firstName"));
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
}

public static String getDataFromPropsFile(String key) {
	try {
		FileReader reader=new FileReader("config.properties");
		Properties props=new Properties();
		props.load(reader);
		return props.get(key).toString();
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
}

}
