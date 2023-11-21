package testbaba_test;

import base_liybreary.Base_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testbaba_pages.Menu_Page;

public class Menu_test extends Base_test
{
    Menu_Page ob;
    @BeforeTest
    public void geturllaunch()
    {
        getlaunch();
        ob = new Menu_Page();
    }

    @Test(priority = 1)
    public void click_on_widgets()
    {
        ob.widgets_click();
    }

    @Test(priority = 2)
    public void click_on_menu()
    {
        ob.menu_click();
    }
    @Test(priority = 3)
    public void click_on_services()
    {
        ob.services_click();
    }
}
