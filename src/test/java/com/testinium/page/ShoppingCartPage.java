package com.testinium.page;
import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import static com.testinium.constants.ConstantsShoppingCart.*;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage deleteProduct() throws IOException {
        takeScreenshot("productCart");
        hoverElement(DELETEPRODUCT);
        waitSeconds(2);
        clickElement(DELETEPRODUCT);
        takeScreenshot("deleteCart");
        waitSeconds(2);
        return new ShoppingCartPage(driver);
    }
}
