package com.testinium.page;
import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static com.testinium.constants.ConstantsMainPage.*;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage pickLogin() throws IOException {
        String hepsiburadaText = driver.getTitle();
        assertionTrue(hepsiburadaText, true);
        takeScreenshot("main");
        hoverElement(LOGINLIST);
        clickElement(LOGIN);
        waitSeconds(5);
        return new MainPage(driver);
    }

    public MainPage getMainPage() throws IOException {
        clickElement(MAIN);
        String hepsiburadaText = driver.getTitle();
        assertionTrue(hepsiburadaText, true);
        takeScreenshot("main2");
        return new MainPage(driver);
    }
}
