package windows;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LetsKodeIt {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        String mainWindowID = driver.getWindowHandle();
        System.out.println(mainWindowID);


        driver.findElement(By.id("opentab")).click();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles.size());
        System.out.println(windowHandles);

        for (String id : windowHandles){
            if (!id.equals(mainWindowID)){
               driver.switchTo().window(id);
               break;
            }
        }
        System.out.println();
        System.out.println(driver.getCurrentUrl());




    }
}
