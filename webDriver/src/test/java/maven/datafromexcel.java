package maven;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class datafromexcel {
	WebDriver driver;

	 @BeforeTest
	  public void beforeTest() {
		 WebDriverManager.edgedriver().setup();
		 	driver=new EdgeDriver();
		 	//driver.get("https://www.google.com");
			driver.get("https://opensource-demo.orangehrmlive.com/");
	 }
	 
	 
  @Test
  public void f() throws IOException,InterruptedException{
	  /*
	   *idhgu yen madhuitrye aNDRE FILE LOVCATION HOGI ADHURDHU FILE DHU ON DHU INSTANCE CREATE MADHUTRYE
	   *MADHI POIEXCEL AA VARIABLE INSTANCE NA POINT MADGUTYE
	   *AA FILE NA IERDHU POPINT MADHUTRYE
	   *FileInputStream ST LKINE INPUTSTRE IS LIKE SENDING THE REQUEST WE ARE SENDING
	   *WORKBOOK THERE ARE 2 METRHGODS 
	   */
  
	  File poiexcel=new File("C:\\Users\\admin\\Desktop\\New folder\\testdataexcellsheet.xlsx");
		 FileInputStream fis= new FileInputStream(poiexcel);
		 //there are two method in apache poi XSSF and HSSF
		 //XSSF for xlsx and HSSF for xls
		 
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet sheet= wb.getSheet("Sheet1");
		 int rowcount = sheet.getLastRowNum();
		 //System.out.println(rowcount);
		 for(int i=0;i<=rowcount;i++)
			{
				String username = sheet.getRow(i).getCell(0).getStringCellValue();
				String pwd = sheet.getRow(i).getCell(1).getStringCellValue();
				driver.findElement(By.id("txtUsername")).sendKeys(username);
				driver.findElement(By.id("txtPassword")).sendKeys(pwd);
				driver.findElement(By.id("btnLogin")).click();
				
				Thread.sleep(5000);
				driver.findElement(By.id("welcome")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
				Thread.sleep(3000);
	  
  }
wb.close();
driver.close();
}
  }
  
