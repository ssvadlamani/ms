package com.pennywise.sleuth.sleuthserver.resource;

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
	
	@RequestMapping("/server")
	public String getCatelog(){
		log.info("MovieInfoResource   server");
		return "hello World";
	}


}
