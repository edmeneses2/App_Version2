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

Mobile.tap(findTestObject('Object Repository/Parte1/Crear_cuenta/CPN5/android.widget.Button - Crear Cuenta'), 100)

Mobile.verifyElementText(findTestObject('Parte1/Crear_cuenta/CPN5/android.widget.FrameLayout'), '')

Mobile.tap(findTestObject('Object Repository/Parte1/Crear_cuenta/CPN5/android.widget.Button - Enviar cdigo de registro'), 200)

Mobile.verifyElementText(findTestObject('Object Repository/Parte1/Crear_cuenta/CPN5/android.widget.TextView - Bienvenido a NapoleoN Chat'), 
    'Bienvenido a NapoleoN Chat')

Mobile.verifyElementVisible(findTestObject('Object Repository/Parte1/Crear_cuenta/CPN5/android.widget.LinearLayout'), 0)
