package com.crowdar.examples.steps;

import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.OrdersClientService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersClientSteps {

    @And("selecciona la categoria del producto a comprar")
    public void seleccionaLaCategoriaDelProductoAComprar() {
        OrdersClientService.selecCategory();
    }

    @When("selecciona los productos para agregar a la orden")
    public void seleccionaLosProductosParaAgregarALaOrden() {
        OrdersClientService.selecProduct();
    }

    @And("seleciona la cantidad (.*)")
    public void selecionaLaCantidad(int cant) {
        OrdersClientService.cantProduct(cant);
    }

    @And("agrega el producto al carrito")
    public void agregaElProductoAlCarrito() {
        OrdersClientService.clickButtonAdd();
    }

    @And("se dirige a confirmar la orden")
    public void seDirigeAConfirmarLaOrden() {
        OrdersClientService.clickBack();
    }


    @And("carga los datos de la tarjeta para relizar el pago (.*), (.*), (.*), (.*), (.*)")
    public void cargaLosDatosDeLaTarjetaParaRelizarElPago(String tarjeta, String expira, String cvv, String titular, String dni) {
        OrdersClientService.datosDelPago(tarjeta, expira, cvv, titular, dni);
    }

    @And("selecciona la cantidad de cuotas a realizar el pago")
    public void seleccionaLaCantidadDeCuotasARealizarElPago() throws InterruptedException {
        OrdersClientService.selectCuotas();
    }

    @Then("se valida la transaccion existosa")
    public void seValidaLaTransaccionExistosa() throws InterruptedException {
        OrdersClientService.verifyTransaccionExitosa();
    }

    @And("agrego una direccion para la entrega del pedido '(.*)', '(.*)'")
    public void agregoUnaDireccionParaLaEntregaDelPedidoSantaFeCentro(String address, String address2) throws InterruptedException {
        OrdersClientService.createAddress(address, address2);
    }
}
