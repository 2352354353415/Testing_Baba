package testbaba_pages;

import application_uitility.Application_uitility;
import base_liybreary.Base_test;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Button_Page extends Base_test
{
    public Button_Page()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@data-target='#elements']//..//..//..//div[@class='card-header']")
    private WebElement ele;

    @FindBy(xpath = "//a[@href='#tab_5']")
    private WebElement buttons;

    @FindBy(xpath = "//button[@onclick='clicktext()']")
    private WebElement click_me;

    @FindBy(id = "click-content")
    private WebElement click_me_text;

    @FindBy(id = "noContextMenu")
    private WebElement right_click;

    @FindBy(id = "right-content")
    private WebElement right_click_text;

    @FindBy(xpath = "//button[@ondblclick='doubletext()']")
    private WebElement double_click;

    @FindBy(id = "double-content")
    private WebElement double_click_text;

    public void element_click()
    {
        Application_uitility.click_element(ele);
    }

    public void button_click()
    {
        Application_uitility.click_element(buttons);
    }

    public void click_me_click()
    {
        Application_uitility.click_element(click_me);
        String click_text = Application_uitility.get_text(click_me_text);
        System.out.println(click_text);
    }

    public void click_right_click()
    {
        Application_uitility.wait_for(2);
        Application_uitility.right_click_elememt(right_click);
        String right_text = Application_uitility.get_text(right_click_text);
        System.out.println(right_text);
    }

    public void click_double_click()
    {
        Application_uitility.wait_for(2);
        Application_uitility.double_click(double_click);
        String double_text = Application_uitility.get_text(double_click_text);
        System.out.println(double_text);
    }

}
