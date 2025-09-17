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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pre-ayf.isportz.co/registration')

WebUI.click(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__rmdp-input'))

WebUI.setText(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__rmdp-input_1'), '12/12/2019')

WebUI.setText(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__rmdp-input_1_2'), '12')

WebUI.setText(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__rmdp-input_1_2_3'), 
    '12/1')

WebUI.setText(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__rmdp-input_1_2_3_4'), 
    '12/12')

WebUI.setText(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__rmdp-input_1_2_3_4_5'), 
    '12/12/2')

WebUI.setText(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__rmdp-input_1_2_3_4_5_6'), 
    '12/12/20')

WebUI.setText(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__rmdp-input_1_2_3_4_5_6_7'), 
    '12/12/201')

WebUI.setText(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__rmdp-input_1_2_3_4_5_6_7_8'), 
    '12/12/2019')

WebUI.click(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/div_Select Grade In Fall_react-select__inpu_bcc327'))

WebUI.click(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/div_2nd'))

WebUI.setText(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__custom_school_fall'), 
    'QA')

WebUI.click(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/button_Next'))

WebUI.closeBrowser()

