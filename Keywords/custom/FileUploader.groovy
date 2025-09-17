package custom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import com.kms.katalon.core.util.KeywordUtil
public class FileUploader {

	/**
	 * Uploads a file using Robot. Use for native file dialogs.
	 * @param uploadButton - TestObject (element that opens upload dialog)
	 * @param filePath - Full file path (e.g., C:/Users/user/Desktop/file.png)
	 */
	public static void uploadFileWithRobot(TestObject uploadButton, String filePath) {
		try {
			WebUI.click(uploadButton)
			WebUI.delay(2)  // Wait for file dialog to appear

			// Copy file path to clipboard
			StringSelection selection = new StringSelection(filePath)
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null)

			Robot robot = new Robot()

			// Paste the file path
			robot.delay(500)
			robot.keyPress(KeyEvent.VK_CONTROL)
			robot.keyPress(KeyEvent.VK_V)
			robot.delay(200)
			robot.keyRelease(KeyEvent.VK_V)
			robot.keyRelease(KeyEvent.VK_CONTROL)

			robot.delay(1000)

			// Press Enter
			robot.keyPress(KeyEvent.VK_ENTER)
			robot.keyRelease(KeyEvent.VK_ENTER)

			KeywordUtil.logInfo("File uploaded using Robot: " + filePath)
		} catch (Exception e) {
			KeywordUtil.markFailed("File upload failed: " + e.message)
		}
	}
}
