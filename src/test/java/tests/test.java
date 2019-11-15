package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class test extends BaseClass{
	@Test
	public void testOne() {
		MobileElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		MobileElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		MobileElement three = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
		MobileElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		MobileElement result = driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
		
		two.click();
		plus.click();
		three.click();
		
		String res= result.getText();
		System.out.println("Result is "+res);
		System.out.println("Completed...");
	}
}
