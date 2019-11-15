package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	public static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void openCalculator() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "MyDevice");
		cap.setCapability("udid", "6417d63f5476");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started...");
		
		MobileElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		MobileElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		MobileElement three = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
		MobileElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		MobileElement result = driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
		
		two.click();
		plus.click();
		three.click();
		//equals.click();
		
		String res= result.getText();
		System.out.println("Result is "+res);
		System.out.println("Completed...");
	}

}
