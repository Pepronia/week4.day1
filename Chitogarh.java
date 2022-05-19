package week4.day1;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chitogarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/newportal/stock-nse-bulk-deals.asp')]")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody/tr"));
	     HashMap<Integer,String> hMap = new HashMap<Integer,String>();
		for(int i=2;i<=rows.size();i++)
	      {
			
	        List<WebElement> allColumnsInRow=driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody/tr["+i+"]/td"));
	         for(int j=2;j< 3;j++)
	         {
	        	  System.out.print(((WebElement) allColumnsInRow.get(j)).getText()+" ");
	        	if(!(hMap.containsValue(allColumnsInRow.get(j).getText())))
	        	{
	        		hMap.put(j,allColumnsInRow.get(j).getText());
	        	}
	        	else
	        	{
	        		System.out.println("Duplicate value in the List " + allColumnsInRow.get(j).getText() + " ");
	        	}
	        	 
	          
	           // System.out.println("=================");
	        	// System.out.println(allColumnsInRow.get(j).getText()+ " ");
	       
	           
	         }
	         
	         
	      }
		
		
		driver.close();
	}

}


