package create_Deal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Base_Class {

		public static WebDriver driver; //Global Variable
		  
		@BeforeClass
		  public void browserSetup() throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver", 
					  "C:\\Workspace\\WeWork_Automation\\Drivers\\chromedriver.exe"); //Initiate browser
					  driver = new ChromeDriver();
					  driver.manage().window().maximize();
			  driver.get("https://wework.5dtesting.com/deal");
			  Thread.sleep(10000);
		  }
		  
		  @AfterClass
		  public void tearDown() { 
		driver.quit();
	}
	}
