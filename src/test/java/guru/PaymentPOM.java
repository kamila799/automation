package guru;

import org.junit.Test;
import pagesPOM.GuruHomePage;
import pagesPOM.PaymentGatewayPage;
import utilities.Config;
import utilities.Driver;

public class PaymentPOM {
    PaymentGatewayPage paymentGatewayPage = new PaymentGatewayPage();
    GuruHomePage guruHomePage = new GuruHomePage();

    @Test
    public void purchase(){
        Driver.getDriver().get(Config.getValue("guruURL"));
        guruHomePage.paymentGatewayProjectLink.click();
        paymentGatewayPage.buyBtn.click();
        paymentGatewayPage.cardNumberInput.sendKeys("7463546374918274");
        paymentGatewayPage.selectMonth("08");
        paymentGatewayPage.selectYear("2019");
        paymentGatewayPage.cvvInput.sendKeys("234");
        paymentGatewayPage.payBtn.click();
    }
}
