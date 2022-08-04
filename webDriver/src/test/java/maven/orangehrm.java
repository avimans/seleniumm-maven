package maven;

import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.util.List;
import java.util.Set;
import java.awt.event.*;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class orangehrm {
	WebDriver driver;
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//New folder//selenium//chromedriver.exe");
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      //driver.get("https://opensource-demo.orangehrmlive.com/");
      //driver.navigate().to("https://www.google.com");
      // driver.get("https://opensource-demo.orangehrmlive.com/");
      //driver.get("https://demoqa.com/upload-download");
      //driver.get("https://demoqa.com/alerts");
      //driver.get("file:///C:/Users/admin/Desktop/New%20folder/SUNILDOCS/table.html");
      //driver.get("file:///C:/Users/admin/Desktop/New%20folder/SUNILDOCS/janki2.html");
      //driver.get("https://demoqa.com/webtables");
      //driver.get("https://demoqa.com/buttons");
      //driver.get("https://demoqa.com/webtables");
      //driver.get("https://www.google.com/maps");
      //driver.get("https://demoqa.com/radio-button");
      //driver.get("https://demoqa.com/radio-button");
      //driver.get("https://demoqa.com/browser-windows");
      driver.get("https://www.google.co.in/");
  }
  
  @Test (enabled = false)
  public void f() throws InterruptedException
  { 
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(3000);
	  //  there are test case how  many links are present after login fetch there names and print it
	  //  tagname called a this means a link
	  //  am i looking for onr link oor multilpe links 
	  //  find lelement=this will find one element
	  //  find elements =this will automaticallyt find all the elements
	  //  when you have two or more elements witrh same attributes we use findelements
	  // tag name is a locator  
	 List<WebElement> link = driver.findElements(By.tagName("a"));
	    System.out.println("total no of links are "+ link.size());
//---------------------to print linlks---------------------------------------
	     for(int i=0;i<link.size();i++);
	 {
		 System.out.println(link.get(1).getText());
	 }
//-----------------enhanced for loop----------------------------------------
	 for(WebElement e:link)
	 {
	 String eachlink=e.getText();
	 System.out.println(eachlink);
	 }
//---------i want to log out so use partial link if it is a link--------------
/*     driver.findElement(By.partialLinkText("welcome")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.linkText("Logout")).click();
*/	   
 //-------------------------NAVIGATE------------------------------------------
/*     driver.findElement(By.linkText("PIM")).click();
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	// driver.navigate().to("https://www.google.com");
===================================ACTIONS================================================= 
//actions is class which contais some methods mouseover or move to element
        Actions act=new Actions(driver);
        WebElement cllink =driver.findElement(By.linkText("Configuration"));
        act.moveToElement(cllink).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform(); */
//i want to click enter from the keyboard
//      act.sendKeys(Keys.ENTER).build().perform();
//      act.sendKeys(Keys.RETURN).build().perform();
	
  
  }
  
  @Test (enabled = false)
  public void f1() throws InterruptedException 
  {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(3000);
	  Actions act=new Actions(driver);
/*	  act.sendKeys(Keys.TAB).build().perform();
	  act.sendKeys(Keys.TAB).build().perform();
	  act.sendKeys(Keys.TAB).build().perform();
	  act.sendKeys(Keys.TAB).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
	 //INSTED OF ABOVE LINE WE CAN WRITE THE BELOW ONE
	  act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
*/	  
  }
 
  
  @Test (enabled = false)
  //---------TO DO RIGHT CLICK----------
  public void f2() throws InterruptedException, AWTException

  {
	  WebElement link = driver.findElement(By.linkText("Gmail"));
	  Thread.sleep(1000);
	  Actions act=new Actions(driver);
	  //context click is a selenium method to right click on any elemnt
	  act.contextClick(link).build().perform();
	  
/*  when i right click and i get features from the browser if i want to automate i use somethinhg cslled ROBOT CLASS	  
*/
	  act.sendKeys(Keys.chord(Keys.CONTROL,Keys.TAB)).build().perform();

	      Robot rbt = new Robot();
	rbt.keyPress(KeyEvent.VK_DOWN);
	rbt.keyPress(KeyEvent.VK_DOWN);
	rbt.keyPress(KeyEvent.VK_UP);  
	Thread.sleep(1000);
//here  i want to cliclk on enter	using robot
	rbt.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	//act.sendKeys(Keys.CONTROL + "\t").build().perform();
	/*String Title = driver.getCurrentUrl();
	  System.out.println(Title);
	
	rbt.keyPress(KeyEvent.VK_CONTROL);
	rbt.keyPress(KeyEvent.VK_TAB);
//	String Title1 = driver.getCurrentUrl();
//	System.out.println(Title1);
	
//--------------using actions switching tabs	
	  //rbt.sendKeys(Keys.CONTROL).build().perform();
	 // rbt.sendKeys(Keys.TAB).build().perform();
	  //
//	  rbt.sendKeys(Keys.ENTER).build().perform();
	///act.sendKeys(Keys.CONTROL,Keys.TAB);
/*	 act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	  String Title = driver.getTitle();
	  System.out.println(Title);
	  act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	  String Title1 = driver.getTitle();
	  System.out.println(Title1);  */
  }
 
  @Test (enabled = false)
  public void f3 () throws InterruptedException

  {
	 // driver.findElement(By.id("uploadFile")).sendKeys("\"C:\\Users\\admin\\Desktop\\dummmyt.docx\"");
 /*-----------------------ALERT METHODS--------------------------------
  * WEBPAGES we see lots of pop ups are called alerts 
  * simple alert
  * driver
  */

	  driver.findElement(By.id("alertButton")).click();
	  Alert alt = driver.switchTo().alert();
	  //this is basically to click on ok button
	  Thread.sleep(3000);
	  alt.accept();
	  //if i want to click on cancle
	  //alt.dismiss();
	    
	  //this is a confirm alertr whiich means it as ok button as well as cancle button
	  //so if i want to clcick on ok accepte /if i wamt to clcik an the cancle i use dissmiss
	  driver.findElement(By.id("confirmButton")).click();
	  Thread.sleep(3000);
	  alt.dismiss();
	  //---------------------STILL TWO BUTTONS ARE TTO BE DONE----------------------
	  // */
	 /* driver.findElement(By.id("timerAlertButton")).click();
	  WebDriverWait wt = new WebDriverWait(driver,30);
	  wt.until(ExpectedConditions.alertIsPresent());
	 // Thread.sleep(5000);
	//  Alert alt = driver.switchTo().alert();
	  //Thread.sleep(3000);
	  alt.accept(); 
	   String st=driver.findElement(By.xpath("//*[@class='ReactTable -striped -highlight']")).getText();
	  System.out.println(st);                                       
	  
	  
	  
 /*
   --------------------IMPLECENT WEIGHTS AND EXPLECETE WEIGHTS----------------------------
                   imPlecents should be given in  BEFORE CLASS
                   deiver.manage().timeouts().implicitlyWait(30,TimeUniot.SECONDS);
                   EXCLEPETE WEIGHTS-I AM BSICALLY AN A ELEMENT 
                   WebDriverWait wt = new WebDriverWait(driver,30);
	               wt.until(ExpectedConditions.alertIsPresent());
	   */
	  }
 
  @Test  (enabled=false)
  public void f6 () throws InterruptedException
  {
                                                                           
	  
	  
	  
/*--------------------------janaki cell------------------------------------------------	*/ 
	String a= driver.findElement(By.xpath("//tbody/tr[2]/td[1]")).getText();
	  System.out.println(a);                           
	  
	  
/*----------TO SEARCH BY TEXT AND TO GET RELATED VALUES TO TH TEXT JANAKI TABLE EXAMPLE---------*/	  
	 	//String ab = driver.findElement(By.xpath("//*[contains(text(),'Abhi')]//tbody/tr[2]/td[1]/followling-sibling::td[4]")).getText();
	//System.out.println(ab);
	
	String abc = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/following-sibling::td[3]")).getText();
	System.out.println(abc);
	
	
	/*--------------------------janaki cell  preceding------------------------------------------------	*/ 
	 String abcd = driver.findElement(By.xpath("//tbody/tr[2]/td[4]/preceding-sibling::td[2]")).getText();
	 System.out.println(abcd);
	  

  }
  @Test (enabled = false)
  public void f4() 
  {
	  driver.findElement(By.xpath("//*[contains(text(),'Cierra')]/following-sibling::div[6]/div/span[2]")).click();
	  String st=driver.findElement(By.xpath("//*[@class='ReactTable -striped -highlight']")).getText();
	   System.out.println(st);
  }
  
  @Test (enabled=false)
  public void f5() throws InterruptedException 
  {
//-------------------------------------------DOUBLE CLICK---------------------------------------
	  
	      WebElement dc = driver.findElement(By.id("doubleClickBtn"));
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	      Actions act = new Actions(driver);
          act.moveToElement(dc).doubleClick().build().perform();
             
          Thread.sleep(3000);
     
     
//==========================================RIGHT CLICK==================================================
             
     	 WebElement rc = driver.findElement(By.id("rightClickBtn"));
     	 act.moveToElement(dc).contextClick(rc).build().perform();
     	 
     	 
//===========================GETTING XPATH BY TEXT AND DYANAMIC ID CLCICKME=================================
     	 
     	 String dynamicid = driver.findElement(By.xpath("//*[text()='Click Me']")).getAttribute("id");
     	 System.out.println(dynamicid);
     	 driver.navigate().refresh();
     	 
     	 String dynamicid1 = driver.findElement(By.xpath("//*[text()='Click Me']")).getAttribute("id");
     	 System.out.println(dynamicid1);
     	
  }
  @Test (enabled = false)
  public void cierra() 
  {
	  driver.findElement(By.xpath("//*[contains(text(),'Cierra')]/following-sibling::div[6]/div/span[2]")).click();
	  driver.navigate().refresh();
	  driver.manage().window().maximize();
	 String sd = driver.findElement(By.xpath("//*[@class='ReactTable -striped -highlight']")).getText();
	  System.out.println(sd);
  }
  
  @Test(enabled = false)
  public void buttons() 
  {
	   WebElement DC= driver.findElement(By.id("doubleClickBtn"));
	   Actions ac=new Actions(driver);
	   ac.moveToElement(DC).doubleClick().build().perform();
	   
	   driver.findElement(By.id("rightClickBtn"));
	   
  } 
  
  
  @Test (enabled = false)
  public void gmap() throws InterruptedException {
	 // driver.findElement(By.xpath("//*[@id='hArJGc']")).click();
	 // Thread.sleep(4000);
	  //driver.findElement(By.xpath("//*[@data-tooltip='Walking']")).click();
	 /*driver.findElement(By.xpath("//*[@tooltip='Choose starting point, or click on the map...']")).click();
	  Thread.sleep(4000);
	 
	  
	  //driver.findElement(By.xpath("//*[@class='gstl_51 sbib_a']")).sendKeys("bidar",Keys.ENTER);
	 // driver.findElement(By.xpath("//*[@class='gstl_51 sbib_a']]")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@tooltip=\"Choose destination, or click on the map...\"]")).sendKeys("banglore",Keys.ENTER); 
	  */
	 
	  driver.findElement(By.xpath("//*[@class='eYqqWd']")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//*[@id='directions-searchbox-0']"));
		WebDriverWait t = new WebDriverWait(driver, (10));
		t.until(ExpectedConditions.visibilityOf(element));
		t.until(ExpectedConditions.elementToBeClickable(element));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		act.moveToElement(element).sendKeys("Moolya").build().perform();
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id='sb_ifc52']"));
		WebDriverWait webdwait = new WebDriverWait(driver, (10));
	//WebDriverWait t1 = new WebDriverWait(driver, 10);
		webdwait.until(ExpectedConditions.visibilityOf(element1));
		webdwait.until(ExpectedConditions.elementToBeClickable(element1));
		Actions act1 = new Actions(driver);
		act1.moveToElement(element1).click().build().perform();
		act1.moveToElement(element1).sendKeys("imvk5").build().perform();
		act1.moveToElement(element1).sendKeys(Keys.ENTER).build().perform();
		//*[@id='sb_ifc52']
		//driver.findElement(By.xpath("//*[@id='directions-searchbox-0']")).sendKeys("Bangalore");
	 
	 
	 
	 
	  
  }
  
