package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Question1 {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/s_practice/new/geckodriver");
        WebDriver dr =new FirefoxDriver();
        dr.get("http://demo.guru99.com/test/newtours/register.php");
        dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement test = ((FirefoxDriver) dr).findElementByName("country");
        Select sl =new Select(test);
        sl.selectByValue("INDIA");
        WebDriverWait wait = new WebDriverWait(dr, 9);

       // wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.name("country"))));
      dr.close();
    }
}
