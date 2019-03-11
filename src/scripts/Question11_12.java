package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question11 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/s_practice/new/chromedriver");
        WebDriver dr = new ChromeDriver();
        dr.get("file:///home/ttn/Downloads/Registration.html");
        dr.findElement(By.name("q")).sendKeys("To The New");

    }
}
