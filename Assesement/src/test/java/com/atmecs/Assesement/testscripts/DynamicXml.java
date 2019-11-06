package com.atmecs.Assesement.testscripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.atmecs.Assesement.constants.ConstantFilePaths;
import com.atmecs.Assesement.utils.ReadLocatorsFile;

public class DynamicXml
{
		String browsername;
		String browser;

		@SuppressWarnings("deprecation")
		@Test
		public void base() throws IOException {
		browsername = ReadLocatorsFile.getData(ConstantFilePaths.CONFIG_FILE,"browserType");
		
		String[] browser = browsername.split(",");

		XmlSuite xmlsuite = new XmlSuite();
		xmlsuite.setName("suitename");
		xmlsuite.setVerbose(2);
		xmlsuite.setThreadCount(3);
		xmlsuite.setParallel("tests");
		for (String element : browser) {
		XmlTest xmltest = new XmlTest(xmlsuite);
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put("browsername", element);
		xmltest.setParameters(parameter);
		xmltest.setName("Test validate " + element);

		XmlClass homePage = new XmlClass(AssesementTestcase.class);
		List<XmlClass> list = new ArrayList<XmlClass>();
		list.add(homePage);
		xmltest.setXmlClasses(list);

		}

		TestNG testng = new TestNG();
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(xmlsuite);
		testng.setXmlSuites(suites);

		testng.run();

		}

}
