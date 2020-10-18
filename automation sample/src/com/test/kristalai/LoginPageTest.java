package com.test.kristalai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginPageTest
    {
       WebDriver driver ;


        @BeforeTest
        public void setup() {

            System.setProperty("webdriver.chrome.driver","/Users/chandhinyg/git/AutomationSuite/lib/mac/chromedriver");
            driver= new ChromeDriver();

//            try {
////                driver.manage().wait(4);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }

            driver.get("https://staging-portal.kristal.ai/login");
        }
//        @Test(priority=5)
//        public void verify1()
//        {
//            LoginPage login=new LoginPage(driver);
//            login.set_username("admin");
//            login.set_password("admin");
//            login.click_button();
//            Assert.assertTrue(driver.getPageSource().contains("Blog"));
//        }
        @Test(priority=1)
        public void verify2()
        {
            LoginPage login=new LoginPage(driver);
            login.set_username("adm");
            login.set_password("admin");
            login.click_button();
           // System.out.print(driver.findElement(By.xpath("//*[@id='error']")).getText());
            Assert.assertEquals(driver.findElement(By.xpath("//*[@id='error']")).getText(),"Invalid username or password");
        }
//        @Test(priority=2)
//        public void verify3()
//        {
//            LoginPage login=new LoginPage(driver);
//            login.set_username("admin");
//            login.set_password("adm");
//            login.click_button();
//            Assert.assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
//        }
//        @Test(priority=3)
//        public void verify4()
//        {
//            LoginPage login=new LoginPage(driver);
//            login.set_username("adm");
//            login.set_password("adm");
//            login.click_button();
//            Assert.assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
//        }
//        @Test(priority=4)
//        public void verify5()
//        {
//            LoginPage login=new LoginPage(driver);
//            login.set_username("");
//            login.set_password("");
//            login.click_button();
//            Assert.assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
//        }
        @AfterTest
        public void close()
        {
            driver.close();
        }
    }

