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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.testobject.ConditionType



Robot robot = new Robot()

TestObject Name_of_Insurance_Carrier = new TestObject()
TestObject Policy_Number = new TestObject()
TestObject Policy_Holder_Name = new TestObject()
TestObject Allergies = new TestObject()
TestObject Medical_Conditions = new TestObject()
TestObject Medical_Other = new TestObject()


Name_of_Insurance_Carrier.addProperty("xpath", ConditionType.EQUALS, "//input[@name='medical.insurance_name']")
Policy_Number.addProperty("xpath", ConditionType.EQUALS, "//input[@name='medical.policy']")
Policy_Holder_Name.addProperty("xpath", ConditionType.EQUALS, "//input[@name='medical.policy_holder_name']")
Allergies.addProperty("xpath", ConditionType.EQUALS, "//input[@name='medical.allergies']")
Medical_Conditions.addProperty("xpath", ConditionType.EQUALS, "//input[@name='medical.medical_condition']")
Medical_Other.addProperty("xpath", ConditionType.EQUALS, "//input[@name='medical.other']")



WebUI.waitForPageLoad(0)

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

	robot.keyPress(KeyEvent.VK_DOWN)

	robot.keyRelease(KeyEvent.VK_DOWN)

	WebUI.delay(1)

	robot.keyPress(KeyEvent.VK_ENTER)

	robot.keyRelease(KeyEvent.VK_ENTER)

	WebUI.delay(1)
	
	WebUI.click(Name_of_Insurance_Carrier)
	WebUI.setText(Name_of_Insurance_Carrier, "QA-Insurance")
	
	WebUI.click(Policy_Number)
	WebUI.setText(Policy_Number, "121298MN")
	
	WebUI.click(Policy_Holder_Name)
	WebUI.setText(Policy_Holder_Name, GlobalVariable.Last_name)
	
	WebUI.click(findTestObject('Object Repository/Emergency_details/Page_Membership/button_Next'))
	WebUI.delay(2)
	WebUI.takeFullPageScreenshot()
	WebUI.comment("Mandatorey errors captured")
	
	
	WebUI.click(Allergies)
	WebUI.setText(Allergies, "none")

	WebUI.click(Medical_Conditions)
	WebUI.setText(Medical_Conditions, "none")
	
	WebUI.click(Medical_Other)
	WebUI.setText(Medical_Other, "none")

//WebUI.click(findTestObject('Object Repository/Emergency_details/Page_Membership/div_No'))

if (GlobalVariable.Insurance_upload == true) {

	TestObject uploadBtn = OR.findTestObject('Object Repository/Emergency_details/Page_Membership/label_Choose File')

    String filePath = 'file:///C:/Users/marim/OneDrive/Desktop/AYF-MedicalClearance.pdf'

    CustomKeywords.'custom.FileUploader.uploadFileWithRobot'(uploadBtn, filePath)
} else {
    println('Insurance is non-mandatory for the client')
}

WebUI.click(findTestObject('Object Repository/Emergency_details/Page_Membership/button_Next'))

