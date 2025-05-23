<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>WindChillInFahrenheit</name>
   <tag></tag>
   <elementGuidId>370c6d5f-79a2-4bfa-b383-3b09057fe8f0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/xml; charset=utf-8</value>
      <webElementGuid>38726f01-5aa4-4753-a4b1-626cbedb24ca</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>10.1.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <path></path>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soap:Envelope xmlns:soap=&quot;http://www.w3.org/2003/05/soap-envelope&quot; xmlns:tem=&quot;http://webservices.daehosting.com/temperature&quot;>&#xd;
   &lt;soap:Header/>&#xd;
   &lt;soap:Body>&#xd;
      &lt;tem:WindChillInFahrenheit>&#xd;
         &lt;tem:nFahrenheit>1000.00&lt;/tem:nFahrenheit>&#xd;
         &lt;tem:nWindSpeed>1000.00&lt;/tem:nWindSpeed>&#xd;
      &lt;/tem:WindChillInFahrenheit>&#xd;
   &lt;/soap:Body>&#xd;
&lt;/soap:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP12</soapRequestMethod>
   <soapServiceEndpoint>http://webservices.daehosting.com/services/TemperatureConversions.wso</soapServiceEndpoint>
   <soapServiceFunction>WindChillInFahrenheit</soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <wsdlAddress>http://webservices.daehosting.com/services/TemperatureConversions.wso?WSDL</wsdlAddress>
</WebServiceRequestEntity>