@Test (enabled=false)
public void radio() {
//WebElement t = driver.findElement(By.xpath("//*[@id='yesRadio']"));
	//WebDriverWait w = new WebDriverWait(driver, 10);
}

//==================================WINDOWHANDL $ WINDOWHANDLES================================
@Test (enabled=false)
public void test() throws InterruptedException {
	//==================================WINDOWHANDL $ WINDOWHANDLES================================
	/*whenn soe one gives me web appl wgat do we test firt
	 * we try to web app opensd 2. links are opening there we can find a broken link
	 * when we click on a link if iyt dopes not navigate to the righht page or find a server eroer
	 * 3.then we check all the featrures are working or noyt
	 * 4.i am able to do all the operations
	 * waht are windows ..when i click on new window ,how to test when a new tab oopens and we have to do smtg in tht tab and come back to our main tab
	 * THERE ARE TWO METRHODS WE USE IN SELEMIUM THEY ARE 1. GET WINDOW HANDLE - basicalyyb used to oifdentoify parent windw the first window
	 * 2.GET WINDOW HANDLES ;-basically used to fetch the all the windows including our parent windows
	 * syntax will get the parent windwo :-driver.getWindowHandle();
	 */

	String parentwindow = driver.getWindowHandle();
	System.out.println(parentwindow);
	/*i want to click on the below ele,ent for three times
	 * we use for loop
	 */
	WebElement click = driver.findElement(By.id("tabButton"));
	for(int i=0;i<3;i++)
	{
		click.click();
	}
	
	/*i want to know how many windows are there
	 * i will us eGETWINDOWHANDLES
	 * .size gives thbe count of how many windows are opened ,without .size itbgives the id of thgenwindows
	 * 
	 */
           Set<String>allwindow = driver.getWindowHandles();
           System.out.println(allwindow.size());
           //cerating a just creating a variable called lastwindow
           String lastwindow="";
           
           /*I WANT TO OPEN GOOGLE.COM IN NALL THE WINDOWS
            * driver.switchTo().window(handle);==>WIOIL GO TO ALL THE WINDOWS PRESENT 
            * driver.switchTo().window(PARENTWINDOW);==> IT WILL GO TO PARENT WINDOW
            * driver.close will only close whici window is present at now
            * driver.quit will close all thew woindows
            */
         
           for(String handle: allwindow)
           {
        	   System.out.println("i want to open google.comin all thgew window");
        	   driver.switchTo().window(handle);
        	   driver.get("https://www.google.co.in/");
        	   //lastwindow
        	   lastwindow = handle;
        	   
        	   
           }
           //thgis will open the parent window with orangeHrm application
           Thread.sleep(2000);
           driver.switchTo().window(parentwindow);
    	   driver.get("https://opensource-demo.orangehrmlive.com/");
    	   driver.close();
    	   driver.quit();
    	   
    	   //lastwindwow
    	   driver.switchTo().window(lastwindow);
    	   driver.get("https://www.google.com/intl/en-GB/gmail/about/");
    	   driver.close();
    	   
//=================================TO DO==================================================
    	   /*CAN I USE
    	    * INDERX TO NAVIGATE TO THE MULTIPLE
    	    * THIS IS SOMETHING 
    	    */
           }

@Test (enabled= false)
public void tc11() throws InterruptedException {
	/*i want to open one more tab ..how to do
	 * driver.f
	 * two bllue colour lines comes on screen when we do cntrl+tab
	 * google how to multiplle tab in selenium in 3.14(see wihcih version u r using)
	 * 
	 * THIS IS NOT SUPPORTING
	 */
//=============WINDOW.DOCUMENT.	
	/*TESTING CAN BE DONE ON WEB PAGE USING THESE   (( have to write down thgese codes))
	 * THIS CAN BE DONE WITH THE HELP OF JAVS SCRIPTS
	 * there are two interface which selenium supports thet are
	 * 1.WebDriver   2. javascripts (((((interviuew question))
	 *  WEBDRIVER CONYTAINS ALL BROWSER _____________?
	 * JAVASCRIPTS CONTAINS__________________?
	 * 
	 */
    
     //insted of String titled = driver.getTitle();
     //System.out.println(titled);  ====>.insted of using these line we use the below in java scripts
     
     JavascriptExecutor	js=( JavascriptExecutor)driver;
	 String title=js.executeScript("return document.title").toString();
	 System.out.println(title);
	
	 String url=js.executeScript("return document.url").toString();
	 System.out.println(url);
	
	 String domain=js.executeScript("return document.domain").toString();
	 System.out.println(domain);
	 //String alltext=
//========================SCROLL i have to do it===============================	 
	 driver.get("https://opensource-demo.orangehrmlive.com/");
 Thread.sleep(3000);
driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
 Thread.sleep(3000);
driver.findElement(By.linkText("PIM")).click();
driver.findElement(By.linkText("Employee List")).click();
//scrollIntoView()
// this method will help me to scroll a specific element
 js.executeScript ("document.getElementById('ohrmList_chkSelectRecord_29').scrollintoView()");
	 
	 /*something to do hetre ui missed
	  */
	 /*the same application lets say orange hrm
	  * i want to fetch the innertext of asll thge elemnets 
	  * 
	  * 
	  * we cant fetch the innertext of a element in webdriver,but with javascript we can get inner text of element
	  */
	 
//String alltext =js.executeScript("return document.documentElement.innerText").toString();
//System.out.println(alltext);

/*if i want to scrool in web driver we use actions 
 * we dont have scrool in webdriver so in java script we use
 * js.executeScript("Winndow.scrollBy(0,600)");
 * window.scrool java does wind means trhe entire scree scrroll means w eare giviuyn the x and y cooridinates
 * it wilolls crool from the x cooridinate to y corridinates doing all the 
 * how to find the valuer of y coordinate ,,now we write in y cooridinate(document.boby.scrollHeight)
 * ()==> tgis is if we want to scroll at the end of the page we use this
 * how to scrool up
 * js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
 * if iu want to scrool all the waT UOP THGEN I USE THIS
 * js.executeScript(document.
 * (go tom console in inspet type document.get
 */
//==========================================================================
}
 @Test 
  public void casestudy1() throws InterruptedException
{

	 
 
 
 	JavascriptExecutor js=( JavascriptExecutor)driver;
 	 String title=js.executeScript("return document.title").toString();
 	 System.out.println(title);	
 	 String url=js.executeScript("return document.URL").toString();
 	 System.out.println(url);	
 	 String domain=js.executeScript("return document.domain").toString();
 	 System.out.println(domain);
 	 String alltext=js.executeScript("return document.documentElement.innerText").toString();
 	 System.out.println(alltext);
 	 String parenttab=driver.getWindowHandle();
 	  System.out.println(parenttab);
 	  WebDriver newtab = driver.switchTo().newWindow(WindowType.TAB);
 	  //WebDriver newtab = driver.switchTo().newWindow(WindowType.TAB);
 	  newtab.get("https://f1.com");
 	  Thread.sleep(3000);
 	//  driver.navigate().back();
 	  ///declare parent tab
 	  Set<String> alltab = driver.getWindowHandles();
 	  Object [] altab= alltab.toArray();
 	 
 	  System.out.println(alltab.size());
 	//  driver.switchTo().window(parenttab);
 	// driver.get("https://google.com");
 	  driver.switchTo().window((String) altab[0]);
 	  driver.close();
 	  driver.switchTo().window((String)altab[1]);
 	  driver.get("https://google.com");
 	  Thread.sleep(3000);
 	  driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Moolya",Keys.ENTER);
 	//  Actions alt= new Actions(driver);
 	 // alt.sendKeys(Keys.PAGE_DOWN).build().perform();
// 	  js.executeScript("window.scrollBy(0,600)");
 	  //if you want to scroll to the end of the page, then you can use document.body.scrollHeight
 	 
 	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
 	  Thread.sleep(3000);
 	  //I want to scroll up, if I want to scroll all the way up then I use -
 	  js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
 	  Thread.sleep(3000);
 	  //js.executeScript(document.)
 	  //firsdt go to goole search for qucik info enter select the first link
 	  //in teams select team as india once done scrool down
 	  //open ganguly link



}
 
 

 @Test (enabled= false)

 public void casestudy() 
{
	
}
	

@AfterTest
  public void afterTest() {
  
 // driver.close();
}
}
