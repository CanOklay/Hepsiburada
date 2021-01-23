package com.testinium.page;
import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

import static com.testinium.constants.ConstantsProductPage.*;

public class ProductPage extends BasePage {


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage addToCart() throws IOException {
        clickElement(ADDTOCART);
        waitSeconds(2);
        takeScreenshot("addToCart");
        clickElement(SHOPPINGCART);
        waitSeconds(3);
        return new ProductPage(driver);
    }
}
