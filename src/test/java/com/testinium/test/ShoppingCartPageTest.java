package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.page.ShoppingCartPage;
import org.junit.Before;
import org.junit.Test;

public class ShoppingCartPageTest extends BaseTest {

    ShoppingCartPage shoppingCartPage;

    @Before
    public void before() {
        shoppingCartPage = new ShoppingCartPage(getDriver());
    }

    @Test
    public void test() {
        shoppingCartPage.callMainPage().pickLogin().callLoginPage().login().callSearchPage().
                searchText().callProductListPage().pickProduct().callProductPage().addToCart().
                callShoppingCartPage().deleteProduct().callMainPage().getMainPage();
    }
}
