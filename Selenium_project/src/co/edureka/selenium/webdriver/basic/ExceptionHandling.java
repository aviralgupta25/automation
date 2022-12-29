package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ExceptionHandling {
    static WebDriver driver;
   // InterruptedException whenever Thread.sleep is their
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
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
//        try {
//            driver.findElement(By.className("temp")).click();
//        } catch (Exception e) {
//            System.out.println("Element not found");
//            // throw new RuntimeException(e);
//            throw(e);
//        }
//        finally {
//            System.out.println("In finally block");
//        }
        try{
            driver.switchTo().alert().accept();
        }
        catch (NoAlertPresentException E){
            E.printStackTrace();
        }

    }
}
