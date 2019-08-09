package com.pennywise.moviecatelogservice.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.pennywise.moviecatelogservice.entity.CatelogItem;
import com.pennywise.moviecatelogservice.entity.Movie;
import com.pennywise.moviecatelogservice.entity.Rating;

@RestController
@RequestMapping("/catelog")
public class MovieCatelogResource {
	
	@Autowired
	private RestTemplate restTemplate; 
	@Autowired
	private WebClient.Builder webClientbuilder; 
	
	
	@RequestMapping("/getCatelog")
	public List<CatelogItem> getCatelog(){
		
		WebClient.Builder builder= WebClient.builder();
		
//		Movie m= restTemplate.getForObject("http://localhost:8081/movie/foo", Movie.class);
		
		List<Rating> ratings = Arrays.asList(
				new Rating("123",4),
				new Rating("12323",1),
				new Rating("11223",3),
				new Rating("12443",2)
				);
		
		
//		Movie movie = restTemplate.getForObject("http://localhost:8081/movie/"+rating.getMovieId(), Movie.class);
//		return new CatelogItem(movie.getName(), "test desc ", rating.getRating())
		
		
		
		return ratings.stream().map(rating -> { 
			Movie movie = restTemplate.getForObject("http://MOVIE-INFO/movie/gggg",Movie.class);
//			Movie movie = webClientbuilder.build().get().uri("http://MOVIE-INFO/movie/gggg").retrieve().bodyToMono(Movie.class).block();
			
			return new CatelogItem(movie.getName(), "test desc ", rating.getRating());
				}).collect(Collectors.toList());
		
//		return Collections.singletonList(new CatelogItem("Bhahubali", "test", 4));
		
	}
	
	@RequestMapping("/mm")
	public String getCatelog1(){
		List<Rating> ratings = Arrays.asList(
				new Rating("123",4),
				new Rating("12323",1),
				new Rating("11223",3),
				new Rating("12443",2)
				);
		
		return "kkkkkkkkkkkkkkkkkkkkkkkkkk";
	}

}
