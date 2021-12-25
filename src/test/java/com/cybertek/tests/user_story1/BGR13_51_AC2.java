package com.cybertek.tests.user_story1;

import com.cybertek.pages.library.DashboardPage;
import com.cybertek.pages.library.LibraryLoginPage;
import com.cybertek.pages.library.UserManagementPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Test created by David Ward
 * User Story 1, AC 2
 */

public class BGR13_51_AC2 extends TestBase {
    @Test
    public void testLibraryLoginFunctionality() {

        driver.get(ConfigurationReader.getProperty("library2.url"));

        // create new library login page object
        LibraryLoginPage login = new LibraryLoginPage();
        // check if we are on the current URL
        login.isCurrentURL();
        // login as a student
        login.studentLogin();

        // verify that the site has two models on the page
        login.verifyTwoModelsOnPage();
    }
}
