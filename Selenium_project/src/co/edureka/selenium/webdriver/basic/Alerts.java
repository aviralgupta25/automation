package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    static WebDriver driver;
    public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aviral\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        // Implicit Wait for 20 seconds
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // page load Timeout
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);


        // Alert Message handling

        driver.get("http://demo.guru99.com/test/delete_customer.php");


        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting alert
        alert.accept();
    }

}
