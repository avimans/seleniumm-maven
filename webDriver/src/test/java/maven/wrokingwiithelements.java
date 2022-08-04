package maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wrokingwiithelements {
	WebDriver driver;
	   
	   @BeforeTest
	    public void beforeTest() 
	   {
		   System.setProperty("webdriver.chrome.driver", "C://Users//admin//Desktop//New folder//selenium//chromedriver.exe");
		   WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		   driver.get("https://demo.guru99.com/test/newtours/");
	   
		   
		                                                 //get title is ti get the title of the webpage ,and store it in a string variable callewd title
		   //when i start the web page ,what is the title of the webpage i have to store it in a variable ,after login what is the title of the web page i will store it in a variable
		   //if the title is same then i have to compare those two variables if ti si same logiut ,,if else give me a message sayign title is not same,
		  /*
		   *  string  firtspage=webpage.getTitle();
		   * 
		   */
		   
		/*   String Title=driver.getTitle();
		   String url=driver.getCurrentUrl();
		   System.out.println(Title+"  "+url);
		   Assert.assertEquals(Title,"OrangeHRM");
		   Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 */ 
	   
	   //whwn we give enablesd = false that particular method dos not wrok
	   }
	  @Test(enabled = false)
	  public void f() throws InterruptedException
	  {
		  driver.manage().window().maximize(); 
		  //how to maaxamize
		  String Title=driver.getTitle();
	                                                          //how to pass value of usernsme
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	                                                       //if i want to fetch the data(what we stored) from the application ,,,,,value/name is an attribute and the value of a value is the userbname
	  String username= driver.findElement(By.name("txtUsername")).getAttribute("value");     //<-------ASK
	  System.out.println(username);
	  Assert.assertEquals(username, "Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  String password= driver.findElement(By.id("txtPassword")).getAttribute("value");
	  System.out.println(password);
	  Assert.assertEquals(password, "admin123");
	  //String login= driver.findElement(By.id("btnLogin")).getAttribute("value");
		 
	  //System.out.println(login);

	  
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(3000);
	  //String login= driver.findElement(By.id("btnLogin")).getAttribute("value");
	 
	  String Titlelog=driver.getTitle();
	    if (Title.equalsIgnoreCase(Titlelog))
	    {
	    
	   
	  //System.out.println(login);
	  driver.findElement(By.id("welcome")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
	    }
	    else {
	    	System.out.println("it ti not the same");
	    }
	  
	  driver.close();                     
	  /*if my chrome driver the browser is updated we canoot use this code so now we hav e to do what?
	   * 
	   */
	  
	  

	/*  @Test
	  public void testcase1() throws InterruptedException {
		  WebElement UN =driver.findElement(By.xpath("//*[@name='userName']"));
		  if (UN.isEnabled())
		  {
			  UN.clear();
			  UN.sendKeys("sunil");
		  }
			  if (UN.isDisplayed())
			  {
				  System.out.println(UN.getAttribute("value"));
			  }
			  WebElement pass=driver.findElement(By.xpath("//*[@name='password']"));
			  if (pass.isEnabled()) {
				  pass.clear();
				  pass.sendKeys("sunil");
				  
			  }
			  if(pass.isDisplayed())
			  {
				  System.out.println("value");
			  }
			  driver.findElement(By.xpath("//*[@name='submit']")).click();
			  Thread.sleep(5000);
			  String hh=driver.findElement(By.xpath("//tbody/tr/td/h3")).getText();
			  Assert.assertEquals(hh,"Login Successfully");
			  driver.findElement(By.linkText("Flights")).click();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
			  WebElement dd=driver.findElement(By.name("passCount"));
			  Select sele =new Select(dd);
			  sele.selectByVisibleText("1");
		
			  sele.selectByIndex(3);
			  sele.selectByValue("2");
			  
			  WebElement dd1=driver.findElement(By.name("fromPort"));
			  //get all the values from the drop down
			  //if tthe values is more than 1 then we use list of webelement //if  i am storing one vslue thn it is webelement
			  Select sele1=new Select(dd1);
			  List<WebElement>values=sele1.getOptions();
			  //i have to get the size  of thte values
			  System.out.println(values.size());
			  for (int i=0;i<values.size();i++)
			  {
				  System.out.println(values.get(i).getText());
			  }
			  
			  //what this line does is
			  sele1.selectByIndex(6);
			  WebElement First=sele1.getFirstSelectedOption();
			  System.out.println(First.getAttribute("value")); */
	  }
}  
