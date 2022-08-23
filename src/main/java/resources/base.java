package resources;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {
    public static WebDriver driver;
    public Properties prop;
    public WebDriver initializeDriver() throws IOException {
        prop= new Properties();
        FileInputStream fis= new FileInputStream("src/main/java/resources/data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        else if (browserName.equals("firefox")){

        } else if (browserName.equals("edge")) {

        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
    public void getScreenshot(String result) throws IOException
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("screenshots"+result+"screenshot.png"));

    }


}
