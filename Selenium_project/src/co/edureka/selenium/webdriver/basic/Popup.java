package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
//     In Selenium web driver there are methods through which we can handle multiple windows.
//        Driver.getWindowHandles();
//        To handle all opened windows by web driver, we can use “Driver.getWindowHandles()”
//        and then we can switch window from one window to another in a web application.
//        Its return type is Iterator<String>.
//
//        Driver.getWindowHandle();
//        When the site opens, we need to handle the main window by driver.getWindowHandle().
//        This will handle the current window that uniquely identifies it within this driver instance.
//        Its return type is String.

public class Popup {
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

        //Launching the site.
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String MainWindow=driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");

                driver.findElement(By.name("btnLogin")).click();

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }
}
