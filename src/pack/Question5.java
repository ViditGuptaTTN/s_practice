package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/s_practice/new/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.switchTo().defaultContent();
        System.out.println("Number of iframes "+driver.findElements(By.xpath("//iframe")).size());

        driver.close();
    }
}
