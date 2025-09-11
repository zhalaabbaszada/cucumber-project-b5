package io.loop.utilities;

import org.openqa.selenium.By;

public class DocuportConstants {

    // url for test env
    public static final String DOCUPORT_TEST = "https://beta.docuport.app";

    // username for roles
    public static final String USERNAME_CLIENT = "b1g1_client@gmail.com";
    public static final String USERNAME_ADVISOR = "b1g1_advisor@gmail.com";
    public static final String USERNAME_SUPERVISOR = "b1g1_supervisor@gmail.com";
    public static final String USERNAME_EMPLOYEE = "b1g1_employeet@gmail.com";

    // placeholders for username and password
    public static final String EXPECTED_PLACEHOLDER_FOR_USERNAME = "username or email";
    public static final String EXPECTED_PLACEHOLDER_FOR_PASSWORD = "password";

    // username, password and login button locators
    public static final By USERNAME_FIELD = By.xpath("//input[@id='input-14']");
    public static final By PASSWORD_FIELD = By.xpath("//input[@id='input-15']");
    public static final By LOGIN_BUTTON = By.xpath("//span[@class='v-btn__content']");

    //error messages
    public static final String EXPECTED_ERROR_MESSAGE_FOR_USERNAME = "please enter your username or email address";
    public static final String EXPECTED_ERROR_MESSAGE_FOR_PASSWORD = "please enter your password";
    public static final String RESET_PASSWORD_MESSAGE = "Enter the email address associated with your account";

    // password for roles
    public static final String PASSWORD_ALL_ROLES = "Group1";

    //messages
    public static final String ERROR_MESSAGE_FOR_EMPTY_PASSWORD = "please enter your password";


    // logo
    public static final String EXPECTED_LOGO_DOCUPORT = "Docuport";

    //forgot password url
    public static final String FORGOT_PASSWORD_URL = "https://beta.docuport.app/reset-password";

    //email for reset password
    public static final String EMAIL_FOR_RESET_PASSWORD = "forgotpasswordg1@gmail.com";

    // roles
    public static String ADVISOR = "advisor";
    public static String CLIENT = "client";
    public static String SUPERVISOR = "supervisor";
    public static String EMPLOYEE = "employee";

    //waits
    public static final int EXTRA_SMALL = 3;
    public static final int SMALL = 5;
    public static final int MEDIUM = 7;
    public static final int LARGE = 10;
    public static final int EXTRA_LARGE = 20;





}
