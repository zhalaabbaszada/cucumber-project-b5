package io.loop.pages;

import io.loop.utilities.BrowserUtils;
import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@type='text']")
    public WebElement userNameInput;


    @FindBy (xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;

    /**
     * Logins to docuport
     * @param username
     * @pram password
     */

    public void login(String username, String password) throws InterruptedException {
        BrowserUtils.waitForClickable(loginButton, 10);
        userNameInput.clear();
        userNameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        loginButton.click();
//        Thread.sleep(3000);
//        if (BrowserUtils.waitForClickable(loginButton, 10).isDisplayed()){
//            loginButton.click();
//        };
    }

}
