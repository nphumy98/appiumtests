package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public static AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setup() {
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "MyDevice");
		caps.setCapability(MobileCapabilityType.UDID, "6417d63f5476");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability("appPackage", "com.google.android.calculator");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		//caps.setCapability(MobileCapabilityType.APP, "");//download spk app to apps file
		
		URL url;
		
			url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver= new AppiumDriver<MobileElement>(url,caps);
		//driver= new AndroidDriver<MobileElement>(url,caps);
		//driver= new IOSDriver<MobileElement>(url,caps);
		} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
			System.out.println("Cause is "+e.getCause());
			System.out.println("Message is "+e.getMessage());
				e.printStackTrace();
		}
	
	}
	
	@Test
	public void sampleTest() {
		System.out.println("I'm inside the sample Test");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
