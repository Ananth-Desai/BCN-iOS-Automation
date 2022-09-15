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

Mobile.startApplication('/Users/ananthdesai/Desktop/Barcelona New.app', true)

WebUI.callTestCase(findTestCase('Route to Sign In'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeImage - Chevron Right (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeStaticText - India (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeStaticText - Mobile Number'), 0)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeTextField - Mobile number (2)'), '9764013529', 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeButton - Sign In (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeButton - Yes (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeTextField - Enter OTP (2)'), '000000', 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeButton - Verify OTP (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeButton - Forgot Password (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeImage - Chevron Right (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeButton - Chevron Right'), 0)

Mobile.tap(findTestObject('Sign In/XCUIElementTypeCell'), 0)

Mobile.tap(findTestObject('Sign In/XCUIElementTypeButton - Yes'), 0)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeTextField - Enter OTP (3)'), '000000', 0)

Mobile.tap(findTestObject('Sign In/XCUIElementTypeButton - Verify OTP (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeSecureTextField - Enter Password (1)'), 'bcn01Test1234@', 
    0)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeSecureTextField - Confirm Password'), 'bcn01Test1234', 
    0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeButton - Set Password'), 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeButton - Try Again (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeSecureTextField - (1)'), 'bcn01Test1234@', 0)

Mobile.tap(findTestObject('Sign In/XCUIElementTypeButton - Set Password'), 0)

Mobile.tap(findTestObject('Sign In/XCUIElementTypeButton - Try Again (1)'), 0)

Mobile.closeApplication()

