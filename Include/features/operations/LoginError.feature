Feature: Validacion de los datos ingresados invalidos al login

  @LonginInvalido
  Scenario Outline: Login falso
    Given se ingresara el <usuario>
    When se ingresara la <Contraseña> en el paso
    Then se verificara el <status> del paso y se enviara el formulario

    Examples: 
      | usuario | Contraseña | status  |
      | name1   |ggNFythgxkw=| success |
      | name2   |0mP41y2AN8w=| Fail    |
