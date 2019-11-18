package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.po.actions.AbstractPageActions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Screenshoter extends AbstractPageActions {

    private static final String SCREENSHOTS_NAME_TPL = "screenshots/scr";

    protected Screenshoter() {
        super();
    }

    public static void takeScreenshot() {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            SimpleDateFormat sdf =  new SimpleDateFormat("_dd.MM.yyyy_HH-mm-ss");
            String date = sdf.format(System.currentTimeMillis());
            String screenshotName = SCREENSHOTS_NAME_TPL + date;
            File copy = new File(screenshotName + ".png");
            FileUtils.copyFile(screenshot, copy);
            DefaultLogger.info("Saved screenshot: " + screenshotName);
        } catch (IOException e) {
            DefaultLogger.error("Failed to make screenshot");
            e.printStackTrace();
        }
    }
}
