package utilities;

import org.openqa.selenium.By;

import base.BaseTest;

public class Login extends BaseTest{
	
	public static void LoginTest(String username, String password) throws InterruptedException {
		
		System.out.println("Clicked Successfuly");
		driver.findElement(By.linkText(loc.getProperty("Sign_in_link"))).click();
		driver.findElement(By.id(loc.getProperty("email_id_field"))).sendKeys(username);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		driver.findElement(By.xpath(loc.getProperty("Password_field"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		
		}

}
