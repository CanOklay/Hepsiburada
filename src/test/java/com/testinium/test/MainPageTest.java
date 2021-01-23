package com.testinium.test;
import com.testinium.base.BaseTest;
import com.testinium.page.MainPage;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class MainPageTest extends BaseTest {

    MainPage mainPage;

    @Before
    public void before() {
        mainPage = new MainPage(getDriver());
    }

    @Test
    public void test() throws IOException {
        mainPage.pickLogin();
    }
}
