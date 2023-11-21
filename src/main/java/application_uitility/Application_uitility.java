package application_uitility;

import base_liybreary.Base_test;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.time.Duration;

public class Application_uitility extends Base_test
{

    public static void click_element(WebElement element)
    {
        element.click();
    }

    public static void set_text(WebElement element, String text)
    {
        element.sendKeys(text);
    }

    public static String get_text(WebElement element)
    {
        String text = element.getText();
        return text;

    }

    public static void wait_for(int seconds)
    {
        try
        {
            Thread.sleep(seconds);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void right_click_elememt(WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
    }

    public static void double_click(WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }

    public static void alert_is_persent_click(WebElement element, Duration sec)
    {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//        wait.alertIsf

        element.click();
    }

    public static void scroll_till_element(WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public static void mouse_hover(WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
}
