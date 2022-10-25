package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AdminLocator {
    WebDriver driver;

    public AdminLocator(WebDriver driver1)
    {
        driver = driver1;
    }

    By name = By.name("txtUsername");
    By log = By.id("btnLogin-btnInnerEl");

    By lang = By.xpath("//span[@id='languageBtn-btnWrap']");
    By ce = By.xpath("//div[@id='MenuClickExpress_header-title-textEl']");
    By ol = By.xpath(" //span[@id='MenuClickExpress_Pick-textEl']");

    By art = By.id("MenuItems_header-title-textEl");
    By artHis = By.id("MenuItemHistory-textEl");
    //By artDate = By.xpath("/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]");

    By artIn = By.xpath("//input[@id='txtSearchField-inputEl']");
   // By artSearch = By.xpath("//span[@id='ctl00_ContentPlaceHolder1_ctl95-btnInnerEl']");
    By on = By.xpath("//*[@id='gridview-1009']/div/table/tbody/tr[1]/td[1]");

    By so = By.xpath("//span[contains(text(),'Sign out')]");
    public void login()
    {
        driver.findElement(name).sendKeys("Subhashiniadmin");
        driver.findElement(log).click();

    }

    public void langSelec()
    {
        List<WebElement> options = driver.findElements(lang);
        for(WebElement option : options) {
            if (option.getText().equals("English")) ;
            {
                option.click();
                break;
            }
        }

    }
    public void article()
    {
        driver.findElement(art).click();
        driver.findElement(artHis).click();
        driver.findElement(artIn).sendKeys("130");
       // driver.findElement(artSearch).click();
    }
    public void clickExpress() {

        driver.findElement(ce).click();
        WebElement order = driver.findElement(ol);
        order.click();
        Assert.assertEquals(order.getText(), "Order list");
        System.out.println(order.getText());

    }
    public void clickOrder()
    {
        driver.findElement(on).click();
    }

    public void signOut()
    {
        driver.findElement(so).click();
    }

    public void close()
    {
        driver.close();
    }
}
