package com.galvanize.controllers;

import com.galvanize.model.OmdbMovie;
import com.galvanize.model.SearchResults;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private static String OMDB_KEY = "apikey=1bc91bf6";
    private static String BASE_URL =  "http://www.omdbapi.com/?"+OMDB_KEY;
    private static String SEARCH_BASE = BASE_URL+"&type=movie&plot=full&s=";
    private static String IMDBID_BASE = BASE_URL+"&plot=full&i=";

    RestTemplate restTemplate;

    public MovieController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public SearchResults searchForMovie(@RequestParam String search){
        return restTemplate.getForObject(SEARCH_BASE+search, SearchResults.class);
    }

    @GetMapping("/{imdbId}")
    public OmdbMovie getMovie(@PathVariable String imdbId){
        return restTemplate.getForObject(IMDBID_BASE+imdbId, OmdbMovie.class);
    }
}
