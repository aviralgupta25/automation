package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestGetCommond {
    WebDriver driver;
    public void invokeBrowser(){
        try {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Aviral\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            // Implicit Wait for 20 seconds
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            // page load Timeout
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            // getCommands();
            // navigateCommands();
            // elementLocatorTechnique();
            // elementLocatorfacebook();
            cssselector();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void getCommands(){
        try {
            driver.get("http://www.amazon.in");
            String titleofpage = driver.getTitle();
            System.out.println("Title of page is " + titleofpage);
            driver.findElement(By.linkText("Mobiles")).click();
            String currentUrl =driver.getCurrentUrl();
            System.out.println("The current URL is " + currentUrl);
           // System.out.println("The current page source is " + driver.getPageSource());
            System.out.println("The current URL is " + currentUrl);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void navigateCommands(){
        try {
            driver.navigate().to("http://www.flipkart.com");
            driver.findElement(By.linkText("Become a Seller")).click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().refresh();

            // driver.close();
            // driver.quit();
            // Double slash means can start anywhere from page
            // driver.findElement(By.xpath("//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[1]/a[1]"));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void elementLocatorTechnique(){
        try {
            driver.navigate().to("https://www.snapdeal.com");
            Thread.sleep(4000);
            // driver.findElement(By.className("col-xs-20 searchformInput keyword")).sendKeys("shoes");
            // By xpath it is working
            driver.findElement(By.xpath("//*[@id=\"inputValEnter\"]")).sendKeys("shoes");
            Thread.sleep(4000);
            // driver.findElement(By.className("sd-icon sd-icon-search-under-catagory lfloat")).click();
            driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span")).click();
            Thread.sleep(4000);
            driver.navigate().to("https://twitter.com/");
            Thread.sleep(4000);
            driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void elementLocatorfacebook(){
        try {
            driver.navigate().to("http://www.facebook.com");
            // Working  driver.findElement(By.name("email")).sendKeys("mobiles");
//            Using CSS selector
//                    <input id ="abc" class ="xyz" />
//                    By.cssSelector(tag#id_value);
//                    By.classSelector(tag.classValue)
//            By.cssSelector(input#abc);
//            By.cssSelector(input.xyz);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Working
    public void cssselector(){
        try {
            driver.navigate().to("http://www.ebay.com");
            Thread.sleep(4000);
            driver.findElement(By.cssSelector("#gh-ac")).sendKeys("OnePlus");
            Thread.sleep(4000);
            // driver.findElement(By.className("sd-icon sd-icon-search-under-catagory lfloat")).click();
            driver.findElement(By.cssSelector("#gh-btn")).click();
            Thread.sleep(4000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       TestGetCommond myobj = new TestGetCommond();
       myobj.invokeBrowser();
    }
}
