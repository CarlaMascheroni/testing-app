package com.crowdar.examples.steps;

import com.crowdar.examples.services.RegisterService;
import com.crowdar.examples.services.ProductsService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ProductsSteps {

    @And("Ingresa los datos del producto nuevo (.*),(.*),(.*)")
    public void ingresaLosDatosDelProductoNuevo(String NameProduct, String DescriptionProduct, String PriceProduct) {
        ProductsService.registerNewProduct(NameProduct,DescriptionProduct,PriceProduct);
    }

    @And("Se dirije a la vista de nuevos Productos")
    public void seDirijeALaVistaDeNuevosProductos() {
        ProductsService.goToNewProducts();
    }

    @And("selecciona la categoria del producto")
    public void seleccionaLaCategoriaDelProducto() {
        ProductsService.selectedCategory();
    }

    @And("Selecciona las Images a cargar (.*),(.*),(.*)")
    public void seleccionaLasImagesACargar(String image1, String image2, String image3) {
        ProductsService.selectedImages(image1,image2,image3);
    }

    @When("Selecciona Crear Producto")
    public void seleccionaCrearProducto() {
        ProductsService.clickCreatedProduct();
    }
}
