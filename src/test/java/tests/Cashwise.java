package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cashwise {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // (open)launching the browser

        driver.get("https://cashwise.us");
        driver.manage().window().maximize();
        String expectedCashwiseTitle = "Cashwise is best!";
        String expectedCashwiseUrl = "https://cashwise.us.home";
        System.out.println("expected Cashwise title: " + expectedCashwiseTitle);
        System.out.println("expected Cashwise url: " + expectedCashwiseUrl);

        String expectedCashwise ="";
        if(driver.getTitle().equals(expectedCashwiseTitle)) {
            System.out.println("Cashwise title test passed");
        }else {
            System.out.println("Cashwise title test failed");
        }

        if (driver.getCurrentUrl().equals(expectedCashwiseUrl)){
            System.out.println("Cashwise url test passed");
        }else{
            System.out.println("Cashwise url test failed");
        }
        System.out.println(driver.getPageSource());


        driver.quit();




    }
}
