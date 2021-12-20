package com.cybertek.pages.library;

import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class LibraryLoginPage extends BasePage {

//    public LibraryLoginPage() {
//        //Selenium command to initialize the elements below
//        PageFactory.initElements(Driver.getDriver(), this);
//    }

    @FindBy(id="inputEmail")
    public WebElement email; //WebElement email = driver.findElement(By.id("inputEmail"))

    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(xpath="//button[.='Sign in']")
    public WebElement signInBtn;

    @FindBy(xpath="//div[.='Sorry, Wrong Email or Password']")
    public WebElement errorMsg;

    // verify on correct page
    public void isCurrentPage(){
        String libraryTitle = "Login - Library";
        assertEquals(driver.getTitle(), libraryTitle);
    }

    // user -> librarian login
    public void librarianLogin(){
        email.sendKeys(ConfigurationReader.getProperty("library2.librarian.email"));
        password.sendKeys(ConfigurationReader.getProperty("library2.librarian.password"));
        signInBtn.click();
    }

    // user -> student login
    public void studentLogin(){
        email.sendKeys(ConfigurationReader.getProperty("library2.student.email"));
        password.sendKeys(ConfigurationReader.getProperty("library2.student.password"));
        signInBtn.click();
    }

}
