package testbaba_pages;

import application_uitility.Application_uitility;
import base_liybreary.Base_test;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auto_complete_Page extends Base_test
{
    public Auto_complete_Page()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@data-target='#widget']")
    private WebElement widgets;

    @FindBy(xpath = "//a[@href='#tab_23']")
    private WebElement menu;

    @FindBy(xpath = "//li[contains(text(),'                                        Services ')]")
    private WebElement services;

    @FindBy(xpath = "//a[contains(text(),'Website Design')]")
    private WebElement web_design;


    public void widgets_click()
    {
        Application_uitility.click_element(widgets);
    }

    public void menu_click()
    {
        Application_uitility.wait_for(5);
        Application_uitility.scroll_till_element(menu);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,360)", "");
        Application_uitility.click_element(menu);
    }

    public void services_click()
    {
        Application_uitility.wait_for(5);
        Application_uitility.mouse_hover(services);
        String ankit = Application_uitility.get_text(web_design);
        System.out.println(ankit);
    }
}
