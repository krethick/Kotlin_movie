package dev.krethick.movies

import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional

//Here only most of the business class is implemented.
@Service
class MovieService {
    // We write database access methods
    @Autowired
    private lateinit var movieRespository: MovieRespository


    public fun allMovies(): List<Movie> {
        return movieRespository.findAll()
    }

    public fun singleMovie(id: ObjectId): Optional<Movie> {
        return movieRespository.findById(id)
    }

}

