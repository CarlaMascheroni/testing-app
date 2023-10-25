package com.crowdar.examples.steps;

import com.crowdar.examples.services.OrderDeliverysService;
import com.crowdar.examples.services.OrdersRestaurantsService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderDeliverysSteps {

    @And("toma la orden que le asignaron")
    public void tomaLaOrdenQueLeAsignaron() {
        OrderDeliverysService.selectOrder();
    }

    @When("selecciona iniciar entrega")
    public void seleccionaIniciarEntrega() {
        OrderDeliverysService.startDelivery();
    }

    @Then("Muestra la ubicacion en tiempo real del envio")
    public void muestraLaUbicacionEnTiempoRealDelEnvio() {
        OrderDeliverysService.verifyOrderStarted();
    }
}
