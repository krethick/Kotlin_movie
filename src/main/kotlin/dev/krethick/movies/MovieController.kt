package dev.krethick.movies
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// Controller = a controller is a key component of the MVC-(model view controller) architecture that handles HTTP requests and
// defines the behavior and operations for specific endpoints or URLs.

@RestController
//The @RequestMapping annotation is used at the method level to map specific HTTP methods and their corresponding endpoint paths.
@RequestMapping("/api/v1/movies")
class MovieController {
    @GetMapping
    fun allMovies(): ResponseEntity<String> {
        return ResponseEntity("All Movies!", HttpStatus.OK);
    }
}

// ResponseEntity<String> is a generic type
// HttpStatus.OK means 200

