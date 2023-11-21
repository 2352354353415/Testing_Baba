package testbaba_test;

import base_liybreary.Base_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testbaba_pages.Button_Page;

public class Button_test extends Base_test
{
    Button_Page ob;
    @BeforeTest
    public void geturllaunch()
    {
        getlaunch();
        ob = new Button_Page();
    }

    @Test(priority = 1)
    public void click_on_elements()
    {
        ob.element_click();
    }

    @Test(priority = 2)
    public void click_on_button()
    {
        ob.button_click();
    }

    @Test(priority = 3)
    public void click_on_click_me()
    {
        ob.click_me_click();
    }

    @Test(priority = 4)
    public void click_on_right_click()
    {
        ob.click_right_click();
    }

    @Test(priority = 5)
    public void click_on_double_click()
    {
        ob.click_double_click();
    }



}
