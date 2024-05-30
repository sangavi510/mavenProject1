

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CreateDriverSession {
	public static void main (String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName","uiautomator2@3.2.0");
		caps.setCapability("deviceName","device");
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("udid","RZ8T907S1SD");
		//caps.setCapability("app","C:\\Users\\Admin\\eclipse-workspace\\maven1\\src\\main\\resources\\ApiDemos-debug.apk");
		
		//appPackage and appActivity are used when the app is already installed in the device
		caps.setCapability("appPackage", "io.appium.android.apis");
		caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		//Alternate way to set capabilities
		
		/*UiAutomator2Options options=new UiAutomator2Options().setPlatformName("uiautomator2@3.2.0");
		options.setCapability("platformName","uiautomator2@3.2.0");*/
		
		//provide appium Ip and port address as URL for driver to access
	
		URL url=new URL("http://0.0.0.0:4723");
		
		//create android driver session
		AppiumDriver driver=new AndroidDriver(url,caps);
	}

}
