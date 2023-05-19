package dev.krethick.movies

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

// Repository are of type interface
// MongoRepository is of the type generic

@Repository
public interface MovieRespository : MongoRepository<Movie,ObjectId>
{
    fun findMovieByImdbId(imdbId: String): Optional<Movie>

}


/*Why Repository are of type interface?

  a repository is commonly used to abstract the data access layer
  and provide a standardized way to interact
  with persistent data sources such as databases.

 */
