package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Click {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

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
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        //WebElement element = driver.findElement(By.linkText("Get started free"));
        WebElement element = driver.findElement(By.xpath("//*[@id=\"post-26\"]/div[1]/div/div/div/article[1]/div/div/div/div[1]/div/div/div/div/span[5]/button"));
       Thread.sleep(2000);
        action.moveToElement(element).click();

//using click action method

    }
}
