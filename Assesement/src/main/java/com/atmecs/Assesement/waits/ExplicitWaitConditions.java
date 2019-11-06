	package com.atmecs.Assesement.waits;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import com.atmecs.Assesement.constants.TimeOuts;
	
	/**
	 * To wait for certain conditions (Expected Conditions) or the maximum time
	 * exceeded before throwing an "ElementNotVisibleException" exception.
	 */
	
	public class ExplicitWaitConditions {
	
		public WebElement waitElementToBeClickable(WebDriver driver, WebElement webElement) {
			WebDriverWait wait = new WebDriverWait(driver, TimeOuts.TIME_IN_SECONDS);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
			return element;
	
		}
	
		public WebElement waitVisibilityOfElement(WebDriver driver, WebElement webElement) {
			WebDriverWait wait = new WebDriverWait(driver, TimeOuts.TIME_IN_SECONDS);
			WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
			return element;
		}
	
	}
