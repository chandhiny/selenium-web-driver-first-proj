package com.test.kristalai;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Ltest {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","/Users/chandhinyg/Downloads/chromedrivertest");
            WebDriver driver = new ChromeDriver();

            driver.get("https://staging-accounts.kristal.ai/login?stage=loginForm");
            WebElement usernameElement     = ((ChromeDriver) driver).findElementById("phone-email");
            WebElement passwordElement = ((ChromeDriver) driver).findElementById("password");
            usernameElement.sendKeys("chandhiny.gopal+sgp@investo2o.com");
            passwordElement.sendKeys("Admin@12345");

            WebElement loginElement = ((ChromeDriver) driver).findElementByClassName("btn-continue");
            System.out.println(loginElement.getText());
            loginElement.submit();
           // WebDriverWait wait = new WebDriverWait(driver,10);
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            //after login check
            WebElement profileElement = ((ChromeDriver) driver).findElementByXPath("//i[@id='fa-user']");
            profileElement.click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            Assert.assertTrue(profileElement.isDisplayed());
            ((ChromeDriver) driver).findElementByXPath("//span[@class='ng-scope']");

           String url =  driver.getCurrentUrl();

            Assert.assertEquals("https://staging-portal.kristal.ai/portfolio/profile",url);
            driver.quit();


        }
}

