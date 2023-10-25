package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.AddressConstants;
import com.crowdar.examples.constants.HomeRestaurantConstants;
import com.crowdar.examples.constants.OrderDeliverysConstants;
import com.crowdar.examples.constants.OrdersRestaurantsConstants;
import org.springframework.util.Assert;

public class OrderDeliverysService extends MobileActionManager {
    public static void selectOrder()  {
        click(OrderDeliverysConstants.FIRST_ORDER);
    }
    public static void startDelivery()  {
        click(OrderDeliverysConstants.START_DELIVERY);
        click(AddressConstants.ACEPT_PERMISOS);
    }
    public static void verifyOrderStarted()  {
        waitVisibility(OrderDeliverysConstants.DELIVERY_POINT);
        Assert.isTrue(isPresent(OrderDeliverysConstants.DELIVERY_POINT));
    }
}
