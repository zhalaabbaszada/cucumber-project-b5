package io.loop.pages;

import io.loop.utilities.BrowserUtils;
import io.loop.utilities.DocuportConstants;
import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.print.Doc;

public class LeftNavigatePage {
    public LeftNavigatePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Upload')]")
    public WebElement uploadButton;

    @FindBy(xpath = "//span[contains(text(),'Home')]")
    public WebElement homeButton;

    @FindBy(xpath = "//span[contains(text(),'Received')]")
    public WebElement receivedDocsButton;

    @FindBy(xpath = "//span[contains(text(),'My uploads')]")
    public WebElement myUploads;

    @FindBy(xpath = "//span[contains(text(),'Invitations')]")
    public WebElement invitationsButton;

    @FindBy(xpath = "//a[contains(text(),'Terms')]")
    public WebElement termsAndConditionsButton;

    public void clickButton(String button){
        switch (button.toLowerCase().trim()){
            case "home" -> BrowserUtils.waitForVisibility(homeButton, DocuportConstants.LARGE).click();
            case "upload" -> BrowserUtils.waitForVisibility(uploadButton, DocuportConstants.LARGE).click();
            case "received doc" -> BrowserUtils.waitForVisibility(receivedDocsButton, DocuportConstants.LARGE).click();
            case "invitations" -> BrowserUtils.waitForVisibility(invitationsButton, DocuportConstants.LARGE).click();
            case "terms and conditions" -> BrowserUtils.waitForVisibility(termsAndConditionsButton, DocuportConstants.LARGE).click();
            case "mu uploads" -> BrowserUtils.waitForVisibility(myUploads, DocuportConstants.LARGE).click();
            default -> throw new IllegalArgumentException("Not such a button: " + button);
        }
    }
}
