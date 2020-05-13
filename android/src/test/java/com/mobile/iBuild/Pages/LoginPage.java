package com.mobile.iBuild.Pages;

import com.mobile.iBuild.utilities.PropertyReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

import java.io.IOException;


@SuppressWarnings("ALL")
public class LoginPage extends PropertyReader {

    AppiumDriver<MobileElement> driver;

    public void allowPermissions(AppiumDriver<MobileElement> driver) throws InterruptedException {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        }
    }

        public void openConfigPanel (AppiumDriver<MobileElement> driver) throws InterruptedException {
            AndroidDriver driver2;
            driver2 = (AndroidDriver) driver;
            driver2.pressKey(new KeyEvent(AndroidKey.VOLUME_UP));
            driver2.pressKey(new KeyEvent(AndroidKey.VOLUME_UP));
            driver2.pressKey(new KeyEvent(AndroidKey.VOLUME_UP));
            driver2.pressKey(new KeyEvent(AndroidKey.VOLUME_UP));
            driver2.pressKey(new KeyEvent(AndroidKey.VOLUME_UP));
            driver2.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN));
            driver2.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN));
            driver2.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN));
            driver2.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN));
            driver2.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN));
            Thread.sleep(2000);
        }


        public void setupConfigPanel (AppiumDriver<MobileElement> driver ,String getEndPointURL ,String prereleaseToggle) throws InterruptedException {
            driver.findElement(By.id("global.ibuild:id/enterCode")).clear();
            Thread.sleep(2000);
            driver.findElement(By.id("global.ibuild:id/enterCode")).sendKeys(getEndPointURL);

            AndroidDriver driver3;
            driver3 = (AndroidDriver) driver;
            driver3.pressKey(new KeyEvent(AndroidKey.BACK));
            Thread.sleep(1000);

            driver.findElement(By.id("global.ibuild:id/enabledPreReleaseFeaturesCode")).sendKeys(prereleaseToggle);

        }

        public void scrollToSubmit(AppiumDriver<MobileElement> driver ,String Submit) {
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
                    ".scrollIntoView(new UiSelector().text(\"" + Submit + "\"));")).click();
        }

        public void scrollToSelectCountry (AppiumDriver < MobileElement > driver, String Kenya) throws
        InterruptedException, IOException {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.id(PropertyReader.getObject("Country_List"))).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.id(PropertyReader.getObject("Country_Search"))).sendKeys(Kenya);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.id(PropertyReader.getObject("Country_Name"))).click();
        }

        public void enterPhoneNumber (AppiumDriver < MobileElement > driver, String phoneNumber) throws IOException {
            driver.findElement(By.id(PropertyReader.getObject("Phone_Number"))).sendKeys(phoneNumber);
        }

        public void clickSignIn (AppiumDriver < MobileElement > driver) throws IOException {
            driver.findElement(By.id(PropertyReader.getObject("SignIn_Button"))).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void enterReferralCode (AppiumDriver <MobileElement > driver, String referralCode) throws IOException {
            driver.findElement(By.id(PropertyReader.getObject("Referral_Code"))).sendKeys(referralCode);
            driver.findElement(By.id(PropertyReader.getObject("Login_NextButton"))).click();

        }

        public void enterNames (AppiumDriver<MobileElement>driver, String firstName, String surname ) throws IOException{
            driver.findElement(By.id(PropertyReader.getObject("First_Name"))).sendKeys(firstName);
            driver.findElement(By.id(PropertyReader.getObject("Surname"))).sendKeys(surname);
            driver.findElement(By.id(PropertyReader.getObject("Login_NextButton"))).click();
        }

        public void enterEmail (AppiumDriver<MobileElement>driver, String emailAddress) throws IOException {
            driver.findElement(By.id(PropertyReader.getObject("Email"))).sendKeys(emailAddress);
            driver.findElement(By.id(PropertyReader.getObject("Login_NextButton"))).click();
            {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ignore) {
                }
            }
        }

        public void selectProffession (AppiumDriver<MobileElement> driver ,String profession) throws IOException{
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
                    ".scrollIntoView(new UiSelector().text(\"" + profession + "\"));")).click();
            driver.findElement(By.id(PropertyReader.getObject("Login_NextButton"))).click();
            {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ignore) {
                }
            }
        }

        public void enterBusinessName (AppiumDriver<MobileElement>driver , String businessName) throws IOException {
            driver.findElement(By.id(PropertyReader.getObject("Business_Name"))).sendKeys(businessName);
            driver.findElement(By.id(PropertyReader.getObject("Login_NextButton"))).click();
        }

        public void enterRegistrationId (AppiumDriver<MobileElement>driver ,String regId) throws IOException {
            { driver.findElement(By.id(PropertyReader.getObject("Reg_Id"))).sendKeys(regId);
            driver.findElement(By.id(PropertyReader.getObject("Login_NextButton"))).click();

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ignore) {
                }
            }
        }

        public void enterNewPIN (AppiumDriver<MobileElement>driver , String newPin) throws IOException {

            driver.findElement(By.id(PropertyReader.getObject("Enter_PIN"))).sendKeys(newPin);
            driver.findElement(By.id(PropertyReader.getObject("Confirm_PIN"))).sendKeys(newPin);
            driver.findElement(By.id(PropertyReader.getObject("Accept_Terms"))).click();
            driver.findElement(By.id(PropertyReader.getObject("Login_NextButton"))).click();
        }








    /*public void loginMtd (String phoneNumber) throws Exception {
        scrollToSelectCountry();
        enterPhoneNumber(phoneNumber);
        clickSignIn();*/

    }




