package enlaces
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


class enlaces {
	@Given("se inicia sesion y se navega en la pagina")
	def iniciodesesion() {
		println("se navega en la pagina")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://ativos.bitscomputacion.com/index.php')
	}

	@When("se validan los enlaces")
	def clickenenlaces() {
		println ("\n click en el enlace")
		WebUI.click(findTestObject('Object Repository/Enlaces/Page_Aerolinea Rustics/a_PAGO ONLINE'))
		WebUI.click(findTestObject('Object Repository/Enlaces/Page_Aerolinea Rustics/a_CHECK-IN'))
		WebUI.click(findTestObject('Object Repository/Enlaces/Page_Aerolinea Rustics/a_VUELOS'))
		WebUI.click(findTestObject('Object Repository/Enlaces/Page_Aerolinea Rustics/a_LA EMPRESA'))
		WebUI.refresh()
		
		WebUI.click(findTestObject('Object Repository/Enlaces/Page_Aerolinea Rustics/a_RESERVAS'))
		WebUI.refresh()
		WebUI.waitForPageLoad(5, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.back()
		WebUI.click(findTestObject('Object Repository/Enlaces/Page_Aerolinea Rustics/a_INFORMACION'))
		WebUI.refresh()
		WebUI.back()
		WebUI.click(findTestObject('Object Repository/Enlaces/Page_Aerolinea Rustics/a_CORPORATIVO'))
		WebUI.refresh()
		WebUI.back()
		WebUI.delay(10)
	}

	@Then("se cierra la sesion")
	def cerramoslpagina() {
		println ("se verifico la direccion de los enlaces")
		WebUI.closeBrowser()
	}
}

