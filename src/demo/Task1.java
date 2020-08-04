package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/ ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("test11");
         driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("test111");
         driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("testing");
//        WebElement rbtn= driver.findElement(By.xpath("//td[@class='ng-scope ng-binding'][contains(text(),'Customer')]"));
//        rbtn.click();
//         System.out.println(rbtn.isSelected()); 
        
        driver.findElement(By.xpath("//label[text()='Company BBB']/input")).click();
        driver.findElement(By.xpath("//label[text()='Company AAA']/input")).click();
        
       
         Select select= new Select(driver.findElement(By.name("RoleId")));
         select.selectByIndex(0);
         select.selectByValue("0");
         select.deselectByVisibleText("Sales Team");
	}

}