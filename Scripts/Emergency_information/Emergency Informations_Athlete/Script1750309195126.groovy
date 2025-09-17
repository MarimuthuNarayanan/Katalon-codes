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
import com.kms.katalon.core.testobject.ObjectRepository as OR

WebUI.setText(findTestObject('Object Repository/Emergency_details/Page_Membership/input__emergency.0.emergency_first_name'),
	'Alex')

WebUI.setText(findTestObject('Object Repository/Emergency_details/Page_Membership/input__emergency.0.emergency_last_name'),
	'William')

WebUI.setText(findTestObject('Object Repository/Emergency_details/Page_Membership/input_Preferred Name_emergency.0.emergency__c88539'),
	'AW')

WebUI.setText(findTestObject('Object Repository/Emergency_details/Page_Membership/input_Phone_emergency.0.emergency_phone_1'),
	'+1 (888) 888-8888')

WebUI.click(findTestObject('Object Repository/Emergency_details/Page_Membership/label_Mother'))

WebUI.click(findTestObject('Object Repository/Emergency_details/Page_Membership/div_Medical Insurance_react-select__input-c_f3f893'))

WebUI.click(findTestObject('Object Repository/Emergency_details/Page_Membership/div_No'))

/*WebUI.click(findTestObject('Object Repository/Emergency_details/Page_Membership/label_Choose File'))

TestObject uploadBtn = findTestObject('Object Repository/Emergency_details/Page_Membership/label_Choose File')
String filePath = "file:///C:/Users/marim/OneDrive/Desktop/AYF-MedicalClearance.pdf"

WebUI.uploadFile(uploadBtn, filePath)*/

TestObject uploadBtn = OR.findTestObject('Object Repository/Emergency_details/Page_Membership/label_Choose File')
String filePath = "file:///C:/Users/marim/OneDrive/Desktop/AYF-MedicalClearance.pdf"

CustomKeywords.'custom.FileUploader.uploadFileWithRobot'(uploadBtn, filePath)

WebUI.click(findTestObject('Object Repository/Emergency_details/Page_Membership/button_Next'))
