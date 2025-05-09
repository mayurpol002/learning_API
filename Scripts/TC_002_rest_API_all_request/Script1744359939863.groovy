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
import static org.assertj.core.api.Assertions.*
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager
import groovy.json.JsonSlurper

WS.sendRequestAndVerify(findTestObject('REST_API_Test/ListUser'))
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
def slurper = new groovy.json.JsonSlurper()
def result = slurper.parseText(response.getResponseBodyContent())
def value = result.data[4].first_name
println(" get value from the response : " +value)
println(" Older Name Value is from variable : " +GlobalVariable.name)
GlobalVariable.name = value
println(" New Name Value is from variable : " +GlobalVariable.name)


WS.sendRequestAndVerify(findTestObject('REST_API_Test/update_request'))
ResponseObject response1 = WSResponseManager.getInstance().getCurrentResponse()
def slurper1 = new groovy.json.JsonSlurper()
def result1 = slurper1.parseText(response1.getResponseBodyContent())
def output = result1.name
println(" get value from the response : " +output)
def output1 = result1.job
println(" get value from the response : " +output1)
def output2 = result1.updatedAt
println(" get value from the response : " +output2)
//WS.verifyElementPropertyValue(response1, 'name', "Byron")
WS.verifyElementPropertyValue(response1, 'job', "south zone")
assertThat(response1.getResponseText()).contains('2025-04')



//
//
//
//WS.sendRequestAndVerify(findTestObject('REST_API_Test/Delete_request'))
//
//WS.sendRequestAndVerify(findTestObject('REST_API_Test/create_request'))
//
//WS.sendRequestAndVerify(findTestObject('REST_API_Test/update_request'))
//
//WS.sendRequestAndVerify(findTestObject('REST_API_Test/patch_request'))
//
//
//
//
//
//
//WS.verifyElementPropertyValue(response, 'name', "mayur")
//WS.verifyElementPropertyValue(response, 'job', "south zone")
//WS.verifyElementPropertyValue(response, 'updatedAt', "2025-04-16T06:21:51.029Z")