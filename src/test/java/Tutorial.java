import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Tutorial {

    @Test
    public void calculatorTest(){
        AppiumDriver<MobileElement> driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","");
        capabilities.setCapability("udid","");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage", "com.oneplus.calculator");
        capabilities.setCapability("appActivity", "com.oneplus.calculator.Calculator");
        capabilities.setCapability("noReset", "true");

        //Instantiate Appium Driver
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            driver.findElement(By.id("digit_9")).click();
            driver.findElement(By.id("op_add")).click();
            driver.findElement(By.id("digit_3")).click();
            driver.findElement(By.id("eq")).click();

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }




    }
}
