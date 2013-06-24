package com.test.rest.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.rest.beans.LoginForm;
import com.test.rest.services.impl.ServicesVIPAuthImpl;

@Controller
public class SingleController {

    	@Autowired  
    	ServicesVIPAuthImpl vipServicesImpl;
    	

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String login( ModelMap model) {
		model.addAttribute("loginForm", new LoginForm());
		return "login";
	}
    
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login2(ModelMap model) {
		model.addAttribute("loginForm", new LoginForm());
		return "login";
	}
	
	@RequestMapping(value = { "/authenticate" }, method = RequestMethod.POST)
	public String register(HttpServletRequest request,
		@ModelAttribute(value = "loginForm") LoginForm loginForm,
		BindingResult result, Model model) {
	    	
	        String userIpAddress = request.getRemoteAddr();
	        String userAgent = request.getHeader("user-agent");
	    
	    	boolean isRisky = vipServicesImpl.riskAutenticate(loginForm.getUsername(), loginForm.getPassphrase(), loginForm.getFingerPrint(),userIpAddress , userAgent);
	    	
	    	if(isRisky)
	    	    return "challengue";
	    	 
	    	
	    return "list";
	}
}