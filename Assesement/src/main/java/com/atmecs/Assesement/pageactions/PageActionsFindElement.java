package com.atmecs.Assesement.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.Assesement.reports.LogReports;

public class PageActionsFindElement {
	static WebElement element;
	static LogReports report=new LogReports();
	
	public static WebElement findWebElement(WebDriver driver, String locatorType, String locatorValue) {

		try {
			switch (locatorType) {
			case "CLASSNAME":
				element = driver.findElement(By.className(locatorValue));
				break;
			case "CSSSELECTOR":
				element = driver.findElement(By.cssSelector(locatorValue));
				break;
			case "ID":
				element = driver.findElement(By.id(locatorValue));
				break;
			case "LINKTEXT":
				element = driver.findElement(By.linkText(locatorValue));
				break;
			case "NAME":
				element = driver.findElement(By.name(locatorValue));
				break;
			case "PARTIALLINKTEXT":
				element = driver.findElement(By.partialLinkText(locatorValue));
				break;
			case "TAGNAME":
				element = driver.findElement(By.tagName(locatorValue));
				break;
			case "XPATH":
				element = driver.findElement(By.xpath(locatorValue));
				break;
			default:
				break;
			}
		} catch (IllegalArgumentException illegalArgumentException) {
			report.info("Locator type doesn't exist" + illegalArgumentException.getCause());
		} catch (NullPointerException nullPointerException) {
			report.info("Locator type doesn't exist " + nullPointerException.getCause());
		} catch (Exception exception) {
			report.info("Locator type doesn't exist " + exception.getCause());
		}
		return element;

	}

}
