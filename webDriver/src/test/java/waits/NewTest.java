package waits;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;

  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  // driver.get("https://demoqa.com/alerts");
	  // driver.get("https://demoqa.com");
	  //driver.get("https://demoqa.com/automation-practice-form");
	  //driver.get("https://www.google.co.in/");
      //driver.get("https://demo.guru99.com/test/newtours/");
	  //driver.get("https://demo.guru99.com/test/newtours/login.php");
	  driver.get("https://testsheepnz.github.io/BasicCalculator.html");
	  driver.manage().window().maximize();
	  // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  
  }

  
  @Test (enabled = false)
  public void f() throws InterruptedException {
	  
	 driver.findElement(By.id("alertButton")).click();
	 Thread.sleep(5000);
	 Alert btn= driver.switchTo().alert();
	 btn.accept();
	  
	  
	  driver.findElement(By.id("timerAlertButton")).click();
	  WebDriverWait bt= new WebDriverWait(driver,60);
	  bt.until(ExpectedConditions.alertIsPresent());
	  Alert btz= driver.switchTo().alert();
	  btz.accept();
  }  
  /*instance that is = new is given when we are going to new classes like action classes rorbot ,ch
   * 
   */
  
  @Test (enabled = false)
  public void toolsqaform() throws InterruptedException
  {
	 //driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div")).click();
	 // driver.findElement(By.xpath("//div/ul/li[1]")).click();
	 // WebElement AA = driver.findElement(By.xpath("//div/ul/li[1]"));
	 // WebDriverWait tahluu = new WebDriverWait(driver,30);
	 // tahluu.until(ExpectedConditions.visibilityOf(AA));
	 // tahluu.until(ExpectedConditions.elementToBeClickable(AA));
	  //AA.click();
	 //driver.findElement(By.xpath("//form/div[1]/div[2]")).click();
	 //Thread.sleep(1000);
	 //driver.findElement(By.xpath("//form/div[1]/div[2]")).click();
	 //driver.findElement(By.xpath("//form/div[1]/div[2]")).sendKeys("avi");
	 driver.findElement(By.id("userEmail")).click();
	 driver.findElement(By.id("userEmail")).sendKeys("avi@gmail.com");
	 
         driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
         driver.findElement(By.id("userNumber")).click();
         driver.findElement(By.id("userNumber")).sendKeys("7899555057");
         driver.findElement(By.id("hobbies-checkbox-1")).click();
         
  }
 

  @Test (enabled = false)
  public void casestudy() throws InterruptedException {
	  JavascriptExecutor js = ( JavascriptExecutor)driver;
	  driver.findElement(By.name("q")).click();
	  driver.findElement(By.name("q")).sendKeys("crickinfo",Keys.ENTER);
	  driver.findElement(By.partialLinkText("Live cricket scores, match schedules, latest cricket news ...")).click();
	  Thread.sleep(5000);
		 driver.findElement(By.partialLinkText("Teams")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("India")).click();
		 Thread.sleep(2000);
		js.executeScript("document.getElementsByClassName('ds-flex ds-flex-row ds-space-x-4')[1].scrollIntoView()");
		 Thread.sleep(4000);
		 driver.findElement(By.partialLinkText("Ganguly, Morgan, Muralidaran, Misbah, Johnson among 53 players in Legends League Cricket")).click();
	   }
//==================================caase study 2================================
		 /*
		  * guru99
		  * click on home
		  * click on flight
		  * write a program to click on links and tell whcich is working and not working  (get text)
		  * link name and get message working and  not working
		  */
  
  @Test (enabled =false)
  public void guru() throws InterruptedException{
	 // driver.findElement(By.partialLinkText("SIGN-ON")).click();
  
	  driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("admin");
	  driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@name='submit']")).click();
	  String dd = driver.findElement(By.xpath("//tbody/tr/td/h3")).getText();
		Assert.assertEquals("Login Successfully",dd);
		System.out.println("Home=Login Successfully " +dd);
		Thread.sleep(3000);
	  
//	  WebDriverWait waitt= new WebDriverWait(driver, 10);
//	  waitt.until(ExpectedConditions.alertIsPresent());
//	  Alert alt= driver.switchTo().alert();
//	  alt.dismiss();
        driver.findElement(By.partialLinkText("Home")).click();
        driver.findElement(By.partialLinkText("Flights")).click();
//	  Thread.sleep(3000);
//      Alert alt = driver.switchTo().alert();
//      Thread.sleep(3000);
//	  alt.dismiss();
	 // Actions act = new Actions(driver);
	 // act.click("close").c
	  
	  
  }
  
