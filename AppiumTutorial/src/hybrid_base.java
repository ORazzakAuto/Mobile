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

public class hybrid_base {
	
	public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {
		
		// you add the string device argument , to handle both real device and emulator 
		// TODO Auto-generated method stub
	 File f= new File("src");
     File fs= new File(f,"ApiDemos-debug.apk");
     
     DesiredCapabilities cap = new DesiredCapabilities();
     
    if(device.equals("emulator")) 
    {	
    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TestEmu");
    }
    else if(device.equals("real")) 
    {
    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
    }
    cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
     return driver;
	    
		
		
	   
	}
	
}
	