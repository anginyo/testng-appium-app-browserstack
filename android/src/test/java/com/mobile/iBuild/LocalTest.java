package com.mobile.iBuild;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class LocalTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
    AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
        ExpectedConditions.elementToBeClickable(MobileBy.id("com.example.android.basicnetworking:id/test_action")));
    searchElement.click();
    AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
        ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.TextView")));

    MobileElement testElement = null;
    List<MobileElement> allTextViewElements = driver.findElementsByClassName("android.widget.TextView");
    Thread.sleep(10);
    for(MobileElement textElement : allTextViewElements) {
      if(textElement.getText().contains("The active connection is")) {
        testElement = textElement;
      }
    }

    if(testElement == null) {
      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "screenshot.png"));
      System.out.println("Screenshot stored at " + System.getProperty("user.dir") + "screenshot.png");
      throw new Error("Cannot find the needed TextView element from app");
    }
    String matchedString = testElement.getText();
    System.out.println(matchedString);
    Assert.assertTrue(matchedString.contains("The active connection is wifi"));
    Assert.assertTrue(matchedString.contains("Up and running"));
    }
}
