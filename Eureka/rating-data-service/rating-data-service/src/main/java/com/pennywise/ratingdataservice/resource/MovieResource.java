package com.pennywise.ratingdataservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pennywise.ratingdataservice.entiry.Movie;
import com.pennywise.ratingdataservice.entiry.Rating;

@RestController
@RequestMapping("/rating")
public class MovieResource {


    @RequestMapping("/{movieId}")
    public Rating getMovieInfo(@PathVariable("movieId") String movieId) {
//    	MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" +  apiKey, MovieSummary.class);
        return new Rating(movieId,4);
    }
    }