package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import static com.testinium.constants.ConstantsProductPage.*;

public class ProductPage extends BasePage {


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage addToCart() {
        clickElement(ADDTOCART);
        waitSeconds(2);
        return new ProductPage(driver);
    }
}
