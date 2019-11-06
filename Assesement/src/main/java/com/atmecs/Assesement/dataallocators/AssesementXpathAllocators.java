package com.atmecs.Assesement.dataallocators;

import java.io.IOException;
import java.util.Properties;


import com.atmecs.Assesement.constants.ConstantFilePaths;
import com.atmecs.Assesement.utils.ReadLocatorsFile;



public class AssesementXpathAllocators 
{
	Properties properties;
	
	// define String variables
	
	
	
	
	
	
	public void getData() throws IOException {
		properties = ReadLocatorsFile.loadProperty(ConstantFilePaths.LOCATORS_FILE);
		
		
		// calling setters();
		
		


	
	
	
	
	
}
	/*
	 * public void setClickOnAboutUsXpath() { clickOnAboutUsXpath =
	 * properties.getProperty("clickOnAboutUsXpath"); }
	 */
	
	// implementation setters and getters
	
	
	public static void main(String[] args) throws IOException {
		AssesementXpathAllocators keys = new AssesementXpathAllocators();
		keys.getData();
	}
}
