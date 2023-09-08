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

Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN212/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN212/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN212/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN212/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN212/android.widget.SeekBar - 0.0'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN212/android.widget.ImageButton'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN212/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Parte2/Ajustes cuenta/Chats/CPN212/android.widget.FrameLayout (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

