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
    public void BasePagenavigation() throws InterruptedException, IOException {
        driver = initializeDriver();

    }

    @Test

    public void Login() throws IOException{
        driver.get(prop.getProperty("url"));

        homepage home= new homepage(driver);
        home.getLogin().click();
        Sign_in_Page sign= new Sign_in_Page(driver);
        sign.getemail().sendKeys(""+prop.getProperty("Email"));
        sign.getpassword().sendKeys(""+prop.getProperty("Password"));
        sign.signInButton().click();
    }
}
