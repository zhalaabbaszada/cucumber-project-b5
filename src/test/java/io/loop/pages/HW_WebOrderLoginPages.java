package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HW_WebOrderLoginPages {
    public HW_WebOrderLoginPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "ctl00_MainContent_username")
    public WebElement usernameField;

    @FindBy (id = "ctl00_MainContent_password")
    public WebElement passwordField;

    @FindBy (id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

}
