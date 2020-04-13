package com.example.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.springbootdemo.model.Cec;
import com.example.springbootdemo.service.CecService;
import com.example.springbootdemo.service.ContactService;

@Controller
public class CecController {

	@Autowired
	private CecService cecService;
	
	@Autowired
	private ContactService contactService; 

	
	@RequestMapping("/showCec/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") String id) {
		Long cecId = Long.valueOf(id);
		ModelAndView mav = new ModelAndView("editCec");
		Cec cec = cecService.findCecById(cecId);
		mav.addObject("cec", cec);
		return mav;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("cec") Cec cec) {
		contactService.submitContact(cec);
		return "redirect:/";
	}

}
