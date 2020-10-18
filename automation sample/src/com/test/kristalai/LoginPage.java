package com.test.kristalai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage
{
    private WebDriver driver;

    @FindBy(id="input_0")
    WebElement username;
    @FindBy(id="pwd")
    WebElement password;
    @FindBy(id="login")
    WebElement button;
    public LoginPage(WebDriver driver)
    {
        //initialize elements
        PageFactory.initElements(driver, this);

    }
    public void set_username(String usern)
    {
        username.clear();
        username.sendKeys(usern);
    }
    public void set_password(String userp)
    {
        password.clear();
        password.sendKeys(userp);
    }
    public void click_button()
    {
        button.submit();
    }
}