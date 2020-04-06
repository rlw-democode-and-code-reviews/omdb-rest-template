# Practice using RestTemplate to query other APIs 
omdb-rest-template

Use this repository to practice accessing an external RESTful API.

## Resources
- [OMDb API](http://www.omdbapi.com/)
    - Register for an API Key
    - Review the api in preparation for the exercise
- [Spring Docs - Consuming a RESTful Web Service](https://spring.io/guides/gs/consuming-rest/)

## To Do...

1. Fork and clone this repository
    - This repo includes model classes that represent search, and detail objects that can be returned by OMDb
1. Note the `@Bean` declaration of RestTemplate in OmdbRestTemplateApplication
    - What is this for?
1. Add a controller to the application that will utilize the the apis provided by OMDb.
    - Search for movies - `SearchResults results = restTemplate.getForObject("url", SearchResults.class)`
    - Display a movie by IMDB ID - `OmdbMovie movie = restTemplate.getForObject("url", OmdbMovie.class)`
    - Add your own api ideas
1. Optional: Use google to find another public rest api, and add a controller to access it.
1. Be sure to commit your code to your forked repository for future reference (hint, hint, hint)


