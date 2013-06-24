package com.test.rest.services.impl;

import java.net.URL;
import java.util.Iterator;

import javax.xml.namespace.QName;

import org.springframework.stereotype.Service;

import com.verisign.schemas.vip._2011._04.vipuserservices.AuthenticateUserRequestType;
import com.verisign.schemas.vip._2011._04.vipuserservices.AuthenticateUserResponseType;
import com.verisign.schemas.vip._2011._04.vipuserservices.EvaluateRiskRequestType;
import com.verisign.schemas.vip._2011._04.vipuserservices.EvaluateRiskResponseType;
import com.verisign.schemas.vip._2011._04.vipuserservices.KeyValuePairType;
import com.verisign.schemas.vip._2011._04.vipuserservices.OtpAuthDataType;
import com.verisign.schemas.vip._2011._04.vipuserservices.SetTemporaryPasswordRequestType;
import com.verisign.schemas.vip._2011._04.vipuserservices.SetTemporaryPasswordResponseType;
import com.verisign.schemas.vip._2011._04.vipuserservices.auth.AuthenticationService;
import com.verisign.schemas.vip._2011._04.vipuserservices.auth.AuthenticationServicePort;
import com.verisign.schemas.vip._2011._04.vipuserservices.mgmt.ManagementService;
import com.verisign.schemas.vip._2011._04.vipuserservices.mgmt.ManagementServicePort;
import com.verisign.schemas.vip._2011._04.vipuserservices.query.QueryService;

@Service("vipServicesImpl")
public class ServicesVIPAuthImpl {
    static final QName QUERY_SERVICE = new QName("http://schemas.verisign.com/vip/2011/04/vipuserservices/query","QueryService");
    static final QName MGMT_SERVICE = new QName("http://schemas.verisign.com/vip/2011/04/vipuserservices/mgmt","ManagementService");
    static final QName AUTH_SERVICE = new QName("http://schemas.verisign.com/vip/2011/04/vipuserservices/auth",	"AuthenticationService");
    static final String query_wsdl = "vipuserservices-query-1.1.wsdl";
    static final String mgmt_wsdl = "vipuserservices-mgmt-1.1.wsdl";
    static final String auth_wsdl = "vipuserservices-auth-1.1.wsdl";
    static String certFile = "/home/carlos/git/VipSingleClient/VIPSingleClient/src/main/resources/vip_cert.p12";
    static String password = "s3cr37o123";

    private AuthenticationService authenticationService = null;    	
    private QueryService queryService = null;    
    private ManagementService mgmtService = null;
    
    
    static {
    	try {
    	    System.setProperty("javax.net.debug", "ssl");
            System.setProperty("javax.net.ssl.keyStore", certFile);
            System.setProperty("javax.net.ssl.keyStorePassword", password);
            System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
    	} catch (Exception localException) {
    		System.out.println("Exception : " + localException);
    	}
    }

