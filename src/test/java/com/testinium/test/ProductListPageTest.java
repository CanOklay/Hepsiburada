package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.page.ProductListPage;
import org.junit.Before;
import org.junit.Test;

public class ProductListPageTest extends BaseTest {

    ProductListPage productListPage;

    @Before
    public void before() {
        productListPage = new ProductListPage(getDriver());
    }

    @Test
    public void test() {
        productListPage.callMainPage().pickLogin().callLoginPage().login().callSearchPage().
                searchText().callProductListPage().pickProduct();
    }
}
