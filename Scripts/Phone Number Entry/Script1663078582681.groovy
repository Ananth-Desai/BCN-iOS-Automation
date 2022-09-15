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

WebUI.callTestCase(findTestCase('Route to Sign Up'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeImage - Chevron Right'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeStaticText - India'), 0)

Mobile.setText(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeTextField - Mobile number'), '9764013529', 
    0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeSwitch - 0'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - Sign Up'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - Yes'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - Dismiss'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - Sign Up'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - No'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - Already have a BCN account, Sign In'), 
    0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeStaticText - Country'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeStaticText - India (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeTextField - Mobile number (1)'), '9764013529', 
    0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - No (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - Yes (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeTextField - Enter OTP'), '000000', 0)

Mobile.setText(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeTextField - 000000'), '000001', 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - Verify OTP'), 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - Try Again'), 0)

Mobile.setText(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeTextField - 000001'), '000000', 0)

Mobile.tap(findTestObject('Object Repository/Phone Number Entry/XCUIElementTypeButton - Verify OTP'), 0)

