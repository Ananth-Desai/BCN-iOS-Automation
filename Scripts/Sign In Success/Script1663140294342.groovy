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

WebUI.callTestCase(findTestCase('Phone Number Entry'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeSecureTextField - Enter password'), 'bcn01Test1234', 
    0)

Mobile.tap(findTestObject('Sign In/XCUIElementTypeButton - Sign In (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeButton - Try Again'), 0)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeSecureTextField -'), 'bcn01Test1234@', 0)

Mobile.tap(findTestObject('Sign In/XCUIElementTypeButton - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeButton - Continue'), 0)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeOther'), '0', 0)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeOther (1)'), '0', 0)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeOther (2)'), '0', 0)

Mobile.setText(findTestObject('Object Repository/Sign In/XCUIElementTypeOther (3)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (4)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (5)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (6)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (7)'), '0', 0)

Mobile.tap(findTestObject('Object Repository/Sign In/XCUIElementTypeButton - Dismiss'), 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (1)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (2)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (3)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (4)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (5)'), '.', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (6)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (7)'), '0', 0)

Mobile.tap(findTestObject('Sign In/XCUIElementTypeButton - Try Again'), 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (1)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (2)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (3)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (4)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (5)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (6)'), '0', 0)

Mobile.setText(findTestObject('Sign In/XCUIElementTypeOther (7)'), '0', 0)

