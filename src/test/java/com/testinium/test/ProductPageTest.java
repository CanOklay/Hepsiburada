package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.page.ProductPage;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class ProductPageTest extends BaseTest {

    ProductPage productPage;

    @Before
    public void before() {
        productPage = new ProductPage(getDriver());
    }

    @Test
    public void test() throws IOException {
        productPage.callMainPage().pickLogin().callLoginPage().login().callSearchPage().
                searchText().callProductListPage().pickProduct().callProductPage().addToCart();
    }
}
