package com.cybertek.tests.user_story1;

import com.cybertek.pages.US1AC2LibraryPOM;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class BGR13_58_AC2 extends TestBase {

    @Test
    public void libraryLoginFunctionalityTest(){
        driver.get(ConfigurationReader.getProperty("library2"));
        new US1AC2LibraryPOM().verify("https://library2.cybertekschool.com/login.html");
        new US1AC2LibraryPOM().InputAndVerify();


    }

}
