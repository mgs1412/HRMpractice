package Practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GenericUtility.ExcelUtility;

public class HRMFlow2Test {
   @Test(groups="RegressionSuite")
	public  void HRMFlow2() throws IOException, Throwable {
		ExcelUtility excel= new ExcelUtility();
		String FIRSTNAME = excel.readDataFromExcel("Candidate",2,0);
		String MIDDLENAME = excel.readDataFromExcel("Candidate",2,1);
		String LASTNAME = excel.readDataFromExcel("Candidate",2,2);
		String EMAIL = excel.readDataFromExcel("Candidate",2,3);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        WebElement ele = driver.findElement(By.xpath("//span[text()='Recruitment']"));
       
        Actions act = new Actions(driver);
        act.moveToElement(ele).click(ele).perform();
        
       driver.findElement(By.xpath("//button[text()=' Add ']")).click();
       
      driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FIRSTNAME);
       
       driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys(MIDDLENAME);
       
       driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LASTNAME);
        
        
        driver.findElement(By.xpath("(//input[@placeholder='Type here'])[1]")).sendKeys(EMAIL);
      
        driver.findElement(By.xpath("//button[text()=' Save ']")).click();
        
           

	}

}
