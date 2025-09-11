package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HW_WebOrdersHomePages {
    public HW_WebOrdersHomePages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(tagName = "a")
    public List<WebElement> links;

}
