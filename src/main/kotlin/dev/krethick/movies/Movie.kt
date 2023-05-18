package dev.krethick.movies
import org.bson.types.ObjectId // ObjectId class is part of the MongoDB Java Driver, which is not a built-in class in Kotlin.
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


//We need to annotate as document
@Document(collection = "movies")
@Data    // comes from lombok header file (Use getter,setter and string methods)
@AllArgsConstructor   // Takes all private field as argument
@NoArgsConstructor // Takes no arguments/parameters
public class Movie {
    //Also annotate the id field
    @Id
    // The ? after ObjectId indicates that the id variable can hold an ObjectId value or be null.
    private var id: ObjectId? = null
    private var imbId: String? = null
    private var title: String? = null
    private var releaseDate: String? = null
    private var trailerLink: String? = null
    private var poster: String? = null
    private var genres: List<String>? = null
    private var backdrops: List<String>? = null

}