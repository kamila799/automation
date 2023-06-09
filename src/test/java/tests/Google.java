package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        String expectedGoogleTitle = "Hi, Google!";
        if (driver.getTitle().equals(expectedGoogleTitle)) {
            System.out.println("Google title test passed");
        }else {
            System.out.println("Google title test failed");
        }
        driver.navigate().to("https://amazon.com");
        System.out.println(driver.getTitle());
        String expectedAmazonTitle = "Hey, Amazon";
        if (driver.getTitle().equals(expectedAmazonTitle)) {
            System.out.println("Amazon title test passed");
        }else {
            System.out.println("Amazon title test failed");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();





    }
}
