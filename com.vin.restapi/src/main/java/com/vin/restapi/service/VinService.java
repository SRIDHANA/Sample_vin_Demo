package com.vin.restapi.service;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.vin.restapi.entity.VINInfo;
import com.vin.restapi.entity.VariableValue;

@Service
public class VinService {

	public ResponseEntity<String> getVinDetailsByVin(String vin) {

		final String uri = "https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinExtended/" + vin + "?format=json";
		RestTemplate restTemplate = new RestTemplate();

		return restTemplate.getForEntity(uri, String.class);
        
	}

	public Collection<VariableValue> deriveVinInfo(ResponseEntity<String> result) {
		
		
		VINInfo vinInfo = new Gson().fromJson(result.getBody(), new TypeToken<VINInfo>() {}.getType());

		return vinInfo.getResults().stream()
				.filter(e-> (e.getValue())!= null)
				.collect(Collectors.toList());
		
	
	} 
	
	/*
	 * public MakeModel getMakeModel(String vin) { VINInfo vinInfo = new
	 * Gson().fromJson(this.getVinDetailsByVin(vin).getBody(), new
	 * TypeToken<VINInfo>() {}.getType()); vinInfo.getResults().filter(e->e.)
	 * 
	 * }
	 */

}
