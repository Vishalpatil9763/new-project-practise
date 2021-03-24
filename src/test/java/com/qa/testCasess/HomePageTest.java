package com.qa.testCasess;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.RegisterPage;

public class HomePageTest extends BaseTest{
	 RegisterPage regPage;

	public HomePageTest() throws IOException {
		super();
	
	}
	 
	
	@BeforeMethod
	
	public void initilization() throws IOException {
		BaseTest.setUp();
		regPage= new RegisterPage();
	}

	@Test
	public void validateLogoButtonTest() {
		
		regPage.validateLoginButton();
	}
}
