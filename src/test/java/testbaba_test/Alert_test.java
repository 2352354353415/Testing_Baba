package testbaba_test;

import base_liybreary.Base_test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testbaba_pages.Alert_Page;


public class Alert_test extends Base_test
{
    Alert_Page ob;
    @BeforeTest
    public void geturllaunch()
    {
        getlaunch();
        ob = new Alert_Page();
    }

    @Test(priority = 1)
    public void click_on_alert_frame()
    {
        ob.alerts_frame_click();
    }

    @Test(priority = 2)
    public void click_on_alert()
    {
        ob.alerts_click();
    }

    @Test(priority = 3)
    public void click_on_see_alert()
    {
        ob.see_alerts_click();
    }
//    @Test(priority = 4)
//    public void click_on_see_5_alert()
//    {
//        ob.alerts_5_click();
//    }

    @Test(priority = 4)
    public void click_on_ok_alert()
    {
        ob.ok_alerts_click();
    }

    @Test(priority = 5)
    public void click_on_send_alert()
    {
        ob.send_alerts_click();
    }
}
