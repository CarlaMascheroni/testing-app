package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.Delivery.HomeConstants;

public class HomeService extends MobileActionManager {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.LABEL_LOGIN);
    }

    public static void goToRegister() throws InterruptedException {
        MobileActionManager.click(HomeConstants.BUTTON_REGISTER);
    }
}
