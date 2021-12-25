package com.cybertek.pages;

import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class US1AC2LibraryPOM {
    public US1AC2LibraryPOM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //constructor

    @FindBy(css = "#inputEmail") public WebElement emailBox;
    @FindBy(css = "#inputPassword") public WebElement passBox;
    @FindBy(css = "button[type = 'submit']") public WebElement signInButton;


    public void verify(String url){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals(url));
    }

    public void InputAndVerify(){

        emailBox.sendKeys(ConfigurationReader.getProperty("user"));
        passBox.sendKeys(ConfigurationReader.getProperty("password"));
        signInButton.click();

        List<WebElement> modelsCount = Driver.getDriver().findElements(By.xpath("//a[@class='nav-link']"));

        Assert.assertTrue(modelsCount.size()== 2);

    }

}
