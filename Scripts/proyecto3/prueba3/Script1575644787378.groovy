import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ativos.bitscomputacion.com/index.php')

WebUI.waitForElementVisible(findTestObject('Enlaces/Page_Aerolinea Rustics/a_PAGO ONLINE'), 30)

WebUI.click(findTestObject('Object Repository/Enlaces/Page_Aerolinea Rustics/a_PAGO ONLINE'))

WebUI.click(findTestObject('Object Repository/Enlaces/Page_Aerolinea Rustics/a_CHECK-IN'))

WebUI.click(findTestObject('Object Repository/Enlaces/Page_Aerolinea Rustics/a_VUELOS'))

WebUI.click(findTestObject('Object Repository/Enlaces/Page_Aerolinea Rustics/a_LA EMPRESA'))

WebUI.refresh()

WebUI.back()

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

WebUI.closeBrowser()

