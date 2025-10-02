package io.loop.pages;

public class POM {
    private  LoginPage loginPage;
    private GoogleSearchPage googleSearchPage;
    private HomePage homePage;
    private ProductPage productPage;
    private ReceivedDocsPage receivedDocsPage;
    private LeftNavigatePage leftNavigatePage;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public GoogleSearchPage getGoogleSearchPage() {
        if (googleSearchPage == null) {
            googleSearchPage = new GoogleSearchPage();
        }
        return googleSearchPage;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public ProductPage getProductPage() {
        if (productPage == null) {
            productPage = new ProductPage();
        }
        return productPage;
    }
    public ReceivedDocsPage getReceivedDocsPage() {
        if (receivedDocsPage == null) {
            receivedDocsPage = new ReceivedDocsPage();
        }
        return receivedDocsPage;
    }
    public LeftNavigatePage getLeftNavigatePage() {
        if (leftNavigatePage == null){
            leftNavigatePage = new LeftNavigatePage();
        }
        return leftNavigatePage;
    }
}
