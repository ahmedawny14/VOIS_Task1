package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static WebDriver driver;
    public HomePage( WebDriver driver)
    {
        this.driver=driver;
    }

    public static WebElement getSearchEngine() {

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        return search;


    }

    public static WebElement getSearchIcon()
    {
        WebElement searchIcon= driver.findElement(By.xpath("//*[@class='nav-search-submit nav-sprite']"));
        return searchIcon;
    }
    public static WebElement getTodayDeals()
    {
        WebElement todayDeals= driver.findElement(By.xpath("//*[@class='nav-a  ']"));
        return todayDeals;
    }



}
