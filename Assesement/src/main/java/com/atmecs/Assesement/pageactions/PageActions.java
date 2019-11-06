package com.atmecs.Assesement.pageactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.atmecs.Assesement.waits.Waits;



public class PageActions 
{
	static WebElement element;
	static String text;
	static  Waits waits=new  Waits();


	public static void performActionEnter(WebDriver driver) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}

	public static void mouseOverElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public static String handlingAlert(WebDriver driver) {
		text = driver.switchTo().alert().getText();
		return text;
	}
	
	public static void navigateBack(WebDriver driver)
	{
		driver.navigate().back();
	}
	
	

}
