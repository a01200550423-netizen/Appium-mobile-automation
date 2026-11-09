import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class Baseclass {
AndroidDriver mydriver;
@BeforeMethod
public void setup() throws MalformedURLException {
    UiAutomator2Options options = new UiAutomator2Options();
    options.setAutomationName("UiAutomator2");
    options.setDeviceName("emulator-5554");
    options.setPlatformName("Android");
    options.setPlatformVersion("16");
    options.setApp("C:\\Users\\Admin\\Downloads\\ApiDemos-release.apk");

     mydriver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
}

@AfterMethod
    public void quit(){
    mydriver.quit();
}

}
