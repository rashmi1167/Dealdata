package create_Deal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Area_Statement extends Deal_Information {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebElement building_Name = driver.findElement(By.id("TextField31"));
		  building_Name.sendKeys("Icon tower");
		  Thread.sleep(1000);

	}

}
