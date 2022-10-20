package com.hcl.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class displayDate {

	@RequestMapping("/date")
	public ModelAndView displayDate() {
		ModelAndView mav=new ModelAndView();
		String msgTxt="Hello,Today's date:"+new Date();
		             mav.addObject("msg",msgTxt);
		             mav.setViewName("display");
		return mav;
		
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeMsg() {
		ModelAndView mav=new ModelAndView();
		            mav.addObject("msg","welcome to veera-tech");
		             mav.setViewName("display");
		return mav;
		
	}
}
