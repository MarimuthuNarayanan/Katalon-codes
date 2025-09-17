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
import com.kms.katalon.core.testobject.ConditionType


WebUI.waitForPageLoad(10)
TestObject Add_signature = new TestObject()
TestObject Type_button = new TestObject()
TestObject Waiver_field = new TestObject()
TestObject save_sign = new TestObject()
TestObject nxt_btn = new TestObject()


Add_signature.addProperty("xpath", ConditionType.EQUALS, "(//div[@class='alex-brush']//button[contains(text(), 'Add Signature')])[1]")
Type_button.addProperty("xpath", ConditionType.EQUALS, "(//button[contains(@class, 'btn-outline-primary') and text()='Type'])")
Waiver_field.addProperty("xpath", ConditionType.EQUALS, "(//input[@class='form-control' and @placeholder='Type your name'])")
save_sign.addProperty("xpath", ConditionType.EQUALS, "(//button[contains(@class, 'btn-primary') and text()='Save Signature'])")
nxt_btn.addProperty("xpath", ConditionType.EQUALS, "((//button[normalize-space(text())='Submit & Next'])[1])")



WebUI.delay(1)

WebUI.click(Add_signature)

WebUI.click(Type_button)

WebUI.click(Waiver_field)

WebUI.setText(Waiver_field, GlobalVariable.First_name)

WebUI.click(save_sign)

WebUI.delay(1)


WebUI.click(Add_signature)

WebUI.delay(1)

WebUI.click(Type_button)

WebUI.click(Waiver_field)

WebUI.setText(Waiver_field, GlobalVariable.First_name)

WebUI.click(save_sign)

WebUI.click(nxt_btn)

