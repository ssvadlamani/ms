package com.pennywise.movieinfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pennywise.movieinfoservice.entity.Movie;

@RestController
@RequestMapping("/movie")
public class MovieInfoResource {
	
	@RequestMapping("/{movieId}")
	public Movie getCatelog(@PathVariable("movieId") String movieId){
		return new Movie(movieId,"test  name");
	}


}
