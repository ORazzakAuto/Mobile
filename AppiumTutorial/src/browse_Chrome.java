import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class browse_Chrome extends base_chrome {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		//There maybe a issue with the chrome version on the android device 
		/*
		driver.get("https://www.facebook.com");
		driver.findElementByXPath("//*[@id=\'m_login_email\']").sendKeys("hello");
		driver.findElementByName("pass").sendKeys("hello");
		driver.findElementByName("login").click();
		*/
		
		driver.get("https://cricbuzz.com");
		driver.findElementByXPath("//a[@href='#menu']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"top\"]/div/div[17]/table/tbody/tr[1]/td[1]/a").click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		
		//To scroll in mobile browser one has to use the javascript executor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//One scroll's coordinates are usually 250, but that depends on how much you want to scroll 
		jse.executeScript("window.scrollBy(0,480)", "");
		
		//To use assertions you need to download the jar file TestNg
		Assert.assertTrue(driver.findElementByXPath("//h4[text()='Top Stories']").getAttribute("class").contains("header"));
		
		
		

	}

}
