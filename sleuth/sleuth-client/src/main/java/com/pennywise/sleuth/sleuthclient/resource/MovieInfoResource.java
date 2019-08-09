package com.pennywise.sleuth.sleuthclient.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/hello")
public class MovieInfoResource {
	
	private static Logger log= LoggerFactory.getLogger(MovieInfoResource.class);
	
	@Autowired
	private RestTemplate restTemplate; 
	
	@RequestMapping("/client")
	public String getCatelog(){
		log.info("before calling the server");
		String s= restTemplate.getForObject("http://localhost:8081/rest/hello/server",String.class);
		log.info("after calling the server");
		return s;
	}
}