//=================CALCULATOR==========================================----------------------------  
  @Test
  public void cal() throws InterruptedException {
	  
		 Thread.sleep(3000); 
		 WebElement drop = driver.findElement(By.xpath("//*[@id='selectBuild']"));
	     Select dr = new Select(drop);
		 dr.selectByVisibleText("1");
		 driver.findElement(By.xpath("//*[@id='number1Field']")).sendKeys("20");
		 driver.findElement(By.xpath("//*[@id='number2Field']")).sendKeys("10");
		 WebElement dr1 = driver.findElement(By.xpath("//*[@id='selectOperationDropdown']"));
		 Select dr11 = new Select(dr1);
		 dr11.selectByVisibleText("Add");
	     driver.findElement(By.xpath("//*[@id='calculateButton']")).click();
	     String ans  = driver.findElement(By.xpath("//*[@id='numberAnswerField']")).getAttribute("value");
		  //String ab=new String()
		 System.out.println(ans);
		 Thread.sleep(3000);
	     driver.findElement(By.xpath("//form[5]/div/div/input")).click();
		 //driver.findElement(By.id("clearButton")).click();
		 //driver.findElement(By.partialLinkText("Number Game")).click();
		 List<WebElement> link = driver.findElements(By.tagName("a"));
		 System.out.println("total no os links are " + link.size());
		 for (int i=0;i<link.size();i++);
		 {
			 System.out.println(link.get(1).getText());
			 link.get(1).click();
		 }
		 driver.navigate().back();
		 driver.navigate().forward();
		 WebElement act = driver.findElement(By.className("portfolio-hover-content"));
		 Actions act1 = new Actions(driver);
		 act1.moveToElement(act).click().build().perform();
		  String st= driver.findElement(By.linkText("How good a tester are you?")).getText();
		 
		 
	  }
  
  
private Actions Actions(WebDriver driver2) {
	// TODO Auto-generated method stub
	return null;
}


@Test (enabled= false)
private void publi() throws InterruptedException {
	// TODO Auto-generated method stub
	 driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		String hd = driver.findElement(By.xpath("//tbody/tr/td/h3")).getText();
		Assert.assertEquals("Login Successfully",hd);
		System.out.println("Home=Login Successfully " + hd);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Flights")).click();
	    String fl=driver.getCurrentUrl();
		System.out.println("Flights=Link is working " + fl);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Hotels")).click();
		String Ho=driver.getCurrentUrl();
		System.out.println("Hotels=This section of our web site is currently under construction.Sorry for any inconvienece. " + Ho);
		driver.findElement(By.partialLinkText("Car Rental")).click();
		String cr=driver.getCurrentUrl();
		System.out.println("Car Rentals=This section of our web site is currently under construction.Sorry for any inconvienece. " + cr);
		driver.findElement(By.linkText("Cruises")).click();
		String cru=driver.getCurrentUrl();
		System.out.println("Cruises = Link is working" + cru);
		driver.findElement(By.linkText("Destinations")).click();
		String Dst=driver.getCurrentUrl();
		System.out.println("Destination = This section of our web site is currently under construction.Sorry for any inconvienece. " + Dst);
		driver.findElement(By.linkText("Vacations")).click();
		String Vac=driver.getCurrentUrl();
		System.out.println("Vacations = This section of our web site is currently under construction.Sorry for any inconvienece. " + Vac);
		//WebElement cr=driver.findElement(By.xpath("//html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font[1]/b/font[1]/br"));
		//String cr1=cr.getAttribute();
		//String cr1 = driver.findElement(By.xpath("//tbody/tr/td/p[1]/font/b/font/br[0]")).getText();
		
		//System.out.println("Car Rental= Link is " + cr1);
}
//================REST ASSURE API IS OSTLY ASKED IN MARKET=======================
//======================IMPORTANT POINTES TO GO THROUGH==========================
       /*PUSH TO GITHUB JENKINS RUN TIME
        *CASE STUDY ASSESMENT
        *MENTORESHIP
        *PROJECT CALL==>CLIENT INTERVIEW
        *WHAT THGE LOOKS ====>COMMUNICATION,WHEN THEY ASK TECHIICAL QUESTION GIIVE STRAIGHT FORWARD ASNWER
        *TEHY WILL ASK FRESHGER QUESTION
        *WHT IS THE DIFF BW TEST CASE TEST SCENARIO 
        *WRITE TESTCASE,EXAMPLE OF TESTCASE
        * 
        */
//<=====================************==============================================>
//=====to work with wedDriver we need to add jar files those are of selenium  and testng(TAKE From maven repostory)
/*if we get lang,noclassdefdfounderroe====>.itr is a jar file error(ss243)
 * innmaven it comes with all the dependiencies
 * inmaven we need selenium testng jar files (copy tehe dependies inthe pom) webdriver
 * 
 */
@Test (enabled =false)
public void guru99bysunil() {
	
}
	  
  @AfterTest
  public void afterTest()  {
	  
  }
  }
