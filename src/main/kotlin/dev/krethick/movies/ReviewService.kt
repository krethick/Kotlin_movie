package dev.krethick.movies

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.Update
import org.springframework.data.mongodb.core.update
import org.springframework.stereotype.Service


@Service
class ReviewService {

    //The “lateinit” keyword in Kotlin as the name suggests is used to
    //declare those variables that are guaranteed to be initialized in the future.
    @Autowired
    private lateinit var reviewRepository: ReviewRepository

    // Use a template
    @Autowired
    private lateinit var mongoTemplate: MongoTemplate
    fun createReview(reviewBody: String, imdbId: String): Review {
        val review = reviewRepository.insert(Review(reviewBody))

        mongoTemplate.update(Movie::class.java)
                .matching(Query.query(Criteria.where("imdbId").`is`(imdbId)))
                .apply(Update().push("reviewIds").value(review))
                .first();



        return review;
    }

}