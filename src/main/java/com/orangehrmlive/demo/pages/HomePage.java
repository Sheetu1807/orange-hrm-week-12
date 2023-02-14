package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By OrangeHmrLogo = By.xpath("//img[@alt='client brand banner']");
    By Admin = By.xpath("//a[@class='oxd-main-menu-item']//span[text()='Admin']");
    By PIM = By.xpath("//a[@class='oxd-main-menu-item']//span[text()='PIM']");

    By Leave = By.xpath("//span[normalize-space()='Leave']");
    By Dashboard = By.xpath("//h6[normalize-space()='Dashboard']");
    By WelcomeText = By.xpath("//p[@class='oxd-userdropdown-name']");
    By ProfileLogo = By.xpath("//img[@alt='profile picture']");
    By LogoutButton = By.xpath("//a[normalize-space()='Logout']");


    public boolean verifyLogo() {
        driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        return true;
    }

    public boolean verifyLoginpanel() {
        driver.findElement(By.xpath("//h5[normalize-space()='Login']")).isDisplayed();
        return true;
    }

    public void clickAdminButton() {
        clickOnElement(Admin);
    }

    public void clickPIMbutton() {
        clickOnElement(PIM);
    }

    public void clickOnLeavebutton() {
        clickOnElement(Leave);
    }

    public String verifyLeaveButton() {
        return getTextFromElement(Leave);
    }

    public String verifyDashboardbutton() {
        return getTextFromElement(Dashboard);
    }

    public void clickOnProfilePhoto() {
        clickOnElement(ProfileLogo);
    }

    public void clickOnLogoutButton() {
        clickOnElement(LogoutButton);
    }

    public String verifyWelcomeText() {
        return getTextFromElement(WelcomeText);
    }
}
