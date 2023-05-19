package dev.krethick.movies
import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

// Controller = a controller is a key component of the MVC-(model view controller) architecture that handles HTTP requests and
// defines the behavior and operations for specific endpoints or URLs.

@RestController
//The @RequestMapping annotation is used at the method level to map specific HTTP methods and their corresponding endpoint paths.
@RequestMapping("/api/v1/movies")


class MovieController {

    //We'll be requiring the reference of the service class
    @Autowired

    //Service class = delegating the task of getting the details from the database
    private lateinit var movieService: MovieService
    @GetMapping
    //Api layer
    //Getting the request from the user and Returning response
    fun getAllMovies(): ResponseEntity<List<Movie>> {
        return ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    fun getSingleMovie(@PathVariable imdbId:String): ResponseEntity<Optional<Movie>> {
        return ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}

// ResponseEntity<String> is a generic type
// HttpStatus.OK means 200
// Invoke-WebRequest -Uri "http://localhost:8080/api/v1/movies" used it in windows powershell to find out the status code

