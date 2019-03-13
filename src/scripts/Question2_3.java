package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Question2_3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/s_practice/new/chromedriver");
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");

        dr.findElement(By.xpath("//button[text()='Simple Alert']")).click();
        System.out.println(dr.switchTo().alert().getText());
        dr.close();
    }
}
