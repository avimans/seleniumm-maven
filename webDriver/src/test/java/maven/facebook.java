package maven;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
  
public class facebook {
	WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  // driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9300342%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwrZOXBhACEiwA0EoRD6ty6uOCZaaFyWa2m9M8azEyaIWivlrt8eAL2vY8Fb3sxPUCXbL21BoCU-QQAvD_BwE");
	  // driver.get("https://moolyaed.com/");
	  // driver.get("https://demoqa.com/alerts");
	  // driver.get("file:///C:/Users/admin/Desktop/New%20folder/SUNILDOCS/janki2.html");
	   driver.get("https://demoqa.com/buttons");  
	driver.manage().window().maximize();
	 
  }
  @Test (enabled=false)
  public void f() throws InterruptedException {
	  // WebElement fb = driver.findElement(By.name("firstname"));
	   driver.findElement(By.xpath("//*[@name='firstname']")).click();
	   driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("avinash");
	  //String fb = driver.findElement(By.xpath("//*[@name='firstname']")).getAttribute("value");
	 
      // fb.click();
      //fb.sendKeys("avinash");
      // fb.getAttribute("sendkeys");
      // System.out.println(fb);
	  // fb.sendKeys("avinash"); //*[@name='lastname']
	 driver.findElement(By.xpath("//*[@name='lastname']")).click();
	 driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("baradabadi");
//===========================================DROPDOWN===============================	 
	 WebElement date = driver.findElement(By.id("day"));
	 Select sel =new  Select(date);
	 sel.selectByVisibleText("18");
	 
	 Thread.sleep(3000);
	 
	 WebElement month = driver.findElement(By.id("month"));
	 Select sel1= new Select(month);
	 sel1.selectByVisibleText("Feb");
	 Thread.sleep(3000);
	 
	 WebElement year = driver.findElement(By.id("year"));
	 Select sel2 = new Select(year);
	 sel2.selectByVisibleText("1997");
	 Thread.sleep(3000);
//==============================================RADIO BUTTON==========================================	 
	 List<WebElement> r = driver.findElements(By.name("sex"));
	 r.size();                  
	 //give the count of how many values are there
	 System.out.println(r);
	 for(WebElement e:r) 
	{
		 e.getText().equalsIgnoreCase("Male");
		 {
			 e.click();
		 }
	 }
	 
	 WebElement pn = driver.findElement(By.name("preferred_pronoun"));
		
	 Select selp = new Select(pn);
	 Thread.sleep(3000);
	// selp.selectByVisibleText("Wish him a happy birthday!");
	 selp.selectByValue("2");
	 driver.findElement(By.linkText("Privacy Policy")).click();
	 
	 
	 //driver.findElement(By.linkText("Cookies Policy")).click();
	//driver.findElement(By.partialLinkText("Cookies")).click();

  }


  @Test (enabled=false)
  public void alertsyt() throws InterruptedException{
	  //====================	 ALERTS===========================================================
  
	 /*ALERTS ARE OF TWO TYPES  ALERTS ARE SOMETHING WHICH APPERARS ON SCREE LIKE A POP UP
	  * WHRE WE FIND ACCEPTANCE OR CANCLETATIUON
	  * ALERTS ARE OF TWOM TYPES 1WEB ALERTS POPS UP WHEN WE COME ACROOSS WEB APPLICATRION 
	  * 2. WINDOWS ALERTS (THESE CANT BE HANDLED WITH SELENIUM WEDB DRIVER WE NEED DIFF TOOLS)
	  * TO WORK WITH WITH ALERTS WE NEED METHODS THAT IS SWITCH METHOD
	  * SYNTAX  (driver.switchTO().alert().accept();)  this is to cliclk on ok button
	  *         (driver.switchTO().alert().dismiss();)  this is to cliclk on cancle button
	  *         (driver.switchTO().alert().getText();)   to get tge text displayed
	  *         (driver.switchTO().alert().sendKeys();)  to send the data
	  * ======================explecit waits========================================        
	  */
	  driver.findElement(By.id("alertButton")).click();
	  Thread.sleep(2000);
	  Alert alt = driver.switchTo().alert();
	  Thread.sleep(2000);
	  alt.accept();
	  
	  driver.findElement(By.id("timerAlertButton")).click();
	  Thread.sleep(6000);
	  Alert alt1 = driver.switchTo().alert();
	  alt1.accept();
	  
	  driver.findElement(By.id("confirmButton")).click();
	  Alert alt3 = driver.switchTo().alert();
	  alt3.accept();
	  
	  driver.findElement(By.id("promtButton")).click();
	  Alert text1=driver.switchTo().alert();
	  //String t= text1.sendKeys("avi");  //=============UNABLE TO SEND VALAUE CHECK========
	 String text= driver.switchTo().alert().getText();
	  System.out.println(text);
	  
	
 
	 
 }
  @Test  (enabled = false)
  public void moolyaed() throws InterruptedException {
	  
	 driver.findElement(By.xpath("//*[@class='et_pb_button et_pb_more_button et_pb_button_two']")).click();
	 Thread.sleep(2000);
	driver.findElement(By.id("u_0_7_LG")).click();
	 //driver.navigate().back();
	 
  }
  
  @Test (enabled=false)
  public void jank() {
	  /*
	   * 
	   */
	  String get = driver.findElement(By.xpath("//tbody/tr[2]/td[1]")).getText();
	 System.out.println(get);
	 String get0=driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();
	 System.out.println(get0);
	 String get1= driver.findElement(By.xpath("//tbody/tr[2]/td[1]/following-sibling::td[3]")).getText();
	 System.out.println(get1);
//====================================================cierra===========================================	 
  }
 //===================================================ACTIONS===========================================
  /*
   * Actions class is a built in ability to handle various types of keyboard and mouse events 
   * keyboard interface has theste methods 1.send keys 2.keyDown();, 3.kEYuP()
   */
  @Test
  public void actions() {
	  WebElement bu= driver.findElement(By.id("doubleClickBtn"));
	  Actions dc=new Actions(driver);
	  dc.moveToElement(bu).doubleClick().build().perform();
  }
  private Actions Actions(WebDriver driver2) {
	// TODO Auto-generated method stub
	return null;
}
@AfterTest
  public void afterTest() {
  }

}
