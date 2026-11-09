import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class prerefrence_dependenses {
    AndroidDriver driver;
            public final By checkbox = AppiumBy.id("android:id/checkbox");
            public final By  wifi_setting = AppiumBy.androidUIAutomator("new UiSelector().text(\"WiFi settings\")");
            public final By textfield = AppiumBy.id("android:id/edit");
            public final By okay =  AppiumBy.id("android:id/button1");

    public prerefrence_dependenses(AndroidDriver driver) {
        this.driver = driver;
    }

    public void click_checkbox(){
         driver.findElement(checkbox).click();

    }
    public void click_wifi_setting(){
        driver.findElement(wifi_setting).click();

    }
    public void click_okay(){
        driver.findElement(okay).click();

    }
    public void send_data(String text){
        driver.findElement(textfield).sendKeys(text);
    }

}
