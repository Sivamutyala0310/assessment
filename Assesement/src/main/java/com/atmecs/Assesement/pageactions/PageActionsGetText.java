package com.atmecs.Assesement.pageactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.Assesement.reports.LogReports;

public class PageActionsGetText {
	static LogReports report = new LogReports();
	static String textvalue;
	static List<WebElement> listValue;

	public static String fetchAttributeText(WebDriver driver, String locatorType, String locatorValue) {

		try {
			switch (locatorType) {
			case "CLASSNAME":
				textvalue = driver.findElement(By.className(locatorValue)).getText();
				break;
			case "CSSSELECTOR":
				textvalue = driver.findElement(By.cssSelector(locatorValue)).getText();
				break;
			case "ID":
				textvalue = driver.findElement(By.id(locatorValue)).getText();
				break;
			case "LINKTEXT":
				textvalue = driver.findElement(By.linkText(locatorValue)).getText();
				break;
			case "NAME":
				textvalue = driver.findElement(By.name(locatorValue)).getText();
				break;
			case "PARTIALLINKTEXT":
				textvalue = driver.findElement(By.partialLinkText(locatorValue)).getText();
				break;
			case "TAGNAME":
				textvalue = driver.findElement(By.tagName(locatorValue)).getText();
				break;
			case "XPATH":
				textvalue = driver.findElement(By.xpath(locatorValue)).getText();
				break;
			default:
				break;
			}
		} catch (IllegalArgumentException illegalArgumentException) {
			report.info("Locator type doesn't exist" + illegalArgumentException.getCause());
		} catch (NullPointerException nullPointerException) {
			report.info("Locator type doesn't exist " + nullPointerException.getCause());
		} catch (Exception e) {

		}
		return textvalue;

	}

	public static List<WebElement> fetchAttributeTexts(WebDriver driver, String locatorType, String locatorValue) {
		try {
			switch (locatorType) {
			case "CLASSNAME":
				listValue = driver.findElements(By.className(locatorValue));
				break;
			case "CSSSELECTOR":
				listValue = driver.findElements(By.cssSelector(locatorValue));
				break;
			case "ID":
				listValue = driver.findElements(By.id(locatorValue));
				break;
			case "LINKTEXT":
				listValue = driver.findElements(By.linkText(locatorValue));
				break;
			case "NAME":
				listValue = driver.findElements(By.name(locatorValue));
				break;
			case "PARTIALLINKTEXT":
				listValue = driver.findElements(By.partialLinkText(locatorValue));
				break;
			case "TAGNAME":
				listValue = driver.findElements(By.tagName(locatorValue));
				break;
			case "XPATH":
				listValue = driver.findElements(By.xpath(locatorValue));
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
		return listValue;
	}
}
