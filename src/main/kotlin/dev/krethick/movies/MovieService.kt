package dev.krethick.movies

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class MovieService {
    //We write database access methods
    @Autowired
    private var movieRepository: MovieRepository? = null
    fun allMovies(): List<Movie> {
        return movieRepository.findAll();
    }

}