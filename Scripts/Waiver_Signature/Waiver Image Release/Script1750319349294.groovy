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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement



TestObject Add_signature = new TestObject()

Add_signature.addProperty("xpath", ConditionType.EQUALS, "(//div[@class='alex-brush']//button[contains(text(), 'Add Signature')])[4]")

// Find all matching buttons
//List<WebElement> buttons = WebUiCommonHelper.findWebElements(Add_signature, 10)

WebUI.waitForElementPresent(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/button_Add Signature_1_2_3_4_5_6_7_8'),
	10)

//WebUI.click(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/button_Add Signature_1_2_3_4_5_6_7_8'))

WebUI.click(Add_signature)

//buttons.get(4).click()


WebUI.click(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/button_Type_1_2_3'))

WebUI.click(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/input_Type_form-control'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/input_Type_form-control'), GlobalVariable.First_name)

WebUI.click(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/button_Save Signature_1_2_3'))

WebUI.click(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/button_Submit  Next_1_2_3'))

WebUI.takeFullPageScreenshot()

println("all waivers has been signed")
