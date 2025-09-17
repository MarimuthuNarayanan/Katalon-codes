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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL_Profile + '/login')

WebUI.waitForPageLoad(10)

TestObject user_name = new TestObject()

TestObject Password = new TestObject()

TestObject Login_button = new TestObject()

TestObject unmask_button = new TestObject()

TestObject Reports = new TestObject()

TestObject membership_reports = new TestObject()

TestObject Search_btn = new TestObject()

TestObject Advanced_search = new TestObject()

TestObject email_search = new TestObject()

WebUI.delay(3)

user_name.addProperty('xpath', ConditionType.EQUALS, '//input[@name=\'username\']')

Password.addProperty('xpath', ConditionType.EQUALS, '//input[@name=\'password\']')

Login_button.addProperty('xpath', ConditionType.EQUALS, '//button[@type=\'submit\' and contains(@class, \'btn-primary\')]')

unmask_button.addProperty('xpath', ConditionType.EQUALS, '(//span//*[name()=\'svg\'])[3]')

Reports.addProperty('xpath', ConditionType.EQUALS, '(//a[contains(@class, \'menu-link\') and contains(., \'Reports\')])[1]')

membership_reports.addProperty('xpath', ConditionType.EQUALS, '(//a[contains(@class, \'menu-link\') and contains(., \'Reports\')])[2]')

Search_btn.addProperty('xpath', ConditionType.EQUALS, '//button[@type=\'submit\' and normalize-space(text())=\'Search\']')

Advanced_search.addProperty('xpath', ConditionType.EQUALS, '//h4[normalize-space(text())=\'Advanced Search\']')

email_search.addProperty('xpath', ConditionType.EQUALS, '//input[@placeholder=\'Enter Email\']')

WebUI.click(user_name)

WebUI.setText(user_name, GlobalVariable.admin_id)

WebUI.click(unmask_button)

WebUI.click(Password)

WebUI.setText(Password, GlobalVariable.admin_password)

//WebUI.setEncryptedText(Password, 'cvW8qx4B2o3F4VwP/kNsqA==')
WebUI.click(Login_button)

WebUI.comment('Logged in successfully')

WebUI.waitForPageLoad(10)

WebUI.delay(2)

WebUI.waitForElementClickable(Reports, 10)

WebUI.takeFullPageScreenshot()

WebUI.click(Reports)

WebUI.delay(1)

WebUI.click(membership_reports)

WebUI.delay(5)
WebUI.comment('Membership_reports')
WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()