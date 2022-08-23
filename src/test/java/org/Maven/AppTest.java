package org.Maven;

import org.testng.annotations.Test;
import pageObjects.Sign_in_Page;
import pageObjects.homepage;
import resources.base;
import java.io.IOException;


public class AppTest
    extends base
{
    @Test
    public void basePagenavigation() throws InterruptedException, IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));

        homepage home= new homepage(driver);
        home.getLogin().click();
        Sign_in_Page sign= new Sign_in_Page(driver);
        sign.getemail().sendKeys("ehatesham@welldev.io");
        sign.getpassword().sendKeys("asdasd123");
        sign.signInButton().click();
    }
}
