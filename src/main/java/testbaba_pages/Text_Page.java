package testbaba_pages;

import application_uitility.Application_uitility;
import base_liybreary.Base_test;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Text_Page extends Base_test
{
    public Text_Page()
    {

        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[@data-target='#elements']//..//..//..//div[@class='card-header']")
    private WebElement ele;

    @FindBy(xpath = "//a[contains(text(),'text box')]")
    private WebElement text;

    @FindBy(id = "fullname1")
    private WebElement full_name;

    @FindBy(id = "fullemail1")
    private WebElement email;

    @FindBy(id = "fulladdresh1")
    private WebElement current_address;

    @FindBy(id = "paddresh1")
    private WebElement permanent_address;

    @FindBy(xpath = "//input[contains(@type,'button')]")
    private WebElement submit;

    public void element_click()
    {
        Application_uitility.click_element(ele);
    }

    public void click_text_box()
    {
        Application_uitility.click_element(text);
    }

    public void fill_detalis()
    {
        Application_uitility.set_text(full_name, "Ankit Kumar");
        Application_uitility.set_text(email, "ankitkumar@gmail.com");
        Application_uitility.set_text(current_address, "Noida sec-122");
        Application_uitility.set_text(permanent_address, "Sarai Rasool Pur Khatauli Muzaffarnagar");
        Application_uitility.click_element(submit);
    }

}
