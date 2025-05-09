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
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.webservice.verification.WSResponseManager as WSResponseManager
import groovy.xml.XmlSlurper as XmlSlurper
import groovy.json.JsonSlurper as JsonSlurper

ResponseObject response = WS.sendRequest(findTestObject('Calculator_SOAP_service/CalculatorSoap/Multiply', [('intA') : intA
            , ('intB') : 2]))

String xml = response.responseBodyContent

def dataValue = new XmlSlurper().parseText(xml)

def value = dataValue.MultiplyResult.text()

println('extracted value from response after multiplication : ' + value)

result = WS.verifyElementText(response, 'MultiplyResponse.MultiplyResult', '20', FailureHandling.CONTINUE_ON_FAILURE)

if (result == true) {
    response1 = WS.sendRequest(findTestObject('Calculator_SOAP_service/CalculatorSoap/Multiply', [('intA') : value]))

    WS.verifyElementText(response1, 'MultiplyResponse.MultiplyResult', '100')

    String xml1 = response1.responseBodyContent

    def dataValue1 = new XmlSlurper().parseText(xml1)

    def value1 = dataValue1.MultiplyResult.text()

    println('extracted value from response after second multiplication : ' + value1)
} else {
    println('extracted value from response is not matching with the expected value, hence failed')
}

