package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/s_practice/new/geckodriver");
        WebDriver dr =new FirefoxDriver();
        dr.get("https://www.google.com/");
        dr.close();
    }
}
