package dev.krethick.movies

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/reviews")
class ReviewController {

    @Autowired
    private lateinit var reviewService: ReviewService

    @PostMapping
    fun createReview(@RequestBody payload: Map<String, String>): ResponseEntity<Map<String, Any>> {
        val reviewBody = payload["reviewBody"]
        val imdbId = payload["imdbId"]

        return if (reviewBody != null && imdbId != null) {
            val review = reviewService.createReview(reviewBody, imdbId)
            val responseBody = mapOf(
                    "review" to review,
                    "payload" to payload
            )
            ResponseEntity.ok(responseBody)
        } else {
            ResponseEntity.badRequest().build()
        }
    }
}
