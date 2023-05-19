package dev.krethick.movies

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

// Import MongoRepository
@Repository
interface ReviewRepository : MongoRepository<Review, ObjectId> {

}