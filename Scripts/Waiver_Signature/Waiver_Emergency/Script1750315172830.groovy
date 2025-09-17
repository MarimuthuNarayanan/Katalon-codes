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

WebUI.waitForPageLoad(10)

TestObject Add_signature = new TestObject()

Add_signature.addProperty("xpath", ConditionType.EQUALS, "(//div[@class='alex-brush']//button[contains(text(), 'Add Signature')])[2]")

WebUI.waitForElementPresent(findTestObject('Waiver/Waiver_Athlete/Page_Membership/button_Add Signature_1_2_3_4'), 10)

WebUI.click(Add_signature)

//WebUI.click(findTestObject('Waiver/Waiver_Athlete/Page_Membership/button_Add Signature_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/button_Type_1'))

WebUI.click(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/input_Type_form-control' ))

WebUI.setText(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/input_Type_form-control'), GlobalVariable.First_name)

WebUI.click(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/button_Save Signature_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/button_Submit  Next_1'))