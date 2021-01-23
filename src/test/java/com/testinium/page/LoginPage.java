package com.testinium.page;
import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.testinium.constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login() throws IOException {
        sendKeys(EMAIL, "canoklay@gmail.com");
        sendKeys(PASSWORD, "1301010010asdF");
        takeScreenshot("login");
        clickElement(SIGNINBUTTON);
        waitSeconds(3);
        return new LoginPage(driver);
    }
}
