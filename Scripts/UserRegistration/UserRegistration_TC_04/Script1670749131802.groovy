import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.webURL)

WebUI.click(findTestObject('Object Repository/Registration-04/Page_Home - PS Enterprise Gameshop/i_Coming Soon_icon-user'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration-04/Page_Home - PS Enterprise Gameshop/select_Please Select OneActionRacingSimulat_02dff3'), 
    'Adventure', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration-04/Page_Home - PS Enterprise Gameshop/select_Please Select OnePlaystationXBoxNintendoPC'), 
    'PC', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration-04/Page_Home - PS Enterprise Gameshop/select_Please Select OneCulinaryTraveling  _80d3f1'), 
    'Lifestyle & Shopping', true)

WebUI.click(findTestObject('Object Repository/Registration-04/Page_Home - PS Enterprise Gameshop/input_Female_acffield_5ea3be750efb3'))

WebUI.setText(findTestObject('Object Repository/Registration-04/Page_Form Register/input__email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Registration-04/Page_Home - PS Enterprise Gameshop/input__password'), 
    password)

WebUI.setEncryptedText(findTestObject('Object Repository/Registration-04/Page_Home - PS Enterprise Gameshop/input__confirm_password'), 
    confirm_password)

WebUI.verifyElementText(findTestObject('Object Repository/Registration-04/Page_Form Register/div_Very weak - Please enter a stronger password'), 
    'Very weak - Please enter a stronger password.')

WebUI.verifyElementText(findTestObject('Object Repository/Registration-04/Page_Form Register/small_Hint The password should be at least _301386'), 
    'Hint: The password should be at least twelve characters long. To make it stronger, use upper and lower case letters, numbers, and symbols like ! " ? $ % ^ & ).')

WebUI.closeBrowser()
