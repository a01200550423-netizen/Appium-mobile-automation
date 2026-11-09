import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage {
    AndroidDriver Mydriver;
    public final By allelements = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]");


    public Homepage(AndroidDriver Mydriver){
        this.Mydriver = Mydriver;

    }

    public void click_one_element(int index){
        List<WebElement> all_home_element = Mydriver.findElements(allelements);

        all_home_element.get(index).click();

    }

}
