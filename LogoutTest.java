package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogoutPage;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest() {
        LogoutPage logout = new LogoutPage(driver);
        logout.logout();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }
}
