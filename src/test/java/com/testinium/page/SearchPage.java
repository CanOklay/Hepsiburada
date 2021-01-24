package com.testinium.page;
import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import static com.testinium.constants.ConstantsSearchPage.*;

public class SearchPage extends BasePage {


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage searchText() throws IOException {
        waitSeconds(2);
        sendKeys(SEARCHBOX, "Roborock s5 max");
        takeScreenshot("search");
        waitSeconds(2);
        clickElement(SEARCH);
        waitSeconds(2);
        return new SearchPage(driver);
    }

    public SearchPage searchPc() throws IOException {
        sendKeys(SEARCHBOX, "Bilgisayar");
        takeScreenshot("searchPc");
        waitSeconds(2);
        clickElement(SEARCH);
        waitSeconds(2);
        return new SearchPage(driver);
    }
}
