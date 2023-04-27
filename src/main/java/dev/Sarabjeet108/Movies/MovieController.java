package dev.Sarabjeet108.Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//use:- getting a request from the user and returning a response, that's it!
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService; //using service class and delegating the task of fetching all the movies of the databse and giving it back to the API layer.
    //calls the allMovies() method inside the service class, gets the list of the movies and return them with http status OK
    //it doesn't know what going inside the sevice class
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{ImdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String ImdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(ImdbId), HttpStatus.OK);
    }


}

//pull data from the database -- using service and a repository class


