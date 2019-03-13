package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class testing {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/s_practice/new/chromedriver");
        WebDriver dr = new ChromeDriver();
        dr.get("http://demo.guru99.com/test/web-table-element.php");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       List<WebElement> ls = dr.findElements(By.xpath("//table[@class='dataTable']//tr"));
        System.out.println("row count ="+ ls.size());

        List<WebElement> ls2 = dr.findElements(By.xpath("//table[@class='dataTable']//th"));
        System.out.println("row count ="+ ls2.size());

        List<WebElement> ls3 = dr.findElements(By.xpath("//table[@class='dataTable']//td"));
        System.out.println("row count ="+ ls3.size());

        Iterator<WebElement> it = ls3.iterator();
        int i=1;
        while(it.hasNext()) {
            System.out.print(it.next().getText());
            System.out.print("\t");
            if(i==ls2.size()){
                System.out.println();
                i=0;
            }
            i++;
        }
    }
}
