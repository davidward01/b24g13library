package com.cybertek.pages.library;

import com.cybertek.utils.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class is parent class for all page object classes
 *
 */
public abstract class BasePage {
    protected WebDriver driver;
    protected Faker faker;
    protected Actions actions;

    @FindBy(linkText = "Users")
    public WebElement usersLink;

    public BasePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
        faker = new Faker();
        actions = new Actions(driver);
    }

    public abstract void isCurrentPage();
}
