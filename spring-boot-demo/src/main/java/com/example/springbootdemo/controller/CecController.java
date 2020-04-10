package com.example.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springbootdemo.model.Cec;
import com.example.springbootdemo.service.CecService;

@Controller
public class CecController {

	  @Autowired
	    private CecService cecService;

	    @GetMapping("/showCecs")
	    public String findCes(Model model) {

	    	List<Cec> Cecs = (List<Cec>) cecService.findAll();

	        model.addAttribute("Cecs", Cecs);

	        return "showCecs";
	    }
	  
}
