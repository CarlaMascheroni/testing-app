Feature: El restaurante toma el pedido de una orden nueva

  Scenario Outline: Nuevo Pedido
    Given El usuario se encuentra en el Login de la app
    And Ingresa usuario <email> y contraseña <password>
    And selecciona la orden que acaba de ingresar
    And asigna el repartidor a la orden
    And despacha la orden
    Then el estado de la orden fue actualizado con exito


    Examples:
      | email            | password |
      | martin@gmail.com | 123      |
