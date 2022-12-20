package create_Deal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Deal_Information extends Base_Class{
	
	@Test(priority=0, description = "Building name")
	public void TC_1() throws Exception {
	  WebElement building_Name = driver.findElement(By.id("TextField31"));
	  building_Name.sendKeys("Icon tower");
	  Thread.sleep(1000);
  }
  
  @Test(priority=1, description = "Micromarket")
	public void TC_2() throws Exception {
	  WebElement micromarket = driver.findElement(By.id("TextField36"));
	  micromarket.sendKeys("Big");
	  Thread.sleep(1000);
  }
  
  @Test(priority=2, description = "City")
	public void TC_3() throws Exception {
	  WebElement city = driver.findElement(By.id("ComboBox46-input"));
	  city.sendKeys("Pune");
	  Thread.sleep(1000);
  }
  
  @Test(priority=3, description = "Landlord")
	public void TC_4() throws Exception {
	  WebElement landlord = driver.findElement(By.id("TextField50"));
	  landlord.sendKeys("John Wick");
	  Thread.sleep(1000);
  }
  
  @Test(priority=4, description = "Total building floors")
	public void TC_5() throws Exception {
	  WebElement total_Building_Floors = driver.findElement(By.id("TextField55"));
	  total_Building_Floors.sendKeys("13");
	  Thread.sleep(1000);
  }
  
  @Test(priority=5, description = "Lease terms")
	public void TC_6() throws Exception {
	  WebElement lease_Terms = driver.findElement(By.id("TextField60"));
	  lease_Terms.sendKeys("5");
	  Thread.sleep(1000);
  }
  
  @Test(priority=6, description = "Dropdown - NNN/CAM")
	public void TC_7() throws Exception {
	  WebElement dropDown = driver.findElement(By.xpath("//span[@id=\"Dropdown70-option\"]"));
	  dropDown.click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[contains(text(),'CAM')]")).click();
  }
  
  @Test(priority=7, description = "Building OPEX")
	public void TC_8() throws Exception {
	  WebElement building_OPEX = driver.findElement(By.id("TextField71"));
	  building_OPEX.sendKeys("26");
	  Thread.sleep(1000);
  }
  
  @Test(priority=8, description = "Expected sale price")
	public void TC_9() throws Exception {
	  WebElement exp_Sale_Price	 = driver.findElement(By.id("TextField81"));
	  exp_Sale_Price.sendKeys("25000");
	  Thread.sleep(1000);
  }
  
  @Test(priority=9, description = "Micromarket rent")
	public void TC_10() throws Exception {
	  WebElement micromarket_Rent = driver.findElement(By.id("TextField86"));
	  micromarket_Rent.sendKeys("10000");
	  Thread.sleep(1000);
  }
  
  @Test(priority=10, description = "Parking slots")
	public void TC_11() throws Exception {
	  WebElement parking_Slots = driver.findElement(By.id("TextField91"));
	  parking_Slots.sendKeys("7");
	  Thread.sleep(1000);
  }
  
  @Test(priority=11, description = "Service revenue demand back")
	public void TC_12() throws Exception {
	  WebElement service_Revenue_Demand_Back = driver.findElement(By.id("TextField96"));
	  service_Revenue_Demand_Back.sendKeys("10");
	  Thread.sleep(1000);
  }
  
  @Test(priority=12, description = "Service revenue speculative")
	public void TC_13() throws Exception {
	  WebElement service_Revenue_Speculative = driver.findElement(By.id("TextField106"));
	  service_Revenue_Speculative.sendKeys("8");
	  Thread.sleep(1000);
  }
  
  @Test(priority=13, description = "Cost inflation")
	public void TC_14() throws Exception {
	  WebElement cost_Inflation = driver.findElement(By.id("TextField116"));
	  cost_Inflation.sendKeys("10");
	  Thread.sleep(1000);
  }
  
  @Test(priority=14, description = "Total building RSF")
	public void TC_15() throws Exception {
	  WebElement total_Building_RSF = driver.findElement(By.id("TextField121"));
	  total_Building_RSF.sendKeys("10");
	  Thread.sleep(1000);
  }
  
  @Test(priority=15, description = "Next button")
	public void TC_16() throws Exception {
	  WebElement next_Button = driver.findElement(By.id("id__137"));
	  next_Button.click();
	  Thread.sleep(1000);
  }
  
  
  
  

  
  
  
 
  
  
  
  
  
}