package base_liybreary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base_test
{

    public static WebDriver driver;
    String URL = "https://testingbaba.com/old/";

    public void getlaunch()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/ankitkumar/Downloads/chromedriver-mac-x64 2/chromedriver");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//h5[contains(text(),'New batch')]//..//button")).click();
        driver.findElement(By.xpath("//a[text()='Practice']")).click();
    }
}
