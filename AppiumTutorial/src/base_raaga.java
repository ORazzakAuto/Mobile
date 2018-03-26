import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class base_raaga {
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		
		// TODO Auto-generated method stub
	 File f= new File("src");
     File fs= new File(f,"Raaga.apk");
     
     DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TestEmu");
    cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
     return driver;
	    
	}
}