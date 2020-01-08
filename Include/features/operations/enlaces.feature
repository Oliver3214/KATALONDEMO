Feature: Validacion de todos los enlaces

  @enlaces
  Scenario: Click sobre los enlaces
    Given se inicia sesion y se navega en la pagina
    When se validan los enlaces
    Then se cierra la sesion
