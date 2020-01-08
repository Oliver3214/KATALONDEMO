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

WebUI.closeBrowser()

