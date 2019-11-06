package com.atmecs.Assesement.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.Assesement.constants.TimeOuts;
import com.atmecs.Assesement.reports.LogReports;



public class PageActionSendKeys 
{
	static LogReports report=new LogReports();
	public static boolean sendKeys(WebDriver driver, String locatorType, String locatorValue,String keysToSend) {

		WebDriverWait wait = new WebDriverWait(driver, TimeOuts.TIME_IN_SECONDS);
		boolean presenceOfElementLocated = true;

		try {
			switch (locatorType) {
			case "CLASSNAME":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locatorValue)));
				driver.findElement(By.className(locatorValue)).sendKeys(keysToSend);
				break;
			case "CSSSELECTOR":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locatorValue)));
				driver.findElement(By.cssSelector(locatorValue)).sendKeys(keysToSend);
				break;
			case "ID":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
				driver.findElement(By.id(locatorValue)).sendKeys(keysToSend);;
				break;
			case "LINKTEXT":
				wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(locatorValue)));
				driver.findElement(By.linkText(locatorValue)).sendKeys(keysToSend);;
				break;
			case "NAME":
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name(locatorValue)));
				driver.findElement(By.name(locatorValue)).sendKeys(keysToSend);;
				break;
			case "PARTIALLINKTEXT":
				wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(locatorValue)));
				driver.findElement(By.partialLinkText(locatorValue)).sendKeys(keysToSend);;
				break;
			case "TAGNAME":
				wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(locatorValue)));
				driver.findElement(By.tagName(locatorValue)).sendKeys(keysToSend);;
				break;
			case "XPATH":
				wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(locatorValue))));
				driver.findElement(By.xpath(locatorValue)).sendKeys(keysToSend);;
				break;
			default:
				break;
			}
		} catch (IllegalArgumentException illegalArgumentException) {
			presenceOfElementLocated = false;
			report.info("Locator type doesn't exist" + illegalArgumentException.getCause());
		} catch (NullPointerException nullPointerException) {
			presenceOfElementLocated = false;
			report.info("Locator type doesn't exist " + nullPointerException.getCause());
		} catch (Exception e) {
			presenceOfElementLocated = false;
			report.info("Locator type doesn't exist " + e.getCause());
		}

		return presenceOfElementLocated;

	}
}
