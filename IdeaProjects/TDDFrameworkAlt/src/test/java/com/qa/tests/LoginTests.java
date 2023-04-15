package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class LoginTests {

    LoginPage loginPage;
    ProductsPage productsPage;
    BaseTest base;

    @Parameters({"platformName", "platformVersion", "deviceName"})
    @BeforeClass
    public void beforeClass(String platformName, String plaformVersion, String deviceName) throws IOException {
        BaseTest base = new BaseTest();
        base.initializeDriver(platformName, plaformVersion, deviceName);

    }
    @AfterClass
    public void afterClass(){
        base.quitDriver();

    }

    @BeforeMethod
    public void beforeMethod(){
        loginPage = new LoginPage();
       // System.out.println("\n" + "8888 starting test:" + m.getName() +"****" + "\n");
    }
    @AfterMethod
    public void afterMethod(){


    }
    @Test
    public void invalidUserName(){
        loginPage.enterUserName("invalidusername");
        loginPage.enterPassword("Secret_sauce");
        loginPage.pressLoginBtn();

        String actualErrTxt = loginPage.getErrTxt();
        String expectedErrTxt = "Username and password do not match any user in ths service.";
        System.out.println("actualErrTxt - " + actualErrTxt +"\n" + "expected error txt -" + expectedErrTxt );

        Assert.assertEquals(actualErrTxt, expectedErrTxt);

    }
    @Test
    public void invalidPassword(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("invalidpassword");
        loginPage.pressLoginBtn();

        String actualErrTxt = loginPage.getErrTxt();
        String expectedErrTxt = "Username and password do not match any user in ths service.";
        System.out.println("actualErrTxt - " + actualErrTxt +"\n" + "expected error txt -" + expectedErrTxt );

        Assert.assertEquals(actualErrTxt, expectedErrTxt);
  }
    @Test
    public void successfulLogin(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.pressLoginBtn();
        productsPage = loginPage.pressLoginBtn();

        String actualProductTitle = productsPage.getTitle();
        String expectedProductTitle = "PRODUCTS";
        System.out.println("product title -" + actualProductTitle + "\n" + "expected title -" +expectedProductTitle);

        Assert.assertEquals(actualProductTitle, expectedProductTitle);

    }
}

