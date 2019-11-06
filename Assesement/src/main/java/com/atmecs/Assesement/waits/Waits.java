package com.atmecs.Assesement.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.Assesement.constants.TimeOuts;
import com.atmecs.Assesement.reports.LogReports;

public class Waits {

	public static WebElement element;
	static LogReports log = new LogReports();

	public static void explicitWait(WebDriver driver, String locatorType, String locatorValue) {
		WebDriverWait wait = new WebDriverWait(driver,TimeOuts.TIME_IN_SECONDS);
		try {
			switch (locatorType) {
			case "CLASSNAME":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locatorValue)));
				break;
			case "CSSSELECTOR":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locatorValue)));
				break;
			case "ID":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
				break;
			case "LINKTEXT":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locatorValue)));
				break;
			case "NAME":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorValue)));
				break;
			case "PARTIALLINKTEXT":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(locatorValue)));
				break;
			case "TAGNAME":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(locatorValue)));
				break;
			case "XPATH":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
				break;
			default:
				break;
			}
		} catch (Exception e) {
			log.info("Exception occured in Waits");
		}
	}

}
