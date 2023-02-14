package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage logintest = new LoginPage();
    HomePage homePage = new HomePage();
    DashboardPage dashboard = new DashboardPage();

    @Test
    public void verifyUserShouldLoginSuccessFully() throws InterruptedException {
        logintest.enterUsername("Admin");
        Thread.sleep(1000);
        logintest.enterPassword("admin123");
        logintest.clickOnLoginButton();
        Thread.sleep(500);
        String expected = "Paul Collings";
        Assert.assertEquals(homePage.verifyWelcomeText(), expected);
    }

    @Test
    public void verifyThatTheLogoDisplayOnHomePage() throws InterruptedException {
        logintest.enterUsername("Admin");
        Thread.sleep(1000);
        logintest.enterPassword("admin123");
        logintest.clickOnLoginButton();
        Thread.sleep(1000);
        Assert.assertTrue(homePage.verifyLogo());
    }

    @Test
    public void verifyUserShouldLogOutSuccessFully() throws InterruptedException {
        logintest.enterUsername("Admin");
        Thread.sleep(1000);
        logintest.enterPassword("admin123");
        logintest.clickOnLoginButton();
        Thread.sleep(1000);
        homePage.clickOnProfilePhoto();
        Thread.sleep(2000);
        homePage.clickOnLogoutButton();
        Assert.assertTrue(homePage.verifyLoginpanel());
        Thread.sleep(2000);
    }
}