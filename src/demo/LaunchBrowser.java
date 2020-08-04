package demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class LaunchBrowser {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium-Demo\\Selenium-Demo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
		
		
		ArrayList<String> temp=new ArrayList<String>();
		
		int rowsize=driver.findElements(By.xpath("//table[@table-title='Smart Table example']//tbody//tr")).size();
		int columnSize=driver.findElements(By.xpath("//table[@table-title='Smart Table example']//tbody//tr[1]//td")).size();
	
		
		for(int j=1;j<=rowsize;j++) {
			
			for(int i=1;i<=columnSize;i++) {
				temp.add(driver.findElement(By.xpath("//table[@table-title='Smart Table example']//tbody//tr["+j+"]//td["+i+"]")).getText());
			}
	    }
		
		for(String s:temp) {
			System.out.println(s);
		}
			
		
		
	}
}
