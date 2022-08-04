package maven;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class dropdowns {
WebDriver driver;

  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
	  driver.get("https://demoqa.com/radio-button");
	driver.manage().window().maximize();
  }
  
  
  @Test
  public void f() throws InterruptedException { 
	     // WebDriverWait t = new WebDriverWait(driver, 10);
		 //t.until(ExpectedConditions.visibilityOf(element));
		 //t.until(ExpectedConditions.elementToBeClickable(element));
	     // Thread.sleep(5000);
	 
	     // driver.findElement(By.xpath("//*[@id='yesRadio']"));
	     // Thread.sleep(5000);
	  WebElement tt = driver.findElement(By.xpath("//*[@id='yesRadio']"));
	  WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(10));
		t.until(ExpectedConditions.visibilityOf(tt));
		t.until(ExpectedConditions.elementToBeClickable(tt));
		Actions act = new Actions(driver);
		act.moveToElement(tt).click().build().perform();
	
	  //Thread.sleep(50000);
	  
  }
 
  
  @AfterTest
  public void afterTest() {
  }

}
