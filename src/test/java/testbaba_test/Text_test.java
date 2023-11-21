package testbaba_test;

import base_liybreary.Base_test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testbaba_pages.Text_Page;

public class Text_test extends Base_test
{
    Text_Page ob;
    @BeforeTest
    public void geturllaunch()
    {
        getlaunch();
        ob = new Text_Page();
    }

    @Test(priority = 1)
    public void click_on_elements()
    {
        ob.element_click();
    }

    @Test(priority = 2)
    public void click_on_text_box()
    {
        ob.click_text_box();
    }

    @Test(priority = 3)
    public void fill_full_name()
    {
        ob.fill_detalis();
//        Ankit = driver.findElements(By.xpath("//div[@class='col-md-6 mt-5']//label"));

    }
}
