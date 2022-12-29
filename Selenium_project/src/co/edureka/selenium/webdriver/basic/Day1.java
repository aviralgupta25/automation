package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day1 {
    WebDriver driver;
    JavascriptExecutor jse;
    public void invokeBrowser(){
        // With Using ctrl-alt-T
        try {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Aviral\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            // do page synchronization (wait for page to load , so controlling code)
            // Code , web app / web browser to be synchronised
            // Implecite
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            // pageLoad
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

            driver.get("https://www.ajio.com/men-jeans/c/830216001");
            searchCource();
        } catch (Exception e) {
            e.printStackTrace();
            // throw new RuntimeException(e);
        }
    }
    public  void searchCource() throws InterruptedException {
        // driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys("Nike");
        // Thread.sleep(3000);
        // driver.findElement(By.className("ic-search")).click();
        // //*[@id="facets"]/div[2]/ul/li[2]/div/div/div[2]/ul/li[1]/div/div/label
           // Typecast
            jse = (JavascriptExecutor)driver;
            // jse.executeScript("scroll(0,500)");
        // Right click on HTML -> Copy -> Copy XML
           driver.findElement(By.xpath("//*[@id=\"facets\"]/div[2]/ul/li[2]/div/div/div[2]/ul/li[1]/div/div/label")).click();


    }
    public static void main(String[] args) {
        Day1 myobj =new Day1();
        myobj.invokeBrowser();
        // First Open in minimised form , then maximise it .
        // Selenium can only find elements that are visible to the page .
        // findElement (By arg0 ) is a function locator technique


    }
}
