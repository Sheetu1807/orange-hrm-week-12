package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {


    By SystemUsersText = By.xpath("//h5[normalize-space()='System Users']");
    By UserNameField = By.xpath("//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']");
    By userroleDownArrow = By.xpath("//div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");

    By userrolAdmin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(), 'Admin')]");
    By EmployeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By StatusDropDown = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]");
    By disabledOption = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(), 'Disabled')]");
    By SearchButton = By.xpath("//button[normalize-space()='Search']");
    By ResetButton = By.xpath("//button[normalize-space()='Reset']");
    By AddButton = By.xpath("//button[normalize-space()='Add']");

    By addUserText = By.xpath("//h6[normalize-space()='Add User']");
    By DeleteButton = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]/i[1]");

    public String verifySystemUsersText() {
        return getTextFromElement(SystemUsersText);
    }

    public void enterUserNameField(String userName) {
        sendTextToElement(UserNameField, userName);
    }

    public void clickUserRollDropdown() throws InterruptedException {
        clickOnElement(userroleDownArrow);
        Thread.sleep(1000);
        clickOnElement(userrolAdmin);
    }

    public void enterEmployeeNameField(String employee) {
        sendTextToElement(EmployeeNameField, employee);
    }

    public void clickStatusDropDown() throws InterruptedException {
        clickOnElement(StatusDropDown);
        Thread.sleep(1000);
        clickOnElement(disabledOption);
    }

    public void clickSearchButton() {
        clickOnElement(SearchButton);
    }

    public void clickResetButton() {
        clickOnElement(ResetButton);
    }

    public void clickAddButton() {
        clickOnElement(AddButton);
    }

    public String verifyAddUserText() {
        return getTextFromElement(addUserText);
    }

    public void clickDeleteButton() {
        clickOnElement(DeleteButton);
    }


}
