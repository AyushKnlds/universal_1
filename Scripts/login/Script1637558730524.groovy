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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://universal.3tlstaging.com/home')

WebUI.click(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/a_Register  Login'))

WebUI.setText(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/input_USERNAME OR EMAIL_mat-input-0'), 
    'ayush.kumar@knoldus.com')

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/input_PASSWORD_mat-input-1'), 
    'y5q/w9J6VfSHwuOi4Wm/Bg==')

WebUI.click(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/button_Login'))

WebUI.click(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/button_Earn Now'))

WebUI.click(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/button_Tap to unmute_ytp-large-play-button ytp-button'))

WebUI.rightClick(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/p_Ayush'))

WebUI.click(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/a_account_balance  Points History'))

WebUI.mouseOver(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/p_Ayush'))

WebUI.click(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/section_Manage Your Account Points History _b903da'))

WebUI.verifyElementText(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/mat-cell_You earned points for watching The_3b24a7'), 
    'You earned points for watching The Story Of Candyman')

WebUI.verifyElementText(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/mat-cell_15'), 
    '+15', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/p_Ayush'))

WebUI.click(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/a_exit_to_app  Logout'))

WebUI.click(findTestObject('Object Repository/login/Page_Universal All-Access Rewards  Get Rewa_700d57/a_Continue to logout'))

WebUI.closeBrowser()

