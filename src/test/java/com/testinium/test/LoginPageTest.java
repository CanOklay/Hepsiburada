package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.page.LoginPage;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @Before
    public void before() {
        loginPage = new LoginPage(getDriver());
    }

    @Test
    public void test() throws IOException {
        loginPage.callMainPage().pickLogin().callLoginPage().login();
    }
}
