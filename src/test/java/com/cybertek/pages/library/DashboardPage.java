package com.cybertek.pages.library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public class DashboardPage extends BasePage {


    public void isCurrentPage(){
        String dashboardTitle = "Library";

        // had to wait for title to load to get test to pass
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs(dashboardTitle));

        assertEquals(driver.getTitle(), dashboardTitle);
    }

    public void clickUsersLink(){
        usersLink.click();
    }


}
