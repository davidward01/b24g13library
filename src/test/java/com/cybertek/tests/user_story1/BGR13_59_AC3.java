package com.cybertek.tests.user_story1;

import com.cybertek.pages.library.LibraryLoginPage;
import com.cybertek.pages.library.LibraryLoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BGR13_59_AC3 extends TestBase {

    @Test
    public void libraryInvalidDataLoginTest(){
        driver.get(ConfigurationReader.getProperty("library2"));
        LibraryLoginPage loginPageObj = new LibraryLoginPage();

        //enter invalid email and password
        loginPageObj.email.sendKeys(ConfigurationReader.getProperty("invalidEmail"));
        loginPageObj.password.sendKeys("invalidPassword");
        loginPageObj.signInBtn.click();

        //verify the error msg
        String actualResult=loginPageObj.errorMsg.getText();
        String expectedResult="Sorry, Wrong Email or Password";
        Assert.assertEquals(actualResult,expectedResult);
    }

}
