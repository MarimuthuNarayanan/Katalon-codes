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

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__first_name'), 'Harsh')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__last_name'), 'Harry')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input_Preferred Name_preferred_name'), 'AH')

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/label_Male'))

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__weight'), '33')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__rmdp-input'), '12/12/2019')

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Select Grade In Fall_react-select__inpu_bcc327'))

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_1st'))

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__custom_school_fall'), 'qa')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/button_Next'))

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__email'), 'madhusudan@isportz.co')

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/input__email'))

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__retype_email'), 'madhusudan@isportz.co')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__address1'), '123Qa')

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/svg_Country_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_USA'))

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Select State_react-select__input-contai_8904ce'))

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Alabama'))

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__city'), 'safh')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__zip'), '12345')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input_Phone_phone_1'), '+1 (123) 456-7899')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__parent.0.parent_first_name'), 'Alex')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__parent.0.parent_last_name'), 'Peter')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input_Preferred Name_parent.0.parent_prefer_298c3d'), 
    'peter')

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/label_Father'))

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__parent.0.parent_email'), 'alexp@qa.co')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input_Phone_parent.0.parent_phone_1'), '+1 (888) 888-8888')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__parent.0.parent_address1'), '134,khv street')

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Country'))

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_USA_1'))

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Select State_react-select__input-contai_8904ce_1'))

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Alaska'))

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__parent.0.parent_city'), 'qas')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__parent.0.parent_zip'), '98765')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__parent.0.parent_employer'), 'QA')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/button_Next_1'))

