package scripts;

public class Question7_8_9_10 {
    public static void main(String[] args) {
        System.out.println("Question 7,8,9,10 are below in comments");
    }

    /*

    Q7: Write the disadvantages of selenium.

    Ans: 1. It is not possible to perform testing on images.
         2. We can’t automate Captcha related test cases.
         3. We can’t automate test cases related to video.
         4. We can’t automate print related test cases.


    Q8: Difference between get() & navigate() method

    Ans; Get: 1. Waits till complete page loads.
               2. can not move forward & backward in the browser.

         Navigate: 1. Will not wait until the page loads.
                    2. can move forward & backward in the browser.


    Q9. What is the difference between Selenium RC & Selenium WebDriver.

    Ans: Selenium-WebDriver: 1. makes direct calls to the browser using each browser’s native support for automation.
                             2. works comparetively faster.
                             3. supports ios and android testing.

         Selenium-RC: 1. worked the same way for each supported browser. It ‘injected’ javascript functions into the browser when the browser was loaded
                      2. works comparetively slower.
                      3. does not support ios and android testing.


    Q10. What are locators & types of locators in selenium.

    Ans: Locator is a command that tells Selenium IDE which GUI elements ( say Text Box, Buttons, Check Boxes etc) its needs to operate on.

        id Select element with the specified @id attribute.

          driver.findElement(By.id(“email"));

        Name Select first element with the specified @name attribute.

          driver.findElement(By.name(“textbox"));

        Linktext Select link (anchor tag) element which contains text matching the specified link text

          driver.findElement(By.linkText("Click On Google")).click();

        Partial Linktext Select link (anchor tag) element which contains text matching the specified partial link text

          driver.findElement(By. partialLinkText("Google")).click();

       Tag Name Locate Element using a Tag Name

          driver.findElement(By.tagName(“a”));

       Class name Locate Element using a Tag Name

          driver.findElement(By.className(“”));

      Css Select the element using css selectors

      Xpath Locate an element using an XPath expression.



     */

}



