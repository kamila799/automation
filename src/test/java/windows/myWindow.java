package windows;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class myWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");

        driver.switchTo().newWindow(WindowType.TAB).get("https:etsy.com");

        driver.switchTo().newWindow(WindowType.TAB).get("https://facebook.com");

        driver.switchTo().newWindow(WindowType.TAB).get("https://instagram.com");

        Set<String> handles = driver.getWindowHandles();
        for (String id: handles){
            driver.switchTo().window(id);
            String title = driver.getTitle();
            if (title.contains("Etsy")){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
    }
}
