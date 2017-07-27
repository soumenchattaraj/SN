package com.web.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.Login_loginDaoInterface;

public class Login_ServiceImpl implements Login_Service {
	
	@Autowired
	Login_loginDaoInterface login_loginDaoInterface;
	
	
	public void signUp(String firstName,String middleName,String lastName,String primaryEmail,String secondaryEmail,String phNo,Date dob,String passwd,String confPasswd,String gender,String uniqueKey)
	{
		login_loginDaoInterface.signUp(firstName,middleName,lastName,primaryEmail,secondaryEmail,phNo,dob,passwd,confPasswd,gender,uniqueKey);
	}

	
}
