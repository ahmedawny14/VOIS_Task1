package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPage {

    public static WebDriver driver;

    public ItemPage(WebDriver driver) {
        this.driver = driver;

    }



    public static WebElement getItem()
    {

        WebElement item= driver.findElements(By.xpath("//*[@class='s-card-container s-overflow-hidden aok-relative puis-expand-height puis-include-content-margin puis puis-v1g4cn23aiw4pq21ytu1qia8qu3 s-latency-cf-section s-card-border']")).get(0);
        return item;
    }
    public static WebElement addToCart()
    {
        WebElement addToCartBtn= driver.findElement(By.id("add-to-cart-button"));
        return addToCartBtn;


    }
}
