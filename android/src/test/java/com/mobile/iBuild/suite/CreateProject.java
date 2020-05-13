package com.mobile.iBuild.suite;

import com.mobile.iBuild.BrowserStackTestNGTest;
import com.mobile.iBuild.Config;
import com.mobile.iBuild.JavaFakerAPI;
import com.mobile.iBuild.Pages.LoginPage;
import com.mobile.iBuild.Pages.ProjectWizard;
import com.mobile.iBuild.Validate.Validations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateProject extends BrowserStackTestNGTest {
    ProjectWizard createProject = new ProjectWizard();
    LoginPage Login = new LoginPage();
    JavaFakerAPI jf = new JavaFakerAPI();
    Validations validate = new Validations();
    Config config = new Config();


    String elementText = "Submit";


    @BeforeMethod
    public void commonLogin () throws Exception {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Login process - Create Engineering Account
        Login.allowPermissions(driver);

        //Verify app launch success
        validate.VerifyLaunchSucessful(driver);
        Login.openConfigPanel(driver);
        Login.setupConfigPanel(driver ,config.getEndpointPath(), jf.getFeatureToggle());
        Login.scrollToSubmit(driver ,elementText);
        Login.scrollToSelectCountry(driver ,jf.getCountryName());
        Login.enterPhoneNumber(driver ,config.getPhoneNo());
        Login.clickSignIn(driver);
        createProject.enterPIN(driver ,config.getOldPIN());


       /* Login.enterReferralCode(driver ,config.getReferralCode());
        Login.enterNames(driver , jf.getFirstName() ,jf.getSurname());
        Login.enterEmail(driver ,jf.getEmail());
        Login.selectProffession(driver ,descText);
        Login.enterBusinessName(driver , jf.getCompanyName());
        Login.enterRegistrationId(driver , jf.getRegId());
        Login.enterNewPIN(driver , config.getPIN()); */

        //Verify login success
        validate.VerifyLoginSucessful(driver);
    }

    @Test
    public void createNewProject () throws Exception {
        createProject.openProjectCreateWizard(driver);
        createProject.addProjectName(driver ,jf.getProjectName());
        createProject.addProjectDescription(driver ,jf.getProjectDesc());
        createProject.provideAdditionalDetails(driver ,jf.getHouseSize());
        createProject.selectCounty(driver);
        createProject.selectSubCounty(driver);
        createProject.chooseLocation(driver ,config.googleLocation());


    }
}
