package com.crowdar.examples.steps;

import com.crowdar.examples.constants.OrdersRestaurantsConstants;
import com.crowdar.examples.services.OrdersRestaurantsService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OrdersRestaurantsSteps {

    @And("selecciona la orden que acaba de ingresar")
    public void seleccionaLaOrdenQueAcabaDeIngresar() {
        OrdersRestaurantsService.selectOrder();
    }

    @And("asigna el repartidor a la orden")
    public void asignaElRepartidorALaOrden() {
        OrdersRestaurantsService.asingDelivery();
    }

    @Then("el estado de la orden fue actualizado con exito")
    public void elEstadoDeLaOrdenFueActualizadoConExito() {
        OrdersRestaurantsService.verifyOrder();
    }

    @And("despacha la orden")
    public void despachaLaOrden() {
        OrdersRestaurantsService.dispatchOrder();
    }
}
