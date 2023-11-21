package testbaba_pages;

import application_uitility.Application_uitility;
import base_liybreary.Base_test;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Alert_Page extends Base_test
{
    public Alert_Page()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@data-target='#alerts']")
    private WebElement alerts_frame;

    @FindBy(xpath = "//a[contains(text(),'alerts')]")
    private WebElement alerts;

    @FindBy(xpath = "//button[contains(@onclick,'myalert()')]")
    private WebElement see_alerts;

    @FindBy(xpath = "//button[contains(@onclick,'aftersec5()')]")
    private WebElement see_5_alerts;

    @FindBy(xpath = "//button[contains(@onclick,'myconfirm()')]")
    private WebElement ok_alerts;

    @FindBy(id = "confirm-result")
    private WebElement ok_alerts_text;

    @FindBy(xpath = "//button[contains(@onclick,'myprompt()')]")
    private WebElement S_text_alerts;

    public void alerts_frame_click()
    {
        Application_uitility.click_element(alerts_frame);
    }

    public void alerts_click()
    {
        Application_uitility.click_element(alerts);
    }

    public void see_alerts_click()
    {
        Application_uitility.click_element(see_alerts);
        driver.switchTo().alert().accept();
    }

//    public void alerts_5_click()
//    {
//        Application_uitility.alert_is_persent_click(see_5_alerts, Duration.ofSeconds(5));
//        Application_uitility.wait_for(5);
//        driver.switchTo().alert().accept();
//    }

    public void ok_alerts_click()
    {
        Application_uitility.click_element(ok_alerts);
        driver.switchTo().alert().dismiss();
        String ok_alert_text = Application_uitility.get_text(ok_alerts_text);
        System.out.println(ok_alert_text);
    }

    public void send_alerts_click()
    {
        Application_uitility.click_element(S_text_alerts);
        driver.switchTo().alert().sendKeys("Ankit Kumar Pal");
        driver.switchTo().alert().accept();

    }
}
