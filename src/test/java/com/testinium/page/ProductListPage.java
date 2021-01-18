package com.testinium.page;
import static com.testinium.constants.ConstantsProductPage.*;
import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;

public class ProductListPage extends BasePage {

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public ProductListPage pickProduct() {
        clickElement(PRODUCT);
        waitSeconds(2);
        return new ProductListPage(driver);
    }
}
