package maven;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class elearniing { 
	  WebDriver driver;
	  
	  @BeforeTest
	  public void beforeTest() 
	  {
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.get("http://elearningm1.upskills.in/");
		    driver.manage().window().maximize();
		  
	  }

  @Test
  public void f()throws InterruptedException
  {
	driver.findElement(By.xpath("//*[@id='login']")).sendKeys("AVINASH");
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("PASSWORD");
	driver.findElement(By.xpath("//*[@name='submitAuth']")).click();
	driver.findElement(By.linkText("Compose")).click();
	driver.findElement(By.xpath("//*[@class='select2-search__field']")).click();
	driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("kavithauma1792@gmail.com");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[@name='title']")).sendKeys("hooooman");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).click();
	driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("hii");
	driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).click();
	driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("hiheloo ");
	//driver.findElement(By.xpath("//*[@dir='ltr ']")).click();
	//driver.findElement(By.xpath("//*[@dir='ltr ']")).sendKeys("avinash.baradabadi@moolyaed.com");
	//driver.findElement(By.xpath("//*[@class='section-social-network ']")).sendKeys("avinash.baradabadi@moolyaed.com");
	//driver.findElement(By.xpath("//*[@class=' btn btn-primary ']")).click();
	driver.findElement(By.xpath("//*[@name='compose']")).click();
	driver.findElement(By.linkText("My courses")).click();
	//driver.findElement(By.xpath("//*[@class='section-mycourses']")).click();
	driver.findElement(By.linkText("Course catalog")).click();
	//driver.findElement(By.xpath("//*[@class='dropdown-toggle']")).click();
	//WebElement dd1=driver.findElement(By.name("AVINASH B"));
	// Select sele1=new Select(dd1);
	 //List<WebElement> values=sele1.getOptions();
	 //sele1.selectByIndex(1);
	 //sele1.selectByVisibleText("Profile");
	
	
	//driver.findElement(By.linkText(" ")).click();
	//driver.close();
	//driver.findElement(By.linkText("My courses")).click();
	
	//driver.findElement(By.linkText("Logout")).click();
  }
  

  @AfterTest
  public void afterTest() {
  }

}
