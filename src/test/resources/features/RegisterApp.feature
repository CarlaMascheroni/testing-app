Feature: El usuario se registra como cliente en la aplicacion

  Scenario Outline: Registro de usuario como Cliente
    Given El usuario se encuentra en el Login de la app
    And El usuario se dirije a la vista de Registro Nuevo
    When Ingresa los datos para el registro <email>,<name>,<lastname>,<phone>,<pass>,<file>
    Then Valida la correcta creacion del nuevo usuario

    Examples:
      | email             | name    | lastname     | phone  | pass | file           |
      | cliente@gmail.com | Cliente | Automatizado | 123456 | 123  | images (3).png |