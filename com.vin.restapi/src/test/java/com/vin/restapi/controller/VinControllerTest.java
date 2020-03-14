package com.vin.restapi.controller;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest

public class VinControllerTest {

	@Test
	public void responseBodyError() throws Exception {

		RestTemplate restTemplate = new RestTemplate();

		URI url = new URI("http://localhost:" + 8080 + "/vinInfo/getVin/" + "XXHFGHG");
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
	}

	@Test
	public void attributes() {

		RestTemplate restTemplate = new RestTemplate();
		URI url;
		try {
			url = new URI("http://localhost:" + 8080 + "/vinInfo/getVin/" + "JH4TB2H26CC000000");
			ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
			assertEquals(HttpStatus.OK, response.getStatusCode());

		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
