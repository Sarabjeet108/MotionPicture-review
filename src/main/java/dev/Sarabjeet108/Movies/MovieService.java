package dev.Sarabjeet108.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
