import java.net.URL;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Hybridapp {

			
		public static void main(String[] args) throws MalformedURLException {
				
				
				// TODO Auto-generated method stub
			File f= new File("src");
		    File fs= new File(f,"selendroid-test-app.apk");
		    
		     
		    DesiredCapabilities cap = new DesiredCapabilities();	
		    //cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TestEmu");
		    cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");// Maximum timeout to when this throws a error
		    cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());// You are giving this absolute path which is the test.apk to your cap object 
		    AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    System.out.println(driver.getContext());// Trying to see what the current context handle which our app is in, what veew our app is currently in
		    driver.findElementById("io.selendroid.testapp:id/my_text_field").sendKeys("http://www.google.com");
		    Set<String> s=driver.getContextHandles();// This will allow the user to set either Native or Web as a string so driver.context can get executed. 
		    //1 Native 1 Web
		    for(String handle : s) 
		    {
		    	System.out.println(handle);
		    }
		    
		    driver.context("WEBVIEW_com.exmaple.testapp");// with this method you can switch from a native view to a web view. Very important if you are dealing with a hybrid app 
		    driver.findElementByName("q").sendKeys("Handling hybrid app");// Automatically the context argument will change it to web view from native
		    driver.context("Native_APP");
		    /*
		     * Problems that can occur is that some developers will not enable the webview action,
		     for this to work, ask the developer to call the static method : setWebContentsDebuggingEnabled on the Webview class.
		     */
			
		    
			    
				
				
	}

}
