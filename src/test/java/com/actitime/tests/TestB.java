package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestB {
	@Test
	public void delete()
	{
		Reporter.log("delete",true);
	}
	@Test
	public void edit()
	{
		Reporter.log("edit",true);
	}

}
