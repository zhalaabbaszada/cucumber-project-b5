package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void clickCategory(String category){

        Driver.getDriver().findElement(By.xpath(" //a[contains(.,'" + category + "')]")).click();

    }

    public String getProductPrice(String product) throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[normalize-space(.)='"+product+"']/../../h5"));
        String actualPrice = element.getText();
        return actualPrice.substring(1);
    }
}

