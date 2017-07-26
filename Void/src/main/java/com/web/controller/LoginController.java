package com.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView loginHome(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		return new ModelAndView("/");
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		return new ModelAndView("/");
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		return new ModelAndView("/");
	}

}
