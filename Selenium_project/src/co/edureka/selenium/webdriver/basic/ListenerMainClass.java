package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.net.URL;
public class ListenerMainClass {
    public static final String USERNAME = "prakharkulshresh2";
    public static final String AUTOMATE_KEY = "dphXto2bxDtgA3DsVRVy";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

        // A interface that execute java through selenium web driver
        JavascriptExecutor jse = ((JavascriptExecutor)driver);
        // A class that implements web driver interface
        EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
        EventCapture ecapture = new EventCapture();

        // Register and unregister eventHandler , Register so that our web driver listener can listen
        eventHandler.register(ecapture);
        eventHandler.navigate().to("http://www.google.com");
        WebElement element = eventHandler.findElement(By.name("q"));
        element.sendKeys("BrowserStack");
        element.submit();
        System.out.println(driver.getTitle());
        eventHandler.unregister(ecapture);
        driver.quit();
    }
}
