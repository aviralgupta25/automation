package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Robot {
    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aviral\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        // Implicit Wait for 20 seconds
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // page load Timeout
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        //Launching the site.
        driver.get("https://www.browserstack.com/");
}
