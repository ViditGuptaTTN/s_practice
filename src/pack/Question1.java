package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Question1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/s_practice/new/geckodriver");
        WebDriver dr =new FirefoxDriver();
        dr.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dr.findElement(By.xpath("//button[text()='Click me!']")).click();
        System.out.println(dr.switchTo().alert().getText());
        dr.switchTo().alert().accept();
        dr.switchTo().defaultContent();

        dr.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        System.out.println(dr.switchTo().alert().getText());
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dr.switchTo().alert().dismiss();

        dr.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        dr.switchTo().alert().sendKeys("Vidit");
        System.out.println("Box Content "+dr.switchTo().alert().getText());
        dr.switchTo().alert().accept();
        dr.close();
    }
}
