package mavenProject1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateDriverSession {
	public static void main (String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName","uiautomator2@3.2.0");
		caps.setCapability("deviceName","device");
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("udid","RZ8T907S1SD");
		caps.setCapability("app","C:\\Users\\Admin\\eclipse-workspace\\mavenProject1\\src\\main\\resources\\ApiDemos-debug.apk");
		
		URL url=new URL("http://0.0.0.0:4723");
		
		AppiumDriver driver=new AndroidDriver(url,caps);
	}

}
