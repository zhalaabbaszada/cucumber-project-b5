package io.loop.pages;

import io.loop.utilities.BrowserUtils;
import io.loop.utilities.DocuportConstants;
import io.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
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

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement continueButton;

    public void insertField (String field, String input){
        switch (field.toLowerCase().trim()) {
            case "username" -> BrowserUtils.waitForVisibility(userNameInput, DocuportConstants.LARGE).sendKeys(input);
            case "password" -> BrowserUtils.waitForVisibility(passwordInput, DocuportConstants.LARGE).sendKeys(input);
            default -> throw new IllegalArgumentException("No such a field: " + field);
        }
    }

    public void clickButton(String button){
        switch (button.toLowerCase().trim()) {
            case "login" -> BrowserUtils.waitForVisibility(loginButton, DocuportConstants.LARGE).click();
            case "continue" -> {
                try {
                    BrowserUtils.waitForVisibility(continueButton, DocuportConstants.LARGE).click();
                }catch (StaleElementReferenceException e){
                    WebElement element = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
                    element.click();
                }
            }
            default -> throw new IllegalArgumentException("No such button: " + button);
        }
    }

    /**
     * Logins to docuport
     * @param username
     * @param password
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
