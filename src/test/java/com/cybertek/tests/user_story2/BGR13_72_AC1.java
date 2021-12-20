package com.cybertek.tests.user_story2;

import com.cybertek.pages.library.DashboardPage;
import com.cybertek.pages.library.LibraryLoginPage;
import com.cybertek.pages.library.UserManagementPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BGR13_72_AC1 extends TestBase {

    @Test
    public void createNewUser() {
        // open browser
        driver.get(ConfigurationReader.getProperty("library2.url"));

        // verify correct page and login
        LibraryLoginPage login = new LibraryLoginPage();
        login.isCurrentPage();
        login.librarianLogin();

        // verify on correct page, click Users link
        DashboardPage dashboard = new DashboardPage();
        dashboard.isCurrentPage();
        dashboard.clickUsersLink();

        //verify on correct page, click +Add User button
        UserManagementPage userManagemet = new UserManagementPage();
        userManagemet.isCurrentPage();
        userManagemet.clickAddUserButton();
        userManagemet.addUser();

        //verify user has been created
        userManagemet.verifyUserCreation();
    }
}
