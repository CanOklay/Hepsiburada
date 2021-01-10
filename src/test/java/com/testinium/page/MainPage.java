package com.testinium.page;
import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import static com.testinium.constants.ConstantsMainPage.*;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage pickLogin() {
        String hepsiburadaText = driver.getTitle();
        assertionTrue(hepsiburadaText, true);
        hoverElement(LOGINLIST);
        clickElement(LOGIN);
        waitSeconds(5);
        return new MainPage(driver);
    }
}
