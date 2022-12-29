package co.edureka.selenium.webdriver.basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

// Explicit ways
public class Waits {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aviral\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        // Implicit Wait for 20 seconds
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // page load Timeout
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        WebElement email= driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));
        sendKeys(driver, email, 10, "avi@gmail.com");
        sendKeys(driver, password, 20, "Aviral@123");
        WebElement forgotAccount = driver.findElement(By.linkText("Forgotten password?"));
        clickOn(driver,forgotAccount, 10);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value){
        new WebDriverWait(driver1,
                timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
    public static void clickOn(WebDriver driver1, WebElement element, int timeout)
    {
        new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}