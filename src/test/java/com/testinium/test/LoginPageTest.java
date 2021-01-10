package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.page.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @Before
    public void before() {
        loginPage = new LoginPage(getDriver());
    }

    @Test
    public void test() {
        loginPage.callMainPage().pickLogin().callLoginPage().login();
    }
}
