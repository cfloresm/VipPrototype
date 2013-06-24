package com.test.rest.beans;

public class LoginForm {
	private String username ;
	private String passphrase ;
	private String fingerPrint; 	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username.trim();
	}
	public String getPassphrase() {
		return passphrase;
	}
	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase.trim();
	}
	public String getFingerPrint() {
	    return fingerPrint;
	}
	public void setFingerPrint(String fingerPrint) {
	    this.fingerPrint = fingerPrint;
	}
}