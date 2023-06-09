package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SortingAtoZ {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/inventory.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
        Select sorting = new Select(sortDropdown);
        sorting.selectByValue("az");

        List<WebElement> names = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (int i = 0; i < names.size() - 1; i++) {
            String tempNames = names.get(i).getText();


        }
    }
}


