package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.AddressConstants;
import com.crowdar.examples.constants.OrdersClientsConstants;
import org.springframework.util.Assert;

public class OrdersClientService extends MobileActionManager {

    public static void selecCategory() {
        click(OrdersClientsConstants.CATEGORY_SELECT);
    }

    public static void selecProduct() {
        click(OrdersClientsConstants.PRODUCT_SELECT);
    }

    public static void cantProduct(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            click(OrdersClientsConstants.CANT_PRODUCT_BUTTON);
        }
    }

    public static void clickButtonAdd() {
        click(OrdersClientsConstants.BUTTON_AGREGAR);
    }

    public static void clickBack() {
        click(OrdersClientsConstants.BUTTON_BACK);
        click(OrdersClientsConstants.BUTTON_SHOP_BAG);
        click(OrdersClientsConstants.BUTTON_CONFIRM);
    }


    public static void datosDelPago(String tarjeta, String expira, String cvv, String titular, String dni) {
        click(OrdersClientsConstants.INPUT_TARJETA);
        click(OrdersClientsConstants.INPUT_TARJETA);
        setInput(OrdersClientsConstants.INPUT_TARJETA, tarjeta);
        click(OrdersClientsConstants.INPUT_EXP_DAY);
        click(OrdersClientsConstants.INPUT_EXP_DAY);
        setInput(OrdersClientsConstants.INPUT_EXP_DAY, expira);
        click(OrdersClientsConstants.INPUT_CVV);
        click(OrdersClientsConstants.INPUT_CVV);
        setInput(OrdersClientsConstants.INPUT_CVV, cvv);
        click(OrdersClientsConstants.INPUT_TITULAR);
        click(OrdersClientsConstants.INPUT_TITULAR);
        setInput(OrdersClientsConstants.INPUT_TITULAR, titular);
        click(OrdersClientsConstants.DROP_DOC);
        click(OrdersClientsConstants.SELECT_DOC);
        click(OrdersClientsConstants.INPUT_DNI);
        click(OrdersClientsConstants.INPUT_DNI);
        setInput(OrdersClientsConstants.INPUT_DNI, dni);
        click(OrdersClientsConstants.BUTTON_CONFIRM_DATOS_PAGO);
    }

    public static void selectCuotas() throws InterruptedException {
        click(OrdersClientsConstants.DROP_CUOTAS);
        click(OrdersClientsConstants.SELECT_CUOTAS);
        click(OrdersClientsConstants.BUTTON_CONFIRM_PAGO);
        Thread.sleep(1500l);
    }

    public static void verifyTransaccionExitosa() throws InterruptedException {
        waitInvisibility(OrdersClientsConstants.MSJ_CONFIRM_TRANSACC);
        Thread.sleep(1500l);
        Assert.isTrue(isPresent(OrdersClientsConstants.MSJ_CONFIRM_TRANSACC));
    }

    public static void createAddress(String address, String address2) throws InterruptedException {
        click(AddressConstants.ADD_ADDRESS);
        click(AddressConstants.INPUT_ADDRESS);
        setInput(AddressConstants.INPUT_ADDRESS, address);
        click(AddressConstants.INPUT_BARRIO);
        click(AddressConstants.INPUT_BARRIO);
        setInput(AddressConstants.INPUT_BARRIO, address2);
        click(AddressConstants.SELECT_PR);
        click(AddressConstants.ACEPT_PERMISOS);
        Thread.sleep(1500l);
        click(AddressConstants.CONFIRM_PR);
        click(AddressConstants.BTN_CREATE_ADDRESS);
      //  click(OrdersClientsConstants.SELECT_ADDRESS);
        Thread.sleep(1500l);
        click(OrdersClientsConstants.BUTTON_CONFIRM_DIREC);
    }
}

