package com.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class DefaultController {

	@RequestMapping(value="/default.s4",method=RequestMethod.GET)
	public ModelAndView defaultHome(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		System.out.println("hello");
		return new ModelAndView("/default");
	}
	
}
