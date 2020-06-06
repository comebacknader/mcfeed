package com.cyberdyme.mcfeed.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class StockRestController {
	
	public StockRestController() {}
	
	@GetMapping("/stocks/{ticker}")
	public ResponseEntity<String> getStock(@PathVariable String ticker) {
		 RestTemplate restTemplate = new RestTemplate();
		 String fooResourceUrl = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=IBM&interval=5min&apikey=demo";
		 ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
		return response;
	}

}
