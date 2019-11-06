package com.atmecs.Assesement.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.Assesement.helperpages.ScenarioHelper;
import com.atmecs.Assesement.reports.LogReports;
import com.atmecs.Assesement.testbase.TestBase;

public class AssesementTestcase2 extends TestBase
{
	LogReports log = new LogReports();
	
@Test
	public void testcase2() throws IOException
	{
	ScenarioHelper helper=new ScenarioHelper(driver);
	helper.performAction();
		Assert.assertFalse((false),"passed");
		System.out.println("intentionally made it failed");}

}
