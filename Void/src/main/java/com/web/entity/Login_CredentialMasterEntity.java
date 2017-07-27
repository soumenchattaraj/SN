package com.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the login_credentialmaster database table.
 * 
 */
@Entity
@Table(name="login_credentialmaster",schema="login")
public class Login_CredentialMasterEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="credentialmaster_pk")
	private Integer credentialmasterPk;

	/*@Column(name="username")
	private String username;*/
	
	@Column(name="passwd")
	private String passwd;
	
	@Column(name="conf_passwd")
	private String confPasswd;

	@Column(name="primary_email")
	private String primaryEmail;

	@Column(name="security_question_setflag")
	private Boolean securityQuestionSetflag;

	@Column(name="uniquekey")
	private String uniquekey;
	
	//## getter and setters

	public Integer getCredentialmasterPk() {
		return this.credentialmasterPk;
	}

	public void setCredentialmasterPk(Integer credentialmasterPk) {
		this.credentialmasterPk = credentialmasterPk;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getPrimaryEmail() {
		return this.primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public Boolean getSecurityQuestionSetflag() {
		return this.securityQuestionSetflag;
	}

	public void setSecurityQuestionSetflag(Boolean securityQuestionSetflag) {
		this.securityQuestionSetflag = securityQuestionSetflag;
	}

	public String getUniquekey() {
		return this.uniquekey;
	}

	public void setUniquekey(String uniquekey) {
		this.uniquekey = uniquekey;
	}

	public String getConfPasswd() {
		return confPasswd;
	}

	public void setConfPasswd(String confPasswd) {
		this.confPasswd = confPasswd;
	}

	/*public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}*/



}
