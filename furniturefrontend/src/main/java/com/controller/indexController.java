package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daoimpl.UserDaoImpl;
import com.domain.User1;

@Controller
public class indexController
{

	@Autowired
	UserDaoImpl userDaoImpl;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/gotoRegister", method=RequestMethod.GET)
	public ModelAndView gotoRegister()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("user",new User1());
		mv.setViewName("register");
		return mv;
	}

	
	@RequestMapping(value="/saveRegister", method=RequestMethod.POST)
	public ModelAndView saveRegister(@ModelAttribute("user1")User1 user1)
	{
		ModelAndView mav=new ModelAndView();
		user1.setRole("ROLE USER");
		userDaoImpl.insertUser(user1);
		mav.setViewName("index");
		return mav;
		
	} 
	

}
