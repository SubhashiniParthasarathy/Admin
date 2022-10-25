package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Admin {
    WebDriver driver;
    AdminLocator Al;

    @BeforeClass
    public void launch(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Subhashini.Parthasar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://cub-sfl-internal.northeurope.cloudapp.azure.com/Admin/Login.aspx?ReturnUrl=%2fAdmin%2fMainNavigation.aspx");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.linkText("Proceed to cub-sfl-internal.northeurope.cloudapp.azure.com (unsafe)")).click();
        System.out.println(driver.getTitle());
       driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        Al = new AdminLocator(driver);
    }


    @Test (priority=1)
    public void langSelec()
    {
        Al.langSelec();
    }

    @Test (priority=2)
    public void login()
    {
        Al.login();

    }


    @Test (priority=3)
    public void article()
    {
        Al.article();

    }

    @Test (priority=4)
    public void clickExpress() {

        Al.clickExpress();
    }

    @Test (priority=5)
    public void clickOrder() {

        Al.clickOrder();
    }
/*
    @Test(priority=6)
    public void signOut()
    {
        Al.signOut();
    }

    @AfterClass
    public void close()
    {
        Al.close();
    }*/
}
