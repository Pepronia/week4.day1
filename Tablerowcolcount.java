package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tablerowcolcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		int row_size = findElements.size();
		System.out.println(row_size);
		List<WebElement> findElements2 = driver.findElements(By.xpath("//table[@class='attributes-list']//tr/th"));
		int col_size = findElements2.size();
		System.out.println(col_size);
		
		
	}

}
