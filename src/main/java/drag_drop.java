import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.List;

public class drag_drop {
    AndroidDriver driver;
    public final By circle1 = AppiumBy.id("io.appium.android.apis:id/drag_dot_1");
    public  final By circle2 = AppiumBy.id("io.appium.android.apis:id/drag_dot_2");


    public drag_drop(AndroidDriver driver) {
        this.driver = driver;
    }

    public void drag_drop_test() {
        // Java
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) driver.findElement(circle1)).getId(),
                "endX", 622,
                "endY", 567,
                "speed" , 300
        ));

    }
}
