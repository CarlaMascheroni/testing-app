Feature: El con perfil Restaurante da de alta un producto Nuevo

  Scenario Outline: Alta nuevo producto
    Given El usuario se encuentra en el Login de la app
    When Ingresa usuario <email> y contraseña <password>
    And Se dirije a la vista de nuevos Productos
    And Ingresa los datos del producto nuevo <NameProduct>,<DescriptionProduct>,<PriceProduct>
    And selecciona la categoria del producto
    And Selecciona las Images a cargar <image1>,<image2>,<image3>
    When Selecciona Crear Producto
   # Then Se da de alta el nuevo Producto

    Examples:
      | email            | password | NameProduct | DescriptionProduct      | PriceProduct | image1          | image2          | image3          |
      | martin@gmail.com | 123      | Hamburguesa | Hamburguesa doble carne | 3500         |  images (3).jpeg | images (3).jpeg | images (3).jpeg |