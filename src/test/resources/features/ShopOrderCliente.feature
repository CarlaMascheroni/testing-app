Feature: El cliente realiza un pedido

  Scenario Outline: Nuevo Pedido
    Given El usuario se encuentra en el Login de la app
    And Ingresa usuario <email> y contraseña <password>
    And selecciona la categoria del producto a comprar
    When selecciona los productos para agregar a la orden
    And seleciona la cantidad <cant>
    And agrega el producto al carrito
    And se dirige a confirmar la orden
    And agrego una direccion para la entrega del pedido 'Santa Fe 1079', 'Centro'
    And carga los datos de la tarjeta para relizar el pago <tarjeta>, <expira>, <cvv>, <titular>, <dni>
    And selecciona la cantidad de cuotas a realizar el pago
    Then se valida la transaccion existosa

    Examples:
      | email                  | password | cant | tarjeta             | expira | cvv | titular        | dni      |
      | kiraMasche22@gmail.com | 123      | 2    | 4509 9535 6623 3704 | 1125   | 123 | Cliente Prueba | 40700500 |
