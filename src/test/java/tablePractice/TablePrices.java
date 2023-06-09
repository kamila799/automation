package tablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablePrices {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/reserve.php");
        driver.manage().window().maximize();

        List<WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[6]"));

        for(WebElement price : prices){
            String priceNumber = price.getText().replace("$", "");
            System.out.println(priceNumber);
        }



    }
}
