package com.atmecs.Assesement.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.Assesement.constants.TimeOuts;
import com.atmecs.Assesement.reports.LogReports;

public class PageActionsClick {

	static LogReports report = new LogReports();

	public static boolean clickElement(WebDriver driver, String locatorType, String locatorValue) {

		WebDriverWait wait = new WebDriverWait(driver, TimeOuts.TIME_IN_SECONDS);
		boolean isClicked = true;

		try {
			switch (locatorType) {
			case "CLASSNAME":
				wait.until(ExpectedConditions.elementToBeClickable(By.className(locatorValue)));
				driver.findElement(By.className(locatorValue)).click();
				break;
			case "CSSSELECTOR":
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locatorValue)));
				driver.findElement(By.cssSelector(locatorValue)).click();
				break;
			case "ID":
				wait.until(ExpectedConditions.elementToBeClickable(By.id(locatorValue)));
				driver.findElement(By.id(locatorValue)).click();
				break;
			case "LINKTEXT":
				wait.until(ExpectedConditions.elementToBeClickable(By.linkText(locatorValue)));
				driver.findElement(By.linkText(locatorValue)).click();
				break;
			case "NAME":
				wait.until(ExpectedConditions.elementToBeClickable(By.name(locatorValue)));
				driver.findElement(By.name(locatorValue)).click();
				break;
			case "PARTIALLINKTEXT":
				wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(locatorValue)));
				driver.findElement(By.partialLinkText(locatorValue)).click();
				break;
			case "TAGNAME":
				wait.until(ExpectedConditions.elementToBeClickable(By.tagName(locatorValue)));
				driver.findElement(By.tagName(locatorValue)).click();
				break;
			case "XPATH":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.xpath(locatorValue)).click();
				break;
			default:
				break;
			}
		} catch (IllegalArgumentException illegalArgumentException) {
			isClicked = false;
			report.info("Locator type doesn't exist due to IAException" + illegalArgumentException.getCause());
		} catch (NullPointerException nullPointerException) {
			isClicked = false;
			report.info("Locator type doesn't exist due to NPException" + nullPointerException.getCause());
		} catch (Exception e) {
			isClicked = false;
			report.info("Locator type doesn't exist " + e.getCause());
		}

		return isClicked;

	}

}
