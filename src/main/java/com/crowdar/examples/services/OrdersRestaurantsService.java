package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeRestaurantConstants;
import com.crowdar.examples.constants.OrdersClientsConstants;
import com.crowdar.examples.constants.OrdersRestaurantsConstants;
import org.springframework.util.Assert;

public class OrdersRestaurantsService extends MobileActionManager {
    public static void selectOrder()  {
        click(HomeRestaurantConstants.FIRST_ORDER);
    }
    public static void asingDelivery()  {
        click(OrdersRestaurantsConstants.DROP_DELIVERY);
        click(OrdersRestaurantsConstants.BTN_ASIGN_DELIVERY);
    }
    public static void dispatchOrder()  {
        click(OrdersRestaurantsConstants.BTN_DISPATCH_ORDER);
    }
    public static void verifyOrder()  {
        click(HomeRestaurantConstants.STATUS_DISPATCHE);
        waitClickable(HomeRestaurantConstants.FIRST_ORDER);
        Assert.isTrue(isPresent(HomeRestaurantConstants.FIRST_ORDER));
    }

}
