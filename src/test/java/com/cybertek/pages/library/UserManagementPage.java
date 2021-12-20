package com.cybertek.pages.library;

import com.cybertek.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public class UserManagementPage extends BasePage{

    String fullName;

    @FindBy(xpath = "//a[.=' Add User']")
    public WebElement addUserButton;

    @FindBy(name = "full_name")
    public WebElement fullNameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "address")
    public WebElement addressBox;

    @FindBy(xpath = "//button[.='Save changes']")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//table[@id='tbl_users']//tr[1]/td[3]")
    public WebElement newestUserAdded;

    public void isCurrentPage(){
        String expectedHeader = "User Management";
        WebElement actualHeader = driver.findElement(By.tagName("h3"));
        assertEquals(actualHeader.getText(), expectedHeader);
    }

    public void clickAddUserButton(){
        addUserButton.click();
    }

    public void addUser(){
        fullName = faker.name().fullName();

        fullNameBox.sendKeys(fullName);
        passwordBox.sendKeys(faker.internet().password());
        emailBox.sendKeys(faker.internet().emailAddress());
        addressBox.sendKeys(faker.address().fullAddress());
        saveChangesButton.click();
    }

    public void verifyUserCreation(){
        BrowserUtils.sleep(2);
        //System.out.println("newestuser: " + newestUserAdded.getText());
        //System.out.println("fullName = " + fullName);
        assertEquals(fullName, newestUserAdded.getText() );
    }
}
