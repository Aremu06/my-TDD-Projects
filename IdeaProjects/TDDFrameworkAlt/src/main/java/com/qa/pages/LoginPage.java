package com.qa.pages;


import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @AndroidFindBy(accessibility = "test-Username")
    private MobileElement usernameTxtFld;
    @AndroidFindBy(accessibility = "test-Password")
    private MobileElement passwordTxtFld;
    @AndroidFindBy(accessibility = "test-LOGIN")
    private MobileElement loginBtn;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")

    BaseTest base;

    public LoginPage(){
       base = new BaseTest();
        PageFactory.initElements(new AppiumFieldDecorator(base.getDriver()), this);
    }

    public LoginPage enterUserName(String username) {
       base.sendKeys(usernameTxtFld, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        base.sendKeys(passwordTxtFld, password);
        return this;

    }
    public LoginPage pressLoginBtn(String password) {
        base.click(loginBtn);
        return this;
  }
  public String getErrTxt(){
      LoginPage errTxt = null;
      return base.getAttribute(errTxt, "text");
  
    }

    public ProductsPage pressLoginBtn() {
        return null;
    }
}