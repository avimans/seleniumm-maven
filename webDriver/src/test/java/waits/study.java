package waits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class study {
	WebDriver driver;
	
	@Test
	public void casestudy() throws InterruptedException {
		
		/*SISNCE IW WANT TO CLCIKON TAL THE LINLKS WE USE
		 * DRIVER.FINDELEMENTS(BY.tagname(AA)
		 * eachg tag name will go and stotred in e (variable) so i wasnt to get text 
		 * i saw e.get text
		 */
		String baseURL="https://demo.guru99.com/test/newtours/index.php";
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(baseURL);
		String underconstruction="Under Construction:Mercury Tours";
		List<WebElement> alllink=driver.findElements(By.tagName("a"));
		String[] linktext=new String[alllink.size()];
		int i=0;
		for(WebElement e:alllink)
		{
			linktext[i]=e.getText();
			i++;
		}
		for(String q:linktext)
		{
			System.out.println(q);
			Thread.sleep(5000);
			driver.findElement(By.linkText(q)).click();
			if(driver.getTitle().equals(underconstruction))
			{
				System.out.println(q+"is under construction");
			}
			else
			{
				System.out.println(q+"is working");
			}
			Thread.sleep(5000);
			driver.navigate().back();
		}
		//driver.quit();
	  }
}







		
