package dev.Sarabjeet108.Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// this class uses the repository class,talks to the database, get the list of the movies and returns to the API layer
@Service
public class MovieService {
    //write database access
    //service class needs reference to the repository class
    //instead of intializing ourself, make the framework know we want the following class "MovieRepository" to be instatiated
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll(); //this method is defined in the mongo repository class. check movieRepository @Repository
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
