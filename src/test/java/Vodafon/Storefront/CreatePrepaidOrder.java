package Vodafon.Storefront;


import Vodafon.Storefront.Utils.TestData.TestUser;
import Vodafon.TestPattern;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static Vodafon.Storefront.Utils.TestData.TestUser.testUsersData;

public class CreatePrepaidOrder extends TestPattern {
    @Parameters({"mobile","TariffName"})

    @Test
    public void CreatePrepaidOrder(String mobile, String TariffName) throws Exception {
        mainpage.Clear_Basket();
        NH.GoToTelefonok();
        ml.choose_mobile(mobile);
        tariff.choosePostpaidTariff(TariffName, mobile);
        kosaram.kosaram_proceed(TariffName, mobile);
        pdf.fill_details_form(testUsersData);
        payment.Payment();
        atekintes.SubmitOrder(mobile, TariffName, testUsersData);

    }
}


