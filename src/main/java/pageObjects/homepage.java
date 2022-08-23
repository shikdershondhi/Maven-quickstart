package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://wellautotng.staging.welltravel.com/en-GB#/flights
public class homepage {

    public WebDriver driver;
    public homepage (WebDriver driver) {
        this.driver=driver;
    }
    By login = By.xpath( "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/a[1]");
    public WebElement getLogin (){
        return driver.findElement(login);
    }
    By createAnAccountLinkContent= By.xpath("/html/body/div[1]/div[3]/div[4]/div/a");
    public WebElement createAnAccountLinkContent(){
        return driver.findElement(createAnAccountLinkContent);
    }
}