package dev.krethick.movies

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

// Import the Movie class
import dev.krethick.movies.Movie


@Service
class MovieService {
    // We write database access methods
    @Autowired
    private var movieRespository: MovieRespository? = null

    fun allMovies(): List<Movie> {
        return movieRespository?.findAll() ?: emptyList()
    }
}
