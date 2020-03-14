package com.vin.restapi.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vin.restapi.entity.MakeModel;
import com.vin.restapi.entity.VINInfo;
import com.vin.restapi.entity.VariableValue;
import com.vin.restapi.service.VinService;

@RestController
@RequestMapping(value = "/vinInfo")
public class VinController {

	@Autowired
	VinService service;

	
	@GetMapping(value = "/getVin/{vin}")
	public ResponseEntity<Collection<VariableValue>> getVINById(@PathVariable(name = "vin") String vin) {
		
		ResponseEntity<String> result = 
		 service.getVinDetailsByVin(vin);
		if (result.getStatusCodeValue() == 200)
		{
		Collection<VariableValue> valuesList = service.deriveVinInfo(result);
		return new ResponseEntity<Collection<VariableValue>>(valuesList,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Collection<VariableValue>>(new ArrayList<VariableValue>(),HttpStatus.BAD_REQUEST);
		}
		
		//System.out.println("at controller " + vinInfo.getResults().toString());
	}
	
	/*
	 * @GetMapping(value = "/getMakeModel/{vin}") public ResponseEntity<MakeModel>
	 * getMakeModel(@PathVariable(name = "vin") String vin) { VINInfo vinInfo =
	 * service.deriveVinInfo(vin);
	 * 
	 * }
	 */	
}
