package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static FileInputStream fs;
	public static Properties prop;
	public static WebDriver driver;
	
	//dfgthyjuki

	public BaseTest() throws IOException {
		prop = new Properties();
		try {
			fs = new FileInputStream(
					"C:\\Users\\TOSHIBA\\eclipse-workspace\\new\\src\\main\\java\\com\\qa\\config\\config.properties");

			prop.load(fs);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}

	public static void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TOSHIBA\\eclipse-workspace\\new\\src\\main\\java\\com\\qa\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("");

	}
}
