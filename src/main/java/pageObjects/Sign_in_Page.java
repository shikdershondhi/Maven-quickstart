package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://wellautotng.staging.welltravel.com/en-GB/sign_in
public class Sign_in_Page {
    public WebDriver driver;
    public Sign_in_Page(WebDriver driver) {
        this.driver = driver;
    }
    By inputFieldHolder = By.xpath("//input[@placeholder='Enter your login email']");
    public WebElement getemail() {
        return driver.findElement(inputFieldHolder);
    }

    By inputFieldpassword = By.xpath("//input[@placeholder='Enter your secret password']");

    public WebElement getpassword() {
        return driver.findElement(inputFieldpassword);
    }

    By signInButtonNormal = By.xpath("//button[normalize-space()='Sign In']");

    public WebElement signInButton() {
        return driver.findElement(signInButtonNormal);
    }
}