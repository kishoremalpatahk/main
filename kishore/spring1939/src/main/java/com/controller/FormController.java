package com.controller;

import java.text.ParseException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.beans.Form;
import com.service.FormService;

@Controller

public class FormController {
	@Autowired
	FormService formService;
	
	@RequestMapping("/")
	public ModelAndView login() {
		
		return new ModelAndView("login"); 
			}
	
	//requried to work 
	@RequestMapping("/refral")
	public ModelAndView refral(){
		return new ModelAndView("redirect:/form");
	}
	@RequestMapping("/form")
	public ModelAndView form(){
		return new ModelAndView("Form");
	}
	
	@RequestMapping("/rview")
	public ModelAndView getAllProduct() {
		List<Form> plist=formService.getAllData();
		return new ModelAndView("displayform","plist",plist); 
			
	}
	
		
	
	@RequestMapping(value="/addData", method=RequestMethod.GET)
	public ModelAndView addProduct(@RequestParam("name") String name,@RequestParam("lname") String lname,@RequestParam("cnno") String cnno,@RequestParam("mailid") String mailid, @RequestParam("date") String date,@RequestParam("city") String city) 
			throws ParseException {
		if(name!=null && lname!=null && cnno!=null && mailid!=null && date!=null&& city!=null)
		{
			  return new ModelAndView("redirect:/form");
		}
		else {
			 Form p=new Form(name, lname, cnno, mailid, date, city);
			if (formService.getAdddata(p)== 0)
			{
				  return new ModelAndView("redirect:/addData");
			}
			else{
				  return new ModelAndView("redirect:/form");
				
			}
		
		}	
	}
	


			
	
	
	

}