    public ServicesVIPAuthImpl() {
    	URL authwsdlURL = null;
    	URL mgmtwsdlURL = null;
    	URL querywsdlURL = null;
    	
    	authwsdlURL = ServicesVIPAuthImpl.class.getClassLoader().getResource(auth_wsdl);
    	mgmtwsdlURL = ServicesVIPAuthImpl.class.getClassLoader().getResource(mgmt_wsdl);
    	querywsdlURL = ServicesVIPAuthImpl.class.getClassLoader().getResource(query_wsdl);

    	
    	authenticationService = new AuthenticationService(authwsdlURL,AUTH_SERVICE);    	
	queryService = new QueryService(querywsdlURL, QUERY_SERVICE);    
    	mgmtService = new ManagementService(mgmtwsdlURL, MGMT_SERVICE);
    
    }
    
    
    public  boolean riskAutenticate(String userID , String password , String fingerPrint ,String ipAddress , String userAgent) {
	    
    	AuthenticationServicePort authenticationPort = authenticationService.getAuthenticationServicePort();
    
    	EvaluateRiskRequestType request = new EvaluateRiskRequestType();
    	request.setRequestId(("rqstId" + System.currentTimeMillis()));
    	request.setUserId(userID);
    	request.setUserAgent(userAgent);
    	String fingerprint = "_v02MyUgNGgYOi88OTk0emB7ZXV9DWRkbnUZPDsgLXU8Y21jfHUUJSU5MAIwNx48IXpgZmJ7ZmN1fR4dARgZeXU5PD4wdRIwNj46fHUWPSc6ODB6Z2J7ZXtkYWBme2RkZXUGNDM0Jzx6YGZie2ZjKRk8OyAtdTxjbWNzMyUmNmhnYSlkZmNjKWJjbSlkZmNjKWJhZnMzJSYiaDk8NyUwJTM5NCY9JTk0LDAneyY6KTw7ITAnOzQ5eCcwODohPDsyeCM8MCIwJyk5PDciPDEwIzw7MDYxODQxNCUhMCd7JjopOTw3JSUyOjoyOTA7NDY5JTkgMjw7Nj0nOjgweyY6KTk8NyUxM3smOik5PDc7JTIhJTpmMTQgITolOSAyPDt7JjopOTw3OyUyOjoyOTAhNDk+eyY6KTk8NzslOmQxeyY6KTk8NzY8Ozs0ODo7eDcnOiImMCd4JTkgMjw7eyY6KTk8NzM5NCY9JTk0LDAneyY6KTw2MDEhMDQlOSAyPDt7JjopOTw3ITohMDh4Njo7MHglOSAyPDt7JjopOTw3ITohMDh4MjgleCU5IDI8O3smOik5PDchOiEwOHg4IDk5LHglOSAyPDt7JjopOTw3ITohMDh4OzQnJzoiJiU0NjB4JTkgMjw7eyY6czMlJTxoJiIzaGRke2J7YmVle2dlZik/NCM0aGR7Yntle2BlKSM5Nmhme2N7ZntlczMlIS9oeGBzMyU5O2gwO3gABikpKXMzJTYlaGRkZGRlZGRkZGRkZGRkZGRkZGRkZGRkZGRkZGRkZGRkZGRkZWRkZGRlZGRkZGRkZGRkZGRkZGRkZGRkZGRkZGRkZWRlczMlIzZoczMlIyZoZ3MzJSEmaHMzJSEyaA==";
    	request.setIAAuthData(fingerprint);
    	request.setIp(ipAddress);
    
    	EvaluateRiskResponseType response = authenticationPort.evaluateRisk(request);
    
    	System.out.println("-----------------------------------------------------------");
    	System.out.println("ID Request" + response.getRequestId());
    	System.out.println("Status " + bytesToHex(response.getStatus()));
    	System.out.println("Is Risky " + response.isRisky());
    	System.out.println("Score " + response.getRiskScore());
    	System.out.println("Policy Version " + response.getPolicyVersion());
    	System.out.println("ID Event " + response.getEventId());
    	Iterator<KeyValuePairType> iterator = response.getKeyValuePairs().iterator();
    
    	while (iterator.hasNext()) {
    		KeyValuePairType item = iterator.next();
    		System.out.println("Key   " + item.getKey());
    		System.out.println("Value " + item.getValue());
    	}
    
    	System.out.println("-----------------------------------------------------------");
    
    	return response.isRisky();
    }
    
    
    public  void authenticate() {
    	AuthenticationServicePort authenticationPort = authenticationService.getAuthenticationServicePort();
    
    	AuthenticateUserRequestType authenticateUserRequest = new AuthenticateUserRequestType();
    	authenticateUserRequest.setRequestId(("rqstId" + System.currentTimeMillis()));
    	authenticateUserRequest.setUserId("CodeUser1");
    	OtpAuthDataType otpAuthData = new OtpAuthDataType();
    	otpAuthData.setOtp(this.getTemporaryPassword());
    	authenticateUserRequest.setOtpAuthData(otpAuthData);
    
    	AuthenticateUserResponseType responseAuthenticate = authenticationPort.authenticateUser(authenticateUserRequest);
    	System.out.println(bytesToHex(responseAuthenticate.getStatus()));
    	System.out.println(responseAuthenticate.getStatusMessage());
    
    }
    
    private String  getTemporaryPassword() {
    	ManagementServicePort mgmtPort = mgmtService.getManagementServicePort();
    
    	SetTemporaryPasswordRequestType setTemporaryPasswordRequest = new SetTemporaryPasswordRequestType();
    	setTemporaryPasswordRequest.setRequestId(("rqstId" + System.currentTimeMillis()));
    	setTemporaryPasswordRequest.setUserId("CodeUser1");
    	mgmtPort.setTemporaryPassword(setTemporaryPasswordRequest);
    
    	SetTemporaryPasswordResponseType response = mgmtPort.setTemporaryPassword(setTemporaryPasswordRequest);
    	System.out.println(bytesToHex(response.getStatus()));
    	System.out.println(response.getStatusMessage());
    	System.out.println(response.getTemporaryPassword());
    
    	return response.getTemporaryPassword();
    }
    
    
    
    public static String bytesToHex(byte[] bytes) {
    	char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
    			'A', 'B', 'C', 'D', 'E', 'F' };
    	char[] hexChars = new char[bytes.length * 2];
    	int v;
    	for (int j = 0; j < bytes.length; j++) {
    		v = bytes[j] & 0xFF;
    		hexChars[j * 2] = hexArray[v >>> 4];
    		hexChars[j * 2 + 1] = hexArray[v & 0x0F];
    	}
    	return new String(hexChars);
    }

    
}
