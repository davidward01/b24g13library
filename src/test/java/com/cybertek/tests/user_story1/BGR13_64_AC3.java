package com.cybertek.tests.user_story1;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BGR13_64_AC3 extends TestBase {

    LibraryLoginPage loginPage = new LibraryLoginPage();

    @Test
    public void validateInvalidLogin(){
        driver.get(ConfigurationReader.getProperty("library2"));


        loginPage.email.sendKeys("123@gmail.com");
        loginPage.password.sendKeys("555");
        loginPage.signInBtn.click();


        String actualResult=loginPage.errorMsg.getText();
        String expectedResult="Sorry, Wrong Email or Password";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
