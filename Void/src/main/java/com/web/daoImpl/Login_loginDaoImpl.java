package com.web.daoImpl;


import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import com.web.dao.Login_loginDaoInterface;
import com.web.entity.Login_CredentialMasterEntity;
import com.web.entity.Login_UserDetails;

public class Login_loginDaoImpl extends HibernateDaoSupport implements Login_loginDaoInterface{
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Transactional
	public List<Login_CredentialMasterEntity> signIn(String primaryEmail,String passwd)
	{
		Criteria criteria = sessionFactory.openSession().createCriteria(Login_CredentialMasterEntity.class);
			     criteria.add(Restrictions.eq("primaryEmail",primaryEmail));
			     criteria.add(Restrictions.eq("passwd",passwd));
			     
			 
			//## returning full list(may be empty if user doest not exit)
	    	return criteria.list();
	}
	
	@Transactional
	public void signUp(String firstName,String middleName,String lastName,String primaryEmail,String secondaryEmail,String phNo,Date dob,String passwd,String confPasswd,String gender,String uniqueKey)
	{
		Login_UserDetails login_UserDetails=new Login_UserDetails();
		
		
						  login_UserDetails.setFirstname(firstName);
						  login_UserDetails.setMiddlename(middleName);
						  login_UserDetails.setLastname(lastName);
						  login_UserDetails.setPrimaryEmail(primaryEmail);
						  login_UserDetails.setSecondaryEmail(secondaryEmail);
						  login_UserDetails.setMobile(Integer.parseInt(phNo));
						  login_UserDetails.setDob(dob);
						  login_UserDetails.setGender(gender);
						  login_UserDetails.setUniquekey(uniqueKey);
						  
						  //## saving details for new user in "login_userdetails"
						  getHibernateTemplate().saveOrUpdate(login_UserDetails);
						  
						  
		Login_CredentialMasterEntity login_CredentialMasterEntity = new Login_CredentialMasterEntity();
						 
						  login_CredentialMasterEntity.setPasswd(passwd);
						  login_CredentialMasterEntity.setConfPasswd(confPasswd);
						  login_CredentialMasterEntity.setPrimaryEmail(primaryEmail);
						  login_CredentialMasterEntity.setUniquekey(uniqueKey);
						  login_CredentialMasterEntity.setSecurityQuestionSetflag(false);
						  
						  //## saving details for new user in "login_credentialmaster"
						  getHibernateTemplate().saveOrUpdate(login_CredentialMasterEntity);		  
						  
	}
	

}
