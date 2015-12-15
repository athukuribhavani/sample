package Sree.project;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  driver.findElement(By.id("Email")).sendKeys("goutham");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  driver=new FirefoxDriver();
	  driver.get("http://www.gmail.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() 
  {
	 driver .close(); 
  }

}
