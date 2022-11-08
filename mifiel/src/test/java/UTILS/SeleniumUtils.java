package UTILS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;


public class SeleniumUtils
{
    WebDriver driver;


    public void Click (WebElement element)
    {
        element.click();
    }


    public void Input (WebElement input, String data)
    {
       input.sendKeys(data);
    }


    public void addfile(WebElement element, String pathfile)
    {
        ((RemoteWebElement) element ).setFileDetector(new LocalFileDetector());
        element.sendKeys(pathfile);
    }

}

