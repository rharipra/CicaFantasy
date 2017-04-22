package com.ravila.cica.controllers;

import javax.servlet.http.HttpServlet;

import org.apache.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController    {

	@RequestMapping("/login")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

//	@RequestMapping("/roleCheck")
//	public ModelAndView loginPage()	 {
//		HttpRequest req = HttpRequest();
//		if (req.getParams()	== "admin")	
//		{
//			return "adminPage";
//		} else 
//			return "userPage";
//	}

}
