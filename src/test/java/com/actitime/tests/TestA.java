package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestA {
	@Test
	public void create()
	{
		Reporter.log("hi",true);
	}
	@Test(priority=1)
	public void edit()
	{
		Reporter.log("edit",true);
	}

}
