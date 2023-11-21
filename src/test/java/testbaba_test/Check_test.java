package testbaba_test;

import application_uitility.Application_uitility;
import base_liybreary.Base_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testbaba_pages.Check_Page;

public class Check_test extends Base_test
{
    Check_Page ob;
    @BeforeTest
    public void geturllaunch()
    {
            getlaunch();
            ob = new Check_Page();
    }

    @Test(priority = 1)
    public void click_on_elements()
    {
        ob.element_click();
    }

    @Test(priority = 2)
    public void click_on_check_box()
    {
        ob.click_check_box();
    }

    @Test(priority = 3)
    public void click_on_mobile()
    {
        ob.click_mobile();
    }

    @Test(priority = 4)
    public void click_on_laptop()
    {
        ob.click_laptop();
    }

    @Test(priority = 5)
    public void click_on_desktop()
    {
        ob.click_desktop();
    }
}
