package com.atmecs.Assesement.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.Assesement.helperpages.ScenarioHelper;
import com.atmecs.Assesement.reports.LogReports;
import com.atmecs.Assesement.testbase.TestBase;
import com.atmecs.Assesement.testbase.TestBaseXml;

	public class AssesementTestcase extends TestBase {
		LogReports log = new LogReports();
	
		@Test
		public void testcase1() throws IOException {
			ScenarioHelper helper=new ScenarioHelper(driver);
			helper.performAction();
	
		}
	}
