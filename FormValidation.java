package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormPage;

public class FormValidationTest extends BaseTest {

    @Test
    public void emptyFormValidation() {
        FormPage form = new FormPage(driver);
        form.submitForm();
        Assert.assertTrue(form.isErrorDisplayed());
    }
}
