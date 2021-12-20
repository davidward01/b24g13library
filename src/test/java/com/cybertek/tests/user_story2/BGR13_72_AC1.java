package com.cybertek.tests.user_story2;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class BGR13_72_AC1 extends TestBase {

    @Test
    public void createNewUser() {
        // login
        driver.get(ConfigurationReader.getProperty("library2.url"));

        LibraryLoginPage librarian = new LibraryLoginPage();
        librarian.librarianLogin();
    }
}
