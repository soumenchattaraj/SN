package com.web.dao;

import java.util.Date;
import java.util.List;
import com.web.entity.Login_CredentialMasterEntity;

public interface Login_loginDaoInterface {
	
	public List<Login_CredentialMasterEntity> signIn(String primaryEmail,String passwd);
	public void signUp(String firstName,String middleName,String lastName,String primaryEmail,String secondaryEmail,String phNo,Date dob,String passwd,String confPasswd,String gender,String uniqueKey);

}
