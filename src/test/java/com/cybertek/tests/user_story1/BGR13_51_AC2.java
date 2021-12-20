package com.cybertek.tests.user_story1;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import org.testng.annotations.Test;

// Test Created by David Ward
// Test is for User Story 1, Acceptance Criteria 2

// class extends parent TestBase for Before and After methods, along with some objects
public class BGR13_51_AC2 extends TestBase {

    @Test
    public void loginToLibraryTest(){
        // library2 is in configuration.properties to grab website
        driver.get(ConfigurationReader.getProperty("library2"));


    }
}
