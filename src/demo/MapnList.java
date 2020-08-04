package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MapnList {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.way2automation.com/angularjs-protractor/webtables/ ");
	driver.manage().window().maximize();
	
	int rowSize=driver.findElements(By.xpath("//table[@table-title='Smart Table example']//tbody//tr")).size();
	int colSize=driver.findElements(By.xpath("//table[@table-title='Smart Table example']//thead//tr//th")).size();
	
	List<String> li=new ArrayList<String>();
	
	Map<Integer, List<String>> map=new HashMap<Integer, List<String>>();
	
	for(int rowNumber=1;rowNumber<=rowSize;rowNumber++) {
		for(int colNumber=1;colNumber<=colSize;colNumber++) {
			boolean flag=true;
			try {
				driver.findElement(By.xpath("//table[@table-title='Smart Table example']//tbody//tr["+rowNumber+"]//td["+colNumber+"]"));
			}catch(Exception e) {
				flag=false;
			}
			
			if(flag) {
				li.add(driver.findElement(By.xpath("//table[@table-title='Smart Table example']//tbody//tr["+rowNumber+"]//td["+colNumber+"]")).getText());
			}
		}
		
		
		map.put(rowNumber, li);
		li=new ArrayList<String>();
	}
	
	
	System.out.println(map);
	
	System.out.println(map.get(1));
}
}
