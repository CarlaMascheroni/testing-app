Feature: El restaurante toma el pedido de una orden nueva

  @car
  Scenario Outline: Nuevo Pedido
    Given El usuario se encuentra en el Login de la app
    And Ingresa usuario <email> y contraseña <password>
    And toma la orden que le asignaron
    When selecciona iniciar entrega
    Then Muestra la ubicacion en tiempo real del envio


    Examples:
      | email            | password |
      | ivan12@gmail.com | 123      |
