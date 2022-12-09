package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest{
	
	@Test(dataProviderClass = ReadXLSdata.class,dataProvider = "testdata")
	public static void LoginTest(String username, String password) throws InterruptedException {
		
	System.out.println("Clicked Successfuly");
	driver.findElement(By.linkText(loc.getProperty("Sign_in_link"))).click();
	driver.findElement(By.id(loc.getProperty("email_id_field"))).sendKeys(username);
	driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
	driver.findElement(By.xpath(loc.getProperty("Password_field"))).sendKeys(password);
	driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
	
	}
	
	

}
