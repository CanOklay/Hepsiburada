package com.testinium.page;
import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.testinium.constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login() {
        sendKeys(EMAIL, "canoklay@gmail.com");
        sendKeys(PASSWORD, "1301010010asdF");
        clickElement(SIGNINBUTTON);
        waitSeconds(3);
        return new LoginPage(driver);

        //Sıkı çalış kardeşim yakında Berlin'deyiz.
    }
}
