package demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
		ArrayList<String> temp=new ArrayList();

		List<WebElement> row=driver.findElements(By.xpath("//table//tbody//tr"));
		int overallrowsize=row.size();

		List<WebElement> childTable=driver.findElements(By.xpath("//table//tbody//tr//table//tr"));
		int childrowsize=childTable.size();

		int parentTablerowsize=overallrowsize-childrowsize;


		int columnsize=driver.findElements(By.xpath("//table//tbody//tr[1]//td")).size();
		int childTablecolumnsize=driver.findElements(By.xpath("//table//tbody//table//tr[1]//td")).size();

		int parentTableColSize=columnsize-childTablecolumnsize;


		for(int i=1;i<=parentTablerowsize;i++) {
			for(int j=1;j<=parentTableColSize;j++) {

				boolean flag=false;
				try {
					//normal code
					driver.findElement(By.xpath("(//table//tbody//tr["+i+"]/td)["+j+"]//table")).isDisplayed();
					flag=true;
				}
				catch(Exception e) {
					flag=false;
				}
				
				if(flag==true) {
					//row size
					int rowsize=driver.findElements(By.xpath("(//table//tbody//tr["+i+"]/td)["+j+"]//table//tr")).size();
					int colsize=driver.findElements(By.xpath("(//table//tbody//tr["+i+"]/td)["+j+"]//table//tr[1]//td")).size();



					//col zie

					for(int i1=1;i1<=rowsize;i1++) {
						for(int j1=1;j1<=colsize;j1++) {
							System.out.println(driver.findElement(By.xpath("(//table//tbody//tr[2]/td)[2]//table//tr["+i1+"]//td["+j1+"]")).getText());
						}
					}
				}


				else {
					System.out.println(driver.findElement(By.xpath("(//table//tbody//tr["+i+"]/td)["+j+"]")).getText());	
				}



			}
		}

		//(//table//tbody//tr[2]/td)[2]

		//		for(int i=1;i<=rowsize;i++)
		//		{
		//			List<WebElement> col=row.get(i).findElements(By.tagName("td"));
		//			int colsize=col.size();
		//			
		//		
		//			for(int j=1;j<=colsize;j++)
		//			{
		//				String celltext=col.get(j).getText();
		//				temp.add(celltext);
		//				
		//			}
		//		}
		for(String s:temp)
		{
			System.out.println(s);
		}
	}



}