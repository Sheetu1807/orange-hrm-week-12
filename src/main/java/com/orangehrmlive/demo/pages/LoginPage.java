package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By Username = By.xpath("//input[@placeholder='Username']");
    By Password = By.xpath("//input[@placeholder='Password']");
    By LoginButton = By.xpath("//button[normalize-space()='Login']");


    public void enterUsername(String text) {
        sendTextToElement(Username, text);
    }

    public void enterPassword(String text) {
        sendTextToElement(Password, text);
    }

    public void clickOnLoginButton() {
        clickOnElement(LoginButton);
    }
}