package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By dashboardTab = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']");
    By dashboardText = By.xpath("//h6[normalize-space()='Dashboard']");

    public void ClickDashboad() {
        clickOnElement(dashboardTab);
    }

    public String verifyTextDashboard() {
        return getTextFromElement(dashboardText);
    }
}
