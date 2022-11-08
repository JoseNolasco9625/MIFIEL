package FEATURE;

import CONFIG.Config_acc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest
{
    WebDriver driver;
    Config_acc configAcc = new Config_acc();

    @BeforeTest
    public void setup ()
    {
        System.setProperty("webdriver.chrome.driver" , "src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(configAcc.URL_Firma);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }


    @AfterTest
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }
}
