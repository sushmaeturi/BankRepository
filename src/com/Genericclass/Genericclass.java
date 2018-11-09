package com.Genericclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Genericclass {
	
	public static WebDriver driver;
	public static Actions action;
	
	public static WebDriverWait wait;
	
	public static boolean invokeapplication(String Browser, String Url)
	
	{
		boolean status = true;
		try{
		
			switch(Browser.toLowerCase()){
			case "ff":
			driver = new FirefoxDriver();
			driver.get(Url);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			wait=new WebDriverWait(driver,10);
				
			}
		}
		catch(Exception e) {
			status = false;
		}
		return status;
		}
		
public static boolean hoverandclick(WebElement element)
{
	boolean status = true;
	try{
		action = new Actions(driver);
		
		action.moveToElement(element).click(element).build().perform();
	}
	
	catch(Exception e){
		System.out.println(e.getMessage());
		status = false;
	}
	return status;
}

	
}
