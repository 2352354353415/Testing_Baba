package testbaba_pages;

import application_uitility.Application_uitility;
import base_liybreary.Base_test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Select_menu_Page extends Base_test
{
    public Select_menu_Page()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@data-target='#widget']")
    private WebElement widgets;

    @FindBy(xpath = "//a[@href='#tab_24']")
    private WebElement select_menu;

    @FindBy(xpath = "//label[contains(text(),'Select Value')]//..//select[@class='form-control']")
    private WebElement select_value;

    @FindBy(xpath = "//label[contains(text(),'Select One')]//..//select[@class='form-control']")
    private WebElement select_one;

    public void widgets_click()
    {
        Application_uitility.click_element(widgets);
    }

    public void select_menu_click()
    {
        Application_uitility.wait_for(5);
        Application_uitility.scroll_till_element(select_menu);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,360)", "");
        Application_uitility.click_element(select_menu);
    }

    public void select_value_click()
    {
        Select sle = new Select(select_value);
        sle.selectByVisibleText("Group 1, Option 1");
    }

    public void select_one_click()
    {
        Select sle = new Select(select_one);
        sle.selectByIndex(2);
    }
}
