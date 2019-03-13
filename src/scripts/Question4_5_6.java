package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4_5_6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/s_practice/new/chromedriver");
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.tothenew.com/");
        dr.findElement(By.id("h-contact-us")).click();
        System.out.println(dr.getTitle());
        System.out.println(dr.getCurrentUrl());
        dr.close();
    }
}
