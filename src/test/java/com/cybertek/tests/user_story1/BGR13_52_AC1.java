package com.cybertek.tests.user_story1;

import com.cybertek.pages.library.LibraryLoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BGR13_52_AC1 extends TestBase {

    @Test
    public void LoginFunctionalTest() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("library2"));

        String expectedTitle = "Login - Library";
        String actualTitle = driver.getTitle();


        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS: title verification successful");


        }else{
            System.out.println("FAIL: title verification failed");
        }

        Thread.sleep(2000);
        LibraryLoginPage loginpage = new LibraryLoginPage();
        loginpage.email.sendKeys(ConfigurationReader.getProperty("user"));
        loginpage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginpage.signInBtn.click();

        Thread.sleep(2000);

        String expectedTitle1 = "Library";
        String actualTitle1 = driver.getTitle();


        if(expectedTitle1.equals(actualTitle1)){
            System.out.println("PASS: title verification successful");


        }else{
            System.out.println("FAIL: title verification failed");
        }


    }

}