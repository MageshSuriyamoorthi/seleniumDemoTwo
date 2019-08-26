package com.Selenium.Testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Selenium.UtilityPackage.mostWanted;

public class OrangeHrm extends mostWanted {
	@Test(priority = 0)
	void test() {
		driver.get("http://www.orangehrm.com");

		driver.findElement(By.xpath("//a[contains(text(),'Contact Sales')]")).click();

		// driver.findElement(By.xpath("//a[@title='Accept Cookies']")).click();

		driver.findElement(By.name("firstname")).sendKeys("AAA");

		driver.findElement(By.name("lastname")).sendKeys("BBB");

		driver.findElement(By.name("company")).sendKeys("XXX");

		driver.findElement(By.name("numemployees")).sendKeys("1111");

		driver.findElement(By.name("phone")).sendKeys("9999999999");

		driver.findElement(By.name("jobtitle")).sendKeys("Demo");

		driver.findElement(By.name("email")).sendKeys("aaa@gmail.com");

		driver.findElement(By.name("country")).sendKeys("India");

	}

	@Test(priority = 1)
	void splTest() {

		driver.findElement(By.xpath("//div[@class='input']//textarea[@name='message']")).sendKeys("hello");
		;
		System.out.println("spl test done successfully");
	}

	@Test(priority = 2)
	void afterSplTest() {

		driver.findElement(By.xpath("//a[@title='Accept Cookies']")).click();

	//	driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
	}

	@Test(priority = 3)
	void splTestThr() {
		driver.findElement(By.xpath("//a[contains(text(),'FREE 30 Day Trial')]")).click();
	}
}
