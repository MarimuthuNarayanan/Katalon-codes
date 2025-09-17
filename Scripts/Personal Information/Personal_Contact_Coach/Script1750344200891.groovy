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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType

import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent


WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__first_name'))

WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__first_name'), GlobalVariable.First_name)

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__last_name'))

WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__last_name'), GlobalVariable.First_name)

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input_Middle Initial_middle_name'))

WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input_Middle Initial_middle_name'), 
    'AJ')

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/label_Female'))

//WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__rmdp-input'))

//WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__rmdp-input'),"12/12/1998")

TestObject dobf = new TestObject()

dobf.addProperty("xpath", ConditionType.EQUALS, "//input[@class='rmdp-input']")

WebUI.setText(dobf, "12/12/1998")

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__first_name'))

TestObject tshirt_size = new TestObject()

tshirt_size.addProperty("xpath", ConditionType.EQUALS, "//input[contains(@class, 'react-select__input')]")

WebUI.click(tshirt_size)

Robot robot = new Robot()

// Press DOWN and ENTER
robot.keyPress(KeyEvent.VK_DOWN)
robot.keyRelease(KeyEvent.VK_DOWN)

WebUI.delay(1)

robot.keyPress(KeyEvent.VK_ENTER)
robot.keyRelease(KeyEvent.VK_ENTER)


WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/button_Next'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__email'), 10)

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__email'))

WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__email'), GlobalVariable.Email)

WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__retype_email'), 
    GlobalVariable.Email)

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__address1'))

WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__address1'), 'qa street')

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/div_USA_react-select__input-container css-19bb58m'))

robot.keyPress(KeyEvent.VK_ENTER)
robot.keyRelease(KeyEvent.VK_ENTER)

//WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/div_USA'))

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/div_Select State'))

//WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/div_Alabama'))
robot.keyPress(KeyEvent.VK_ENTER)
robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__city'))

WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__city'), 'qa')

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__zip'))

WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__zip'), '56985')

WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input_Phone_phone_1'), 
    '+8 (888) 888-8888')

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/button_Next_1'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__emergency.0.emergency_first_name'))

WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__emergency.0.emergency_first_name'), 
    'James')

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__emergency.0.emergency_last_name'))

WebUI.setText(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/input__emergency.0.emergency_last_name'), 
    'Mathew')

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/label_Spouse'))

WebUI.click(findTestObject('Object Repository/Personal info/Personal Info Coach/Page_Membership/button_Next'))


