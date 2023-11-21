package testbaba_test;

import base_liybreary.Base_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testbaba_pages.Menu_Page;
import testbaba_pages.Select_menu_Page;

public class Select_menu_test extends Base_test
{
    Select_menu_Page ob;

    @BeforeTest
    public void geturllaunch()
    {
        getlaunch();
        ob = new Select_menu_Page();
    }

    @Test(priority = 1)
    public void click_on_widgets()
    {
        ob.widgets_click();
    }

    @Test(priority = 2)
    public void click_on_select_menu()
    {
        ob.select_menu_click();
    }

    @Test(priority = 3)
    public void click_on_select_value()
    {
        ob.select_value_click();
    }

    @Test(priority = 4)
    public void click_on_one_value()
    {
        ob.select_one_click();
    }
}
