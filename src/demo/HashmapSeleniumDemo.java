package demo;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashmapSeleniumDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.way2automation.com/angularjs-protractor/webtables/ ");
	driver.manage().window().maximize();
	
	HashMap<String, String> map=new HashMap<String, String>();
	int tablecolsize=driver.findElements(By.xpath("//table/thead//th")).size();
	
	for(int i=1;i<=tablecolsize;i++) {
		
		boolean flag=true;
		try {
			driver.findElement(By.xpath("//table/thead//th["+i+"]//span"));
		}
		catch(Exception e) {
			flag=false;
		}
		
		if(flag==true) {
			String header=driver.findElement(By.xpath("//table/thead//th["+i+"]//span")).getText();
			String colVal=driver.findElement(By.xpath("//table[@table-title='Smart Table example']//tbody//tr[1]//td["+i+"]")).getText();
			
			map.put(header, colVal);
		}
		
		
	}
	
//	for(int j=0;j<=map.size();j++) {
//		System.out.println(map.get(j));
//	}
	
	System.out.println(map.get("First Name"));
	System.out.println(map.get("Last Name"));
	
}
}
