package testbaba_pages;

import application_uitility.Application_uitility;
import base_liybreary.Base_test;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Page extends Base_test

{
    public Check_Page()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@data-target='#elements']//..//..//..//div[@class='card-header']")
    private WebElement ele;

    @FindBy(xpath = "//a[contains(text(),'check box')]")
    private WebElement check_box;

    @FindBy(xpath = "//input[@id='myCheck']")
    private WebElement mobile;

    @FindBy(xpath = "//h6[contains(text(),'You are selected Mobile')]")
    private WebElement mobile_text;

    @FindBy(xpath = "//input[@id='mylaptop']")
    private WebElement laptop;

    @FindBy(xpath = "//h6[contains(text(),'You are Selected Laptop')]")
    private WebElement laptop_text;

    @FindBy(xpath = "//input[@id='mydesktop']")
    private WebElement desktop;

    @FindBy(xpath = "//h6[contains(text(),'You are Selected Desktop')]")
    private WebElement desktop_text;

    public void element_click()
    {
        Application_uitility.click_element(ele);
    }

    public void click_check_box()
    {
        Application_uitility.click_element(check_box);
    }

    public void click_mobile()
    {
        Application_uitility.wait_for(2);
        driver.switchTo().frame(0);
        Application_uitility.click_element(mobile);
        String mobile = Application_uitility.get_text(mobile_text);
        System.out.println(mobile);
    }

    public void click_laptop()
    {
        Application_uitility.wait_for(2);
        Application_uitility.click_element(laptop);
        String laptop = Application_uitility.get_text(laptop_text);
        System.out.println(laptop);
    }

    public void click_desktop()
    {
        Application_uitility.wait_for(2);
        Application_uitility.click_element(desktop);
        String desktop = Application_uitility.get_text(desktop_text);
        System.out.println(desktop);
        driver.switchTo().defaultContent();
    }

}
