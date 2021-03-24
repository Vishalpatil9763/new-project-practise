package com.qa.pages;

import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class RegisterPage extends BaseTest {

	@FindBy(xpath = "//button[@type='button']")
	WebElement helpButton;
	
	@FindBy(xpath =" //img[@alt='Login']")
	WebElement loginButton;
	

	public RegisterPage() throws IOException {
		PageFactory.initElements(driver, this);

	}
	
	public String validateLoginButton() {
		String text=loginButton.getText();
		return text;
		
		
	}

}
