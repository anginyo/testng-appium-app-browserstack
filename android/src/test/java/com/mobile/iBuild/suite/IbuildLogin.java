package com.mobile.iBuild.suite;

import com.mobile.iBuild.BrowserStackTestNGTest;
import com.mobile.iBuild.Config;
import com.mobile.iBuild.JavaFakerAPI;
import com.mobile.iBuild.Pages.LoginPage;
import com.mobile.iBuild.Validate.Validations;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IbuildLogin extends BrowserStackTestNGTest {
    LoginPage Login = new LoginPage();
    Validations validate = new Validations();
    JavaFakerAPI jf = new JavaFakerAPI();
    Config config = new Config();

    String elementText = "Submit";
    String descText = "Engineer";


    @Test
    public void androidLogin () throws Exception {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Login process - Create Engineering Account
        Login.allowPermissions(driver);

        //Verify app launch success
        validate.VerifyLaunchSucessful(driver);

        Login.openConfigPanel(driver);
        Login.setupConfigPanel(driver ,config.getEndpointPath(), jf.getFeatureToggle());
        Login.scrollToSubmit(driver ,elementText);
        Login.scrollToSelectCountry(driver ,jf.getCountryName());
        Login.enterPhoneNumber(driver ,jf.getPhoneNumber());
        Login.clickSignIn(driver);
        Login.enterReferralCode(driver ,config.getReferralCode());
        Login.enterNames(driver , jf.getFirstName() ,jf.getSurname());
        Login.enterEmail(driver ,jf.getEmail());
        Login.selectProffession(driver ,descText);
        Login.enterBusinessName(driver , jf.getCompanyName());
        Login.enterRegistrationId(driver , jf.getRegId());
        Login.enterNewPIN(driver , config.getPIN());

        //Verify login success
        validate.VerifyLoginSucessful(driver);



    }


}
