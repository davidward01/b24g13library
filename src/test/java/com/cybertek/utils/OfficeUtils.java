package com.cybertek.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OfficeUtils {

    static Alert alert;
    //create a static method, will accept String, will return WebElement, getLink(String str)

    public static WebElement getLink(String str){
        return Driver.getDriver().findElement(By.partialLinkText(str));
    }

    // addProduct(String category, String product), return an integer value which is product price
    // also add product to my Cart

    public static int addProduct(String category, String product){

        getLink(category).click();
        getLink(product).click();

        // getting the products price
        WebElement priceContainer = Driver.getDriver().findElement(By.xpath("//h3"));
        int productsPrice = Integer.parseInt(priceContainer.getText().substring(1,4));

        // click on add to cart
        getLink("Add to cart").click();
        BrowserUtils.sleep(2);
        alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        getLink("Home").click();
        return productsPrice;
    }

    public static int removeProduct(String product){
        int productPrice = 0;
        // remove the product and return the total price
        // method 1:    //tbody//tr//td[contains(text(),'Sony vaio i7')]/..//td[.='Delete']/a
        // method 2:    //tbody//tr//td[contains(text(),'Sony vaio i7')]/following-sibling::*/a
        // priceText element: //tbody//tr//td[contains(text(),'Sony vaio i7')]/following-sibling::*/a

        WebElement deleteButton = Driver.getDriver().findElement(By.xpath("//tbody//tr//td[contains(text(),'"+product+"')]/following-sibling::*/a"));
        WebElement priceTextElement = Driver.getDriver().findElement(By.xpath("//tbody//tr//td[contains(text(),'"+product+"')]/following-sibling::*"));

        productPrice = Integer.parseInt(priceTextElement.getText());
        deleteButton.click();
        BrowserUtils.sleep(3);

        return productPrice;
    }

}
