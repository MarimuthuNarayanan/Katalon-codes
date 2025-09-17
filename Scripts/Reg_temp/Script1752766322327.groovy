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

import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

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


Robot robot = new Robot()

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__first_name'), GlobalVariable.First_name)

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__last_name'), GlobalVariable.Last_name)

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input_Preferred Name_preferred_name'), 'AH')

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/label_Male'))

switch (GlobalVariable.Sports_name) {
	
	case "Tackle":
	
		WebUI.comment("User selected Tackle")
		
		WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__weight'), '33')
		
		WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__rmdp-input'), '12/12/2022')
		
		WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/input__weight'))
		
		WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Select Grade In Fall_react-select__inpu_bcc327'))
		
		WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_1st'))
		
		WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__custom_school_fall'), 'qa')
		
		/*TestObject School_Phone_Number = new TestObject()
		
		School_Phone_Number.addProperty("xpath", ConditionType.EQUALS, "//input[@name='custom_school_phone']")
		
	    WebUI.click(School_Phone_Number)
	
	    WebUI.setText(School_Phone_Number, "+0 (335) 189-733")*/
		
		
		
		TestObject Athlete_Photo = new TestObject()
		
		Athlete_Photo.addProperty("xpath", ConditionType.EQUALS, "//label[@for='file-input-profile_pic']")
		
		//TestObject Athlete_Photo = OR.findTestObject('Object Repository/Emergency_details/Page_Membership/label_Choose File')
		
		String filePath = 'file:///C:/Users/marim/OneDrive/Desktop/dp.JPG'
		
		CustomKeywords.'custom.FileUploader.uploadFileWithRobot'(Athlete_Photo, filePath)
		
		
		
		
		if (GlobalVariable.jersey_pant == true) {
			
		TestObject Jersey_ID = new TestObject()
			
		Jersey_ID.addProperty("xpath", ConditionType.EQUALS, "//input[@name='jersey_number']")
			
		WebUI.click(Jersey_ID)
		
		WebUI.setText(Jersey_ID, "12")
			
		WebUI.delay(2)
		
		
		TestObject Jersey_Size = new TestObject()
		
		Jersey_Size.addProperty("xpath", ConditionType.EQUALS, "//input[@id='react-select-3-input']")
		
		WebUI.click(Jersey_Size)
		
		WebUI.delay(2)
		
		robot.keyPress(KeyEvent.VK_ENTER)
		
		robot.keyRelease(KeyEvent.VK_ENTER)
		
		WebUI.delay(1)
		
		
		TestObject Pant_Size = new TestObject()
		
		Pant_Size.addProperty("xpath", ConditionType.EQUALS, "//input[@id='react-select-4-input']")
		
		WebUI.click(Pant_Size)
		
		WebUI.delay(2)
		
		robot.keyPress(KeyEvent.VK_ENTER)
		
		robot.keyRelease(KeyEvent.VK_ENTER)
		
		WebUI.delay(1)
		}
		
		else {
			
		WebUI.comment("Jersey & Pant size Not Applicable")
		}
		
		
		WebUI.takeScreenshot()
	
		break
		
	case "Flag":
	
		WebUI.comment("User selected Flag")
		
		WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__weight'), '33')
		
//		WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__rmdp-input'), '12/12/2019')
		
		TestObject dobf = new TestObject()
		
		dobf.addProperty("xpath", ConditionType.EQUALS, "//input[@class='rmdp-input']")
		
		WebUI.setText(dobf, "12/12/2019")
		
		WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/input__weight'))
		
		WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Select Grade In Fall_react-select__inpu_bcc327'))
		
		WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_1st'))
		
		WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__custom_school_fall'), 'qa')
		
		WebUI.takeScreenshot()
		
		break

	case "Cheer":
	
		WebUI.comment("User selected Cheer")
		
		TestObject dob = new TestObject()
		
		dob.addProperty("xpath", ConditionType.EQUALS, "//input[@class='rmdp-input']")
		
		WebUI.setText(dob, "12/12/2019")
		
//		WebUI.setText(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__rmdp-input_1'), '12/12/2019')
		
		WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/input__first_name'))
		
		WebUI.click(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/div_Select Grade In Fall_react-select__inpu_bcc327'))
		
		WebUI.click(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/div_2nd'))
		
		WebUI.setText(findTestObject('Object Repository/Personal info/Cheer_personal/Page_Membership/input__custom_school_fall'),
			'QA')
		WebUI.takeScreenshot()
		
		break

	default:
		WebUI.comment("Unknown sport selected: " + GlobalVariable.Sports_name)
		break
}

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/button_Next'))

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__email'), GlobalVariable.Email)

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/input__email'))

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__retype_email'), GlobalVariable.Email)

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__address1'), '6 Metrotech Center')

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/svg_Country_css-8mmkcg'))

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(1)

//WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_USA'))

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Select State_react-select__input-contai_8904ce'))

//WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Alabama'))

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__city'), 'Metrotech Center')

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

//WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_USA_1'))

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Select State_react-select__input-contai_8904ce_1'))

//WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/div_Alaska'))

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)
//comments

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__parent.0.parent_city'), 'Metrotech Center')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__parent.0.parent_zip'), '98765')

WebUI.setText(findTestObject('Object Repository/Personal info/Page_Membership/input__parent.0.parent_employer'), 'QA')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Personal info/Page_Membership/button_Next_1'))