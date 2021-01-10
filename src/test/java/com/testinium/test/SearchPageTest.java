package com.testinium.test;
import com.testinium.base.BaseTest;
import com.testinium.page.SearchPage;
import org.junit.Before;
import org.junit.Test;

public class SearchPageTest extends BaseTest {

    SearchPage searchPage;

    @Before
    public void before() {
        searchPage = new SearchPage(getDriver());
    }

    @Test
    public void test() {
        searchPage.callMainPage().pickLogin().callLoginPage().login().callSearchPage().searchText();
    }
}
