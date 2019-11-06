package com.atmecs.Assesement.testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.atmecs.Assesement.constants.ConstantFilePaths;
import com.atmecs.Assesement.reports.LogReports;
import com.atmecs.Assesement.utils.ReadLocatorsFile;

	/**
	* Different browser setup(Chrome,Firefox,Internet Explorer)
	*/

public class TestBase 
{
	LogReports log = new LogReports();
	Properties baseProperty;
	String url;
	String browser;
	String browserTypeConnection;
	public WebDriver driver;
	GridTestBase testBase=new GridTestBase();
	
	@BeforeTest
	public void initializeBrowser() throws Exception {
		
		baseProperty = ReadLocatorsFile.loadProperty(ConstantFilePaths.CONFIG_FILE);
		url = baseProperty.getProperty("url");
		browser = baseProperty.getProperty("browserType");
		browserTypeConnection=baseProperty.getProperty("connectionType");
		
		if(browserTypeConnection.equalsIgnoreCase("normal"))
		{
		if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", ConstantFilePaths.CHROME_FILE);
			driver = new ChromeDriver();
			log.info("Chrome browser is started...");
		} 
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", ConstantFilePaths.FIREFOX_FILE);
			driver = new FirefoxDriver();
			log.info("Firefox browser is started...");
		} 
		else if (browser.equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver", ConstantFilePaths.IE_FILE);
			driver = new InternetExplorerDriver();
			log.info("IE browser is started...");
		}
		}
		else if(browser.equalsIgnoreCase("gridBrowserConnection"))
		{
			testBase.initializeBrowser();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	  @AfterSuite
	  public void quitDriver()
	  {
		  driver.quit();
	  }
	
}
