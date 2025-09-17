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

if (GlobalVariable.Payment_req == true) {
	
    Robot robot = new Robot()

    //String price = WebUI.getText(findTestObject('Object Repository/Payment_screen/Page_Membership/span_450.05'))
    WebUI.waitForPageLoad(10)

    WebUI.setText(findTestObject('Object Repository/Payment_screen/Page_Membership/input__cardNumber'), '4111111111111111')

    WebUI.setText(findTestObject('Object Repository/Payment_screen/Page_Membership/input__nameonCard'), 'Alex J')

    WebUI.click(findTestObject('Object Repository/Payment_screen/Page_Membership/div_Month_react-select__indicators css-1wy0on6'))

    WebUI.delay(1)

    //WebUI.selectOptionByIndex(findTestObject('Object Repository/Payment_screen/Page_Membership/div_Month_react-select__indicators css-1wy0on6'), 2)
    //WebUI.click(findTestObject('Object Repository/Payment_screen/Page_Membership/div_02'))
	
    robot.keyPress(KeyEvent.VK_ENTER)

    robot.keyRelease(KeyEvent.VK_ENTER)

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Payment_screen/Page_Membership/svg_Year_css-8mmkcg'))

    robot.keyPress(KeyEvent.VK_DOWN)

    robot.keyRelease(KeyEvent.VK_DOWN)

    WebUI.delay(1)

    robot.keyPress(KeyEvent.VK_DOWN)

    robot.keyRelease(KeyEvent.VK_DOWN)

    WebUI.delay(1)

    robot.keyPress(KeyEvent.VK_ENTER)

    robot.keyRelease(KeyEvent.VK_ENTER)

    WebUI.delay(1)

    //WebUI.selectOptionByIndex(findTestObject('Object Repository/Payment_screen/Page_Membership/svg_Year_css-8mmkcg'), 4)
    //WebUI.click(findTestObject('Object Repository/Payment_screen/Page_Membership/div_2033'))
    WebUI.setEncryptedText(findTestObject('Object Repository/Payment_screen/Page_Membership/input__cvv'), 'SVPh8nTuu7Q=')

    WebUI.click(findTestObject('Object Repository/Payment_screen/Page_Membership/input_Same as_me-1'))

    //WebUI.click(findTestObject('Object Repository/Payment_screen/Page_Membership/label_I agree to theTerms and Conditions'))
    WebUI.executeJavaScript('document.getElementById(\'agree\').click();', null)

    //WebUI.verifyElementText(findTestObject('Object Repository/Payment_screen/Page_Membership/span_435.00'), price)
    WebUI.click(findTestObject('Object Repository/Payment_screen/Page_Membership/button_Pay Now'))

    WebUI.waitForElementPresent(findTestObject('Payment_screen/Page_Membership/p_This transaction has been approved. Your _76369d'), 
        20)
	
	WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Payment_screen/Page_Membership/p_This transaction has been approved. Your _76369d'))

    String transaction_id = WebUI.getText(findTestObject('Object Repository/Payment_screen/Page_Membership/p_This transaction has been approved. Your _76369d'))

    println(transaction_id)

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/Payment_screen/Page_Membership/h3_Registration Completed Successfully'))

    String paid_amount = WebUI.getText(findTestObject('Object Repository/Payment_screen/Page_Membership/h2_Total 450.05'))

    println(paid_amount)
	
} else {
	
    println('There is no payment Flow')
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/h3_Registration Completed Successfully'),
		10)

	WebUI.click(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/h3_Registration Completed Successfully'))

	WebUI.takeScreenshot()

	String message = WebUI.getText(findTestObject('Object Repository/Waiver/Waiver_Athlete/Page_Membership/h3_Registration Completed Successfully'))

	println(message)

	WebUI.closeBrowser()
}

WebUI.closeBrowser()

