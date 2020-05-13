package com.mobile.iBuild.Pages;

import com.mobile.iBuild.utilities.PropertyReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

import java.io.IOException;

public class ProjectWizard {
    AppiumDriver<MobileElement> driver;

    public void enterPIN (AppiumDriver<MobileElement>driver , String PIN) throws  IOException {
        driver.findElement(By.id(PropertyReader.getObject("Enter_PIN"))).sendKeys(PIN);
        driver.findElement(By.id(PropertyReader.getObject("Login_NextButton"))).click();
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ignore) {
            }
        }
    }

    public void openProjectCreateWizard (AppiumDriver<MobileElement> driver) throws IOException {
        driver.findElement(By.xpath(PropertyReader.getObject("Create_New_Project_Button"))).click();
    }
    public void addProjectName (AppiumDriver<MobileElement>driver ,String projectName) throws Exception {
        driver.findElement(By.id(PropertyReader.getObject("Project_Wizard_Input"))).sendKeys(projectName);
        driver.findElement(By.id(PropertyReader.getObject("Project_Wizard_Next_Button"))).click();
    }
    public void addProjectDescription (AppiumDriver<MobileElement>driver ,String projectDesc) throws Exception {
        driver.findElement(By.id(PropertyReader.getObject("Project_Wizard_Input"))).sendKeys(projectDesc);
        driver.findElement(By.id(PropertyReader.getObject("Project_Wizard_Next_Button"))).click();
    }
    public void provideAdditionalDetails (AppiumDriver<MobileElement>driver ,String houseSize) throws IOException {
        AndroidDriver driver3;
        driver3 = (AndroidDriver) driver;
        driver3.pressKey(new KeyEvent(AndroidKey.TAB));
        driver3.pressKey(new KeyEvent(AndroidKey.TAB));
        driver3.pressKey(new KeyEvent(AndroidKey.TAB));
        driver3.pressKey(new KeyEvent(AndroidKey.TAB));
        driver3.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver3.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver3.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver3.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver3.pressKey(new KeyEvent(AndroidKey.TAB));
        driver3.pressKey(new KeyEvent(AndroidKey.TAB));
        driver3.pressKey(new KeyEvent(AndroidKey.TAB));
        driver3.pressKey(new KeyEvent(AndroidKey.TAB));
        driver3.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver3.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver3.pressKey(new KeyEvent(AndroidKey.ENTER));

        driver.findElement(By.id(PropertyReader.getObject("Project_Wizard_Input"))).sendKeys(houseSize);
        driver.findElement(By.id(PropertyReader.getObject("Project_Wizard_Next_Button"))).click();
    }
    public void selectCounty (AppiumDriver<MobileElement> driver) throws IOException {
        driver.findElement(By.id(PropertyReader.getObject("Select_County"))).click();
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ignore) {
            }
        }
        driver.findElement(By.xpath(PropertyReader.getObject("Location_List_Layout_Option_4"))).click();

    }

    public void selectSubCounty (AppiumDriver<MobileElement> driver) throws IOException {
        driver.findElement(By.id(PropertyReader.getObject("Select_Sub_County"))).click();
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ignore) {
            }
        }
        driver.findElement(By.xpath(PropertyReader.getObject("Location_List_Layout_Option_4"))).click();

     }

    public void chooseLocation (AppiumDriver<MobileElement>driver ,String locationSearch) throws IOException {
        driver.findElement(By.id(PropertyReader.getObject("Select_Location"))).click();
        driver.findElement(By.id(PropertyReader.getObject("Image_Search"))).click();
        driver.findElement(By.id(PropertyReader.getObject("Google_AutoComplete"))).sendKeys(locationSearch);
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {
            }
        }
        AndroidDriver driver3;
        driver3 = (AndroidDriver) driver;
        driver3.pressKey(new KeyEvent(AndroidKey.TAB));
        driver3.pressKey(new KeyEvent(AndroidKey.TAB));
        driver3.pressKey(new KeyEvent(AndroidKey.TAB));
        driver3.pressKey(new KeyEvent(AndroidKey.ENTER));
        //driver.findElement(By.id(PropertyReader.getObject("Google_AutoComplete_Option_4"))).click();
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignore) {
            }
        }
        driver.findElement(By.id(PropertyReader.getObject("Button_Submit"))).click();
        driver.findElement(By.id(PropertyReader.getObject("Login_NextButton"))).click();
    }
}
