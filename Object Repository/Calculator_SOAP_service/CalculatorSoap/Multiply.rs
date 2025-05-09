<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Multiply</name>
   <tag></tag>
   <elementGuidId>ee318040-e2f0-4ae2-8e23-8e5da0770810</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>SOAPAction</name>
      <type>Main</type>
      <value>http://tempuri.org/Multiply</value>
      <webElementGuid>e4e5a158-e956-4aab-ac3c-55175ec305ec</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>${content_type}</value>
      <webElementGuid>3bd5dc01-3965-4351-985d-b96bed0d5eac</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${auth}</value>
      <webElementGuid>38229bc7-954c-4e9d-9229-5bf12b24fd03</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>10.1.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <path></path>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:tem=&quot;http://tempuri.org/&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;tem:Multiply>
         &lt;tem:intA>${intA}&lt;/tem:intA>
         &lt;tem:intB>${intB}&lt;/tem:intB>
      &lt;/tem:Multiply>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>http://www.dneonline.com/calculator.asmx</soapServiceEndpoint>
   <soapServiceFunction>Multiply</soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>findTestData('Multiply').getValue(1, 7)</defaultValue>
      <description></description>
      <id>26e7c62b-1665-4dec-beae-b761038d0ca4</id>
      <masked>false</masked>
      <name>intA</name>
   </variables>
   <variables>
      <defaultValue>5</defaultValue>
      <description></description>
      <id>b80472a9-dead-49d1-9797-3a74bb33d4d2</id>
      <masked>false</masked>
      <name>intB</name>
   </variables>
   <variables>
      <defaultValue>'Basic YWRtaW46YWRtaW4xMTE='</defaultValue>
      <description></description>
      <id>3e0cc90f-132d-4974-9caa-4d1f7868e7bd</id>
      <masked>false</masked>
      <name>auth</name>
   </variables>
   <variables>
      <defaultValue>'text/xml; charset=utf-8'</defaultValue>
      <description></description>
      <id>c053f4cc-e374-406d-94a6-e87931d598a3</id>
      <masked>false</masked>
      <name>content_type</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
WS.verifyElementText(response, 'MultiplyResponse.MultiplyResult', '10')


</verificationScript>
   <wsdlAddress>http://www.dneonline.com/calculator.asmx?WSDL</wsdlAddress>
</WebServiceRequestEntity>
