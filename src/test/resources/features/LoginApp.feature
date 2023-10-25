Feature: El usuario Inicia Session en la aplicacion

  Scenario Outline: Login de un Usuario Exitoso
    Given El usuario se encuentra en el Login de la app
    When Ingresa usuario <email> y contraseña <password>
    And Valida la correcta creacion del nuevo usuario

   Examples:
     | email                   | password |
     | kiraMasche22@gmail.com | 123      |