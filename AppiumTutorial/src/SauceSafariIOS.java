import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class SauceSafariIOS {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=DesiredCapabilities.iphone();
		dc.setCapability("platformName", "iOS");// This is only for sauce labs 
		// cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.IOS); You need write this code if you are using a iOS simulator on your local machine
		dc.setCapability("platformVersion", "10.0");// Sauce Labs
		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1"); //Local Machine
		dc.setCapability("appiumVersion", "1.7.2");
		dc.setCapability("deviceName", "iPhone Simulator");
		dc.setCapability("browserName", "safari");
		IOSDriver<IOSElement> driver=new IOSDriver<>(new URL("http://ORazzak:c20b9a82-bb40-4782-b86a-977f3eba80a0@ondemand.saucelabs.com:80/wd/hub"),dc);
		//http://ORazzak:c20b9a82-bb40-4782-b86a-977f3eba80a0@ondemand.saucelabs.com:80/wd/hub
		driver.get("http://www.youtube.com");
		Thread.sleep(8000);
		
		//NOTE! THE OBJECTS SHOULD NOT CHANGE EVEN IF THE TEST IS BEING EXECUTED IN DIFFERENT BROWSERS
	}

}
