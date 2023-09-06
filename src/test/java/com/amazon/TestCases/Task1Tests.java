package com.amazon.TestCases;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.HomePage;
import pages.ItemPage;
import pages.TodayDealsPage;

import java.time.Duration;
import java.util.List;

public class Task1Tests extends TestBase {
    public static HomePage homePage;
    public static ItemPage itemPage;
    public static AddToCartPage addToCartPage;
    public static TodayDealsPage today;

    @Test
    public static void searchFunctionality() throws InterruptedException {
        homePage = new HomePage(driver);
        addToCartPage = new AddToCartPage(driver);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12)); //to enter Captcha
        homePage.getSearchEngine().sendKeys("car accessories");
        homePage.getSearchIcon().click();
        ItemPage.getItem().click();
        ItemPage.addToCart().click();
        addToCartPage.goToCart().click();
        String actualResult = addToCartPage.getItemCount().getAttribute("data-item-count");
        Assert.assertNotEquals(actualResult, 0);
        // Assert.assertEquals(actualResult,1);


    }


    @Test
    public static void FilterFunctionality() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        homePage = new HomePage(driver);
        itemPage = new ItemPage(driver);
        today = new TodayDealsPage(driver);
        addToCartPage = new AddToCartPage(driver);
         homePage.getTodayDeals().click();

        for (WebElement checkbox : today.getCheckBoxes() ) {
            String checkBoxAttribute = checkbox.getAttribute("data-csa-c-element-id");
            if (checkBoxAttribute.equals("filter-department-172541") || checkBoxAttribute.equals("filter-department-16310101"))

            {
                checkbox.click();
            }


        }


        today.getDiscount().click();
        today.getPAge4().click();
        today.getItem().click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        ItemPage.addToCart().click();


    }
}
