package com.atmecs.Assesement.helperpages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.Assesement.constants.ConstantFilePaths;
import com.atmecs.Assesement.pageactions.PageActions;
import com.atmecs.Assesement.pageactions.PageActionsClick;
import com.atmecs.Assesement.pageactions.PageActionsFindElement;
import com.atmecs.Assesement.reports.LogReports;
import com.atmecs.Assesement.utils.FindLocatorType;
import com.atmecs.Assesement.utils.ReadLocatorsFile;

public class ScenarioHelper {
	public WebDriver driver;
	Properties properties;
	LogReports log = new LogReports();
	String locatorProperty;
	String[] locatorData;
	String actualTextTitle;
	
	WebElement element;

	public ScenarioHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void performAction() throws IOException {
		properties=ReadLocatorsFile.loadProperty(ConstantFilePaths.LOCATORS_FILE);
		locatorProperty=properties.getProperty("loc.clickCalendar");
		locatorData = FindLocatorType.findingLocatorValue(locatorProperty);
		PageActionsClick.clickElement(driver, locatorData[0], locatorData[1]);
		
		locatorProperty=properties.getProperty("loc.calendarTable");
		locatorData = FindLocatorType.findingLocatorValue(locatorProperty);
		element=PageActionsFindElement.findWebElement(driver,locatorData[0], locatorData[1]);
		
		List < WebElement > rows_table=element.findElements(By.tagName("tr"));
		System.out.println(rows_table.size()+" "+"No.of rows in the webtable");
		for (int row = 2; row < rows_table.size(); row++) {
			 List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			 for (int column = 0; column < Columns_row.size(); column++) {
				 String celtext = Columns_row.get(column).getText();
				 System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
			 }
		}
		
		
		

	}
}
