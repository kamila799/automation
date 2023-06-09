package guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class PaymentGateway {
    public static void main(String[] args) {
        Driver.getDriver().get(Config.getValue("paymentGateURL"));
        Driver.getDriver().findElement(By.linkText("Generate Card Number")).click();
        ApplicationFlow.switchToSecondWindow();
        ApplicationFlow.scroll(500);
        WebElement creditCard = Driver.getDriver().findElement(By.xpath("//h4[1]"));
        WebElement cvv = Driver.getDriver().findElement(By.xpath("//h4[2]"));
        WebElement limit = Driver.getDriver().findElement(By.xpath("//h4[4]"));

        String ccString = creditCard.getText().substring(14);
        System.out.println(ccString.length());
        if (ccString.length() == 16){
            System.out.println("Credit Card validation PASSED");
        }else{
            System.out.println("Credit Card Validation FAILED");
        }

        String cvvString = cvv.getText().substring(6).trim();
        System.out.println(cvvString.length());
        System.out.println(cvvString);
        if (cvvString.length() == 3){
            System.out.println("CVV length validation Passed");
        }else{
            System.out.println("CVV length validation Failed");
        }

//        String creditLimit = limit.getText().substring(13).trim();
//        if (creditLimit.equals("$100.00")){
//            System.out.println("Credit Limit Passed");
//        }else{
//            System.out.println("Limit test Failed");
//        }

        String limitString = limit.getText().substring(14).trim();

        System.out.println(limitString);
        double limitDouble = Double.parseDouble(limitString);
        if (limitDouble == 100){
            System.out.println("Limit test Passed");
        }else {
            System.out.println("Limit test Failed");
        }





    }
}





