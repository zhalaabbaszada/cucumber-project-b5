package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HW_WikipediaPage {
    public HW_WikipediaPage() {
    PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (id = "searchInput")
    public WebElement searchBox;

    @FindBy (id = "firstHeading")
    public WebElement header;

    @FindBy (xpath = "//th[@class = 'infobox-above']/div")
    public WebElement imageHeader;




}
