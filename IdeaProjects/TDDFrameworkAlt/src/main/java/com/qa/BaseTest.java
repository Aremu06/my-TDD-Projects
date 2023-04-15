package com.qa;

import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;


public class BaseTest {
    protected static AppiumDriver driver;
    protected static Properties props;
    InputStream inputStream;

    public BaseTest(){

    }

    public void setDriver(AppiumDriver driver){
        this.driver = driver;
    }
    public AppiumDriver getDriver(){
        return driver;
    }
    public void initializeDriver(String platformName, String platformVersion, String deviceName) throws IOException {
        try {
            props = new Properties();
            String propFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            props.load(inputStream);

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "platformName");
            caps.setCapability("platformVersion", "platformVersion");
            caps.setCapability("automationName", "androidAutomationName");
            caps.setCapability("deviceName","deviceName");
            caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
            caps.setCapability("appActivity", props.getProperty("androidAppLocation"));
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            URL appUrl = getClass().getClassLoader().getResource(props.getProperty("androidAppLocation"));
            caps.setCapability("app",appUrl);

            URL url = new URL(props.getProperty("appiumURL"));

            driver = new AndroidDriver(url, caps);
            String sessionId = driver.getSessionId().toString();
           
        }catch (Exception e){
            e.printStackTrace();
            throw e;


        }

    }
    public void waitForVisibility(MobileElement e){
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void click(MobileElement e) {
        waitForVisibility(e);
        e.click();
    }
    public void sendKeys(MobileElement e, String txt){
        waitForVisibility(e);
        e.sendKeys(txt);

        }
        public String getAttribute(LoginPage e, String attribute){
        waitForVisibility(e);
       return e.getAttribute(attribute);


    }
    public void quitDriver(){
        driver.quit();

    }
}
