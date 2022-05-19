package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		WebElement stationFrom = driver.findElement(By.id("txtStationFrom"));
		stationFrom.clear();
		stationFrom.sendKeys("MDU");
		stationFrom.sendKeys(Keys.TAB);
		stationFrom.sendKeys(Keys.ENTER);
		WebElement stationTo = driver.findElement(By.id("txtStationTo"));
		stationTo.clear();
		stationTo.sendKeys("TPJ");
		stationTo.sendKeys(Keys.TAB);
		stationTo.sendKeys(Keys.ENTER);
		WebElement CheckBox = driver.findElement(By.id("chkSelectDateOnly"));
		CheckBox.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement elementTable = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody"));
		List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
		WebElement  elementCol = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]//tr"));
		List<WebElement> col = elementCol.findElements(By.tagName("td"));
		
		for(int i=2;i<=rows.size();i++)
	      {
			
	        List<WebElement> allColumnsInRow=driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr["+i+"]/td"));
	         for(int j=0;j< 2;j++)
	         {
	            System.out.print(((WebElement) allColumnsInRow.get(j)).getText()+" ");
	        	// System.out.println(allColumnsInRow.get(j).getText()+ " ");
	         }
	         System.out.println();
	      }
	      System.out.println("==================================");
		 
	
		
		

		
		
		//System.out.println("No of rows are : " + rows.size());
		//System.out.println("No of rows are : " + col.size());
		driver.close();
	}

}
