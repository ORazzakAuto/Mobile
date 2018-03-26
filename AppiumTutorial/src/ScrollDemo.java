import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		/** This needs to be researched, incase the android devices are slower
		Dimension size = driver.manage().window().getSize();
		int x =size.getWidth() / 2;
		int starty = (int) (size.getHeight() * 0.60);
		int endy = (int) (size.getHeight() * 0.10);
		driver.swipe(x, starty, x, endy, 2000);
		**/
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
		driver.findElementByAndroidUIAutomator("text(\"WebView\")").click();
		
		
		
		

	}

}
