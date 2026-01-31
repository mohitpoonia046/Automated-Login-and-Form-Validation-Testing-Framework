package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("admin", "admin123");
        Assert.assertTrue(login.isLoginSuccessful());
    }

    @Test
    public void invalidLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("wrong", "123");
        Assert.assertEquals(login.getErrorMessage(),
                "Invalid username or password");
    }
}
