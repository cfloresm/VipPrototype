<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- BEGIN VIP integration code -->
<!-- <script type="text/javascript" src="https://userservices.vip.symantec.com/vipuserservices/resources/js/v_1_0/vip?appId=8383688830&idpURL=http://vipclient.aws.af.cm&autoIntegration=simplified"></script> -->
<!-- END VIP integration code -->
</head>
<body onload='document.loginForm.passphrase.focus();'>
	<div>
		<form:form  action="authenticate" name="loginForm" modelAttribute="loginForm"  method='post' accept-charset='UTF-8'>
  		<form:input path="username" name="username" placeholder="Número de cliente"  />  <br/>
 		<form:password path="passphrase" name="passphrase" placeholder="Contraseña" />   <br/>
<%-- 		<form:input path="fingerPrint" type="hidden" name="deviceFingerprint" id="deviceFingerprint" /> --%>
		<button type="submit">Ingresar</button>   
<!-- 		onclick="document.getElementById('deviceFingerprint').value=IaDfp.readFingerprint();return -->
<!-- 		true;" value="Sign-In">Ingresar</button>  -->
 		<hr class="marginT5 marginB5" /> 
 		<img src="img/symantec2.png" class="pull-right" /> 
		<p>
			<label class="checkbox pull-left recordar_login"><input
				type="checkbox" /> Recordar mis datos &bull;</label> <a
				href="javascript:void(0);">&iquest;Olvidaste tu
				contrase&ntilde;a?</a>
		</p>
		</form:form>
	</div>
</body>
</html>