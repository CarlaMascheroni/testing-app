package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.RegisterService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class appRegisterSteps extends PageSteps {

    @Given("El usuario se encuentra en el Login de la app")
    public void elUsuarioSeEncuentraEnElLoginDeLaApp() {
        HomeService.isViewLoaded();
    }

    @When("El usuario se dirije a la vista de Registro Nuevo")
    public void elUsuarioSeDirijeALaVistaDeRegistroNuevo() throws InterruptedException {
        HomeService.goToRegister();
    }

    @When("Ingresa los datos para el registro (.*),(.*),(.*),(.*),(.*),(.*)")
    public void ingresaLosDatosParaElRegistro(String email, String name, String lastname, String phone, String pass, String file) {
        RegisterService.registerUser(email,name,lastname,phone,pass,file);
    }

    @And("Valida la correcta creacion del nuevo usuario")
    public void validaLaCorrectaCreacionDelNuevoUsuario() {
        RegisterService.verifyUserRegister();
    }
}
