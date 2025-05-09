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

WS.sendRequest(findTestObject('Chain_requests/get_country_name'))
response = WS.sendRequestAndVerify(findTestObject('Chain_requests/get_country_name'))
WS.verifyResponseStatusCode(response, 200)


ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
String xml = response.responseBodyContent
def dataValue = new XmlSlurper().parseText(xml)
def ISO_code = dataValue.ListOfCountryNamesByCodeResult.tCountryCodeAndName[10].sISOCode.text()
println('extracted value from response to get ISO code : ' + ISO_code)


println( "previous ISO code: " +GlobalVariable.ISOCODE )
GlobalVariable.ISOCODE = ISO_code
println( "current ISO code: " +GlobalVariable.ISOCODE )


WS.sendRequestAndVerify(findTestObject('Chain_requests/get_iso_code'))
ResponseObject response1 = WSResponseManager.getInstance().getCurrentResponse()
String xml1 = response1.responseBodyContent
def dataValue1 = new XmlSlurper().parseText(xml1)
def country_name = dataValue1.CountryNameResult.text()
println('extracted value from response to get country name : ' + country_name)




WS.sendRequestAndVerify(findTestObject('Chain_requests/get_country_name_by_currency'))
ResponseObject response2 = WSResponseManager.getInstance().getCurrentResponse()
String xml2 = response2.responseBodyContent
def dataValue2 = new XmlSlurper().parseText(xml2)
def currency = dataValue2.CountryCurrencyResult.sName.text()
println('extracted value from response to get currency : ' + currency)

