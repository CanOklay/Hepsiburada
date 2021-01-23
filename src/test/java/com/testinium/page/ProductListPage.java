package com.testinium.page;
import static com.testinium.constants.ConstantsProductListPage.*;
import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class ProductListPage extends BasePage {

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public ProductListPage pickProduct() throws IOException {
        takeScreenshot("productList");
        clickElement(PRODUCT);
        waitSeconds(2);
        return new ProductListPage(driver);
    }
}
