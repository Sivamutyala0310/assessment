package com.atmecs.Assesement.dataallocators;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.Assesement.constants.ConstantFilePaths;
import com.atmecs.Assesement.utils.ReadLocatorsFile;

public class AssesementValidationDataAllocators
{
Properties properties;
	
	// define String variables
	
	
	
	
	
	
	public void getData() throws IOException {
		properties = ReadLocatorsFile.loadProperty(ConstantFilePaths.VALIDATIONTESTDATA_FILE);
		
		
		// calling setters();
		
		


	
	
	
	
	
}
	/*
	 * public void setClickOnAboutUsXpath() { clickOnAboutUsXpath =
	 * properties.getProperty("clickOnAboutUsXpath"); }
	 */
	
	// implementation setters and getters
	
	
	public static void main(String[] args) throws IOException {
		AssesementValidationDataAllocators keys = new AssesementValidationDataAllocators();
		keys.getData();
	}
}
