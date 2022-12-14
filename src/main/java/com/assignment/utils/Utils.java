package com.assignment.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String time = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-aa").format(new Date());
        String fileWithPath = "./screenshots/" + fileName + "-" + time + ".png";
        File destinationFile = new File(fileWithPath);
        FileUtils.copyFile(screenshotFile, destinationFile);
    }

    public static String generateListName() {
        return "My List - " + System.currentTimeMillis();
    }
}
