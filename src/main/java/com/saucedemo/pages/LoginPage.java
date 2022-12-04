package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField= By.name("user-name");
    By passwordField= By.name("password");
    By loginButton= By.xpath("//input[@id='login-button']");
    By verifyMessage= By.xpath("//span[contains(text(),'Products')]");


    public void enterUsername(String text){
        sendTextToElement(usernameField, text);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getTextVerify(){
        return getTextFromElement(verifyMessage);
    }
}
