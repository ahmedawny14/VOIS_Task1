package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {
    public static WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;

    }public WebElement goToCart(){
        WebElement cart=driver.findElement(By.xpath("//*[@class='a-button a-spacing-top-base a-button-span12 a-button-base celwidget']" ));
        return cart;
    }

    public static WebElement getItemCount()
    {
        WebElement ItemsCount=driver.findElement(By.xpath("//*[@class='a-row sc-list-item sc-java-remote-feature']"));
        return ItemsCount;

    }
}
