package com.vin.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/display")
public class DisplayController {

	
	@Autowired
	VinController vinController;
	
     @RequestMapping("/vinlist/{vin}")
	 public String getdisplay(@PathVariable(name = "vin") String vin,Model model)
	 {
    	 
    	 model.addAttribute("vininfo", vinController.getVINById(vin));
		 return "display";
		 
		 
		 
	 }
	 
	 
	
	
	
}
