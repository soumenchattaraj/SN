package com.web.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.commonLibrary.Login_UniqueKeyGenerator;
import com.web.services.Login_Service;


@Controller
public class Login_LoginController {
	
	
	@Autowired
	Login_Service login_Service;
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView loginHome(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		//## SN. home page.
		return new ModelAndView("/");
	}
	
	@RequestMapping(value="/signIn.s4",method=RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		String primaryEmail = request.getParameter("primaryEmail");
		String passwd = request.getParameter("passwd");
		
		if(primaryEmail.equalsIgnoreCase("") && passwd.equalsIgnoreCase("passwd"))
		{
			//## login successful
			return new ModelAndView("/");
		}
		else
		{
			//## login failed
			return new ModelAndView("/");
		}
		
		
	}
	
	@RequestMapping(value="/signUp.s4",method=RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		Login_UniqueKeyGenerator uniqueKeyGenerator = new Login_UniqueKeyGenerator();
		
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String secondName = request.getParameter("secondName");
		String primaryEmail = request.getParameter("primaryEmail");
		String secondaryEmail = request.getParameter("secondaryEmail");
		String phNumber =  request.getParameter("phNumber");
		String userName = request.getParameter("userName");
		String passwd = request.getParameter("passwd");
		String confPasswd=request.getParameter("confPasswd");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		
		DateFormat df = new SimpleDateFormat();
	    Date dat_dob=null;
		try 
		{
			dat_dob = df.parse(dob);
		} catch (ParseException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		if(primaryEmail.equalsIgnoreCase(""))
		{
			//## login failed
			//## user already registered
			return new ModelAndView("/");
		}
		else
		{
			//## user created 
			//## user can login(page to be redirected with success message and a url for login)
			String generatedUniqueKey = uniqueKeyGenerator.uniqueKeyGeneratorFunction(dob,phNumber);
			login_Service.signUp(firstName, middleName,secondName,primaryEmail,secondaryEmail,phNumber,dat_dob,passwd,confPasswd,gender,generatedUniqueKey);
			
			return new ModelAndView("/");
		}
		
	}

}
