import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Tap
		TouchAction t=new TouchAction(driver);
		//t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		t.tap(driver.findElementsByClassName("android.widget.TextView").get(9)).perform();
		//driver.findElementsByClassName("android.widget.TextView").get(0).click();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		t.press(driver.findElementsByClassName("android.widget.TextView").get(1)).waitAction(Duration.ofSeconds(3)).release().perform();
		System.out.println(driver.findElementsByClassName("android.widget.TextView").get(1).getText());
		
		

	}

}
