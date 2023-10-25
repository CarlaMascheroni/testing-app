package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.Delivery.HomeConstants;
import com.crowdar.examples.constants.RegisterConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class LoginService extends MobileActionManager {

    public static void doLogin(String email, String password){
        waitClickable(LoginConstants.EMAIL_INPUT_LOCATOR);
        click(LoginConstants.EMAIL_INPUT_LOCATOR);
        waitClickable(LoginConstants.EMAIL_INPUT_LOCATOR);
        click(LoginConstants.EMAIL_INPUT_LOCATOR);
        setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
        click(LoginConstants.PASSWORD_INPUT_LOCATOR);
        setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
        waitClickable(LoginConstants.SIGN_IN_BUTTON_LOCATOR);
        click(LoginConstants.SIGN_IN_BUTTON_LOCATOR);

    }

}
