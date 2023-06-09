package actions;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PracticeSel {
        public static void main(String[] args) {
//            System.setProperty("webdriver.firefox.logfile", "/dev/null");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
            WebElement firstDrop = driver.findElement(By.xpath("//select[@id='first']"));
            Select firstDropdown = new Select(firstDrop);
            List<WebElement> firstDropdown1 = firstDropdown.getOptions();
            if (firstDropdown1.size() == 4) {
                System.out.println("First test passed");
                for (WebElement i : firstDropdown1) {
                    if (i.getText().equals("Yahoo")) {
                        i.click();
                    }
                }
            } else System.out.println("First test faileed");

            // second part
            WebElement secondDrop = driver.findElement(By.xpath("//select[@id='animals']"));

            Select secondDropdown = new Select(secondDrop);

            List<WebElement> secondDropdown1 = secondDropdown.getOptions();
            if (secondDropdown1.size() == 4) {
                System.out.println("First test passed");
                for (WebElement i : secondDropdown1) {
                    if (i.getText().equals("Baby Cat")) {
                        i.click();
                    }
                }
            } else System.out.println("First test faileed");

            // third part
            List<WebElement> third = driver.findElements(By.xpath("//select[@id='second']/option"));

            if (third.size() == 4) {
                System.out.println("Third test passed");
                for (WebElement i : third) {
                    i.click();
                    System.out.println(i.getText());
                }
            } else System.out.println("Third test failed");


        }
    }
