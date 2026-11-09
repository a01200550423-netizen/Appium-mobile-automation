import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class views {
    AndroidDriver driver;
    public final By views_elements = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]");


    public views(AndroidDriver driver) {
        this.driver = driver;
    }

    public void click_one_view(int index) {
        List<WebElement> all_view_element = driver.findElements(views_elements);
        all_view_element.get(index).click();

    }
}
