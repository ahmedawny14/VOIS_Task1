package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TodayDealsPage {
    public static WebDriver driver;
    public TodayDealsPage(WebDriver driver)
    {

        this.driver=driver;

    }


    public static List<WebElement> getCheckBoxes()
    {
       List<WebElement> checkBoxes= driver.findElements(By.xpath("//*[@class='CheckboxFilter-module__gridFilterCheckbox_9gZBKxneWNZMc30ac9ue7 Checkbox-module__checkBoxOutline_281PiTekJcpF_Pm5QDexLv']"));
        return checkBoxes;
    }

    public static WebElement getHeadphoneCheckBox()
    {
        WebElement headphoneCheckBx=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[19]/div[1]/div[1]/div[1]/div[2]/div[2]/span[3]/ul[1]/li[20]/label[1]/input[1]"));
          return headphoneCheckBx;
    }
    public static WebElement getGroceryCheckBox()
    {
        WebElement groseryCheckBx=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[19]/div[1]/div[1]/div[1]/div[2]/div[2]/span[3]/ul[1]/li[19]/label[1]/input[1]"));
        return groseryCheckBx;
    }

    public static WebElement getDiscount()
    {
        WebElement  discount=driver.findElement(By.xpath("//*[@class='LinkFilterOption-module__linkFilterOption_k3Xp4bgxEaBmcgTA0UAxc']"));
        return discount;
    }
    public static WebElement getPAge4()
    {
        WebElement  page4=driver.findElement(By.xpath("//*[@id=\"dealsGridLinkAnchor\"]/div/div[3]/div/ul/li[5]"));
        return  page4;
    }


    public static WebElement getItem()
    {

        WebElement item= driver.findElements(By.xpath("//*[@class='DealCard-module__cardImageVertical_1m9E6mjbE6UbrGJwvn6GKM DealCard-module__imageWithPadding_Qk9F2b8bUeXPk8FUBnSVG']")).get(2);
        return item;
    }



}
