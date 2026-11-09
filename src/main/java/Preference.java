import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Preference {
    AndroidDriver driver;
    public final By Preference_elements = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]");


    public Preference(AndroidDriver driver) {
        this.driver = driver;
    }

    public void click_one_prrefrence(int index) {
        List<WebElement> all_prerefrence_element = driver.findElements(Preference_elements);
        all_prerefrence_element.get(index).click();

    }
}
