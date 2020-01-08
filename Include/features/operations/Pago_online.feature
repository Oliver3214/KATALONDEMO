Feature: validacion de el formulario pago online
	
	@Pago
  Scenario: 
    Given se navega en la pagina formulario pago online
    And buscamos la seccion pago online
    When se introducen los datos
    Then se envia el primer formulario
