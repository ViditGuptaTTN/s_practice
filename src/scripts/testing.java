package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class testing {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/s_practice/new/chromedriver");
        WebDriver dr = new ChromeDriver();
        dr.get("http://the-internet.herokuapp.com/windows");


        WebElement a =dr.findElement(By.xpath("//a[text()='Click Here']"));
        WebElement b =dr.findElement(By.xpath("//a[text()='Elemental Selenium']"));
        Actions ac =new Actions(dr);
        ac.click(a).perform();

        dr.switchTo().defaultContent();
        ac.click(b).perform();
        Set<String> st = dr.getWindowHandles();
        Iterator<String> it = st.iterator();
        String p= it.next();
        String c= it.next();
        String gc= it.next();
        dr.close();

    }
}
