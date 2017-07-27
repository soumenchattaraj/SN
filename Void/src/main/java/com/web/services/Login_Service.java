package com.web.services;

import java.util.Date;

public interface Login_Service {
	
	public void signUp(String firstName,String middleName,String lastName,String primaryEmail,String secondaryEmail,String phNo,Date dob,String passwd,String confPasswd,String gender,String uniqueKey);

}
