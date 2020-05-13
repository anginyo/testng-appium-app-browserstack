package com.mobile.iBuild.Validate;

import com.mobile.iBuild.utilities.PropertyReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.io.IOException;

public class Validations {

    public void VerifyLaunchSucessful(AppiumDriver<MobileElement> driver) throws IOException, InterruptedException {
        Thread.sleep(2000);
        if(driver.findElement(By.id(PropertyReader.getObject("SignIn_Button"))).isDisplayed())
        {
            System.out.println("App Launch Verified Successfully");
        }

    }

    public void VerifyLoginSucessful(AppiumDriver<MobileElement> driver) throws IOException, InterruptedException {
        Thread.sleep(5000);
        if (driver.findElement(By.id(PropertyReader.getObject("Account_Button"))).isDisplayed()) {
            System.out.println("App Login / Account Creation Verified Successfully");
        }
    }
}
