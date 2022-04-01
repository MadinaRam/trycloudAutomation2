package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement usernameInputBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    public void login(){
        usernameInputBox.sendKeys(ConfigurationReader.getProperty("username1"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void login(String username){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
}
