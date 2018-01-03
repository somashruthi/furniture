package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daoimpl.UserDAOImpl;
import com.domain.User;

@Controller
public class indexController
{

	@Autowired
	UserDAOImpl userDAOImpl;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/gotoRegister", method=RequestMethod.GET)
	public ModelAndView gotoRegister()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("user",new User());
		mv.setViewName("register");
		return mv;
	}

	
	@RequestMapping(value="/saveRegister", method=RequestMethod.POST)
	public ModelAndView saveRegister(@ModelAttribute ("user")User user,BindingResult result)
	{
		ModelAndView mav=new ModelAndView();
		
	if(result.hasErrors())
	{
		mav.setViewName("register");
	}
		
	else
	{
		user.setRole("ROLE USER");
		userDAOImpl.addUser(user);
		mav.setViewName("index");
	}
		return mav;
		
	} 
	

}
