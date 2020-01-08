package vuelos
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class checkin {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("navegaremos en la pagina")
	def senavegahastaencontrarelCheckin() {
		println ("")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://ativos.bitscomputacion.com/index.php')
	}

	@When("seleccionamos todos los datos")
	def clickentodo() {
		println ("se verifica que todo pueda ser seleccionado")
		WebUI.selectOptionByValue(findTestObject('Object Repository/Proyecto4-checkin/Page_Aerolinea Rustics/Page_Aerolinea Rustics/select_CordobaBuenos Aires'),
				'Buenos Aires', true)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Proyecto4-checkin/Page_Aerolinea Rustics/Page_Aerolinea Rustics/select_CordobaBuenos AiresMisiones (1)'),
				'Buenos Aires', true)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Proyecto4-checkin/Page_Aerolinea Rustics/Page_Aerolinea Rustics/select_CordobaBuenos AiresMisiones'),
				'Misiones', true)
		WebUI.click(findTestObject('Proyecto4-checkin/Page_Aerolinea Rustics/Page_Aerolinea Rustics/Page_Aerolinea Rustics/Page_Aerolinea Rustics/input_CHECK-IN_fechaDestino'))
		WebUI.click(findTestObject('Proyecto4-checkin/Page_Aerolinea Rustics/Page_Aerolinea Rustics/Page_Aerolinea Rustics/Page_Aerolinea Rustics/a_10'))
		WebUI.click(findTestObject('Proyecto4-checkin/Page_Aerolinea Rustics/Page_Aerolinea Rustics/Page_Aerolinea Rustics/Page_Aerolinea Rustics/input_CHECK-IN_fechaPartida'))
		WebUI.click(findTestObject('Proyecto4-checkin/Page_Aerolinea Rustics/Page_Aerolinea Rustics/a_17'))
		WebUI.click(findTestObject('Proyecto4-checkin/Page_Aerolinea Rustics/Page_Aerolinea Rustics/Page_Aerolinea Rustics/Page_Aerolinea Rustics/input'))
		WebUI.delay(30)
	}

	@Then("cerramos la sesion")
	def cerramoslasesion() {
		println ("se cerra la sesion")
		WebUI.closeBrowser()
	}
}