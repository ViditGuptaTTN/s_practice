package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Question5 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/s_practice/new/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.switchTo().defaultContent();
        System.out.println("Number of iframes "+driver.findElements(By.xpath("//iframe")).size());
        driver.close();

        String expected="Acid-free paper for the digital age";
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/s_practice/new/chromedriver");
        WebDriver dr=new ChromeDriver();
        dr.get("http://www.londonfreelance.org/courses/frames/index.html");
        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dr.switchTo().frame("navbar");
        dr.findElement(By.xpath("//a[text()='Sample content']")).click();
        dr.switchTo().defaultContent();
        dr.switchTo().frame("content");
        String actual=driver.findElement(By.xpath("//h2")).getText();
        if(expected.equals(actual)){
            System.out.println("The actual and expected header matches");
        }
        dr.close();

    }
}
