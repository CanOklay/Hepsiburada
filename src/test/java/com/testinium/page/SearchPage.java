package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import static com.testinium.constants.ConstantsSearchPage.*;

public class SearchPage extends BasePage {


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage searchText() {
        waitSeconds(2);
        sendKeys(SEARCHBOX, "Roborock s5 max");
        waitSeconds(2);
        clickElement(SEARCH);
        waitSeconds(2);
        return new SearchPage(driver);
    }
}
