Feature: Login

  @Login
  Scenario Outline: Deberan validarse los datos para tener acceso ala pagina principal
    Given ingresar un <usuario>
    When ingresar una <Contraseña>
    Then click en enviar

    Examples: 
      | usuario | Contraseña | status  |
      | name1   |tzH6RvlfSTg=| passes  |
      | name2   |tzH6RvlfSTg=| Fail    |
