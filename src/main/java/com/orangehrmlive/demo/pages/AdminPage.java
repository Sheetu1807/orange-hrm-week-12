package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By Admin = By.linkText("Admin");

    By UserManagement = By.xpath("//nav[@aria-label='Topbar Menu']//li[@class='oxd-topbar-body-nav-tab --parent --visited']");
    By Job = By.xpath("//li[@class='--active oxd-topbar-body-nav-tab --parent']");
    By Organization = By.linkText("//li[@class='--active oxd-topbar-body-nav-tab --parent']");


    public void clickOnAdminLink() {
        this.clickOnElement(this.Admin);

    }

    public void clickOnUserManagementLink() {
        this.clickOnElement(this.UserManagement);

    }

    public void clickOnJobLink() {
        this.clickOnElement(this.Job);

    }

    public void clickOnOrganizationLink() {
        this.clickOnElement(this.Organization);

    }
}
