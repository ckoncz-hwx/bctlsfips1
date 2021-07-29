package com.ck.bctlsfips1;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SampleClient {

	private RestTemplate restTemplate;

	public SampleClient(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	String getData() {
//		return restTemplate.getForObject(endpoint, String.class);
		return restTemplate.getForObject("https://csabakoncz.github.io/ftg-data/db/link/1XFXBTv0bm.yaml", String.class);
	}
}