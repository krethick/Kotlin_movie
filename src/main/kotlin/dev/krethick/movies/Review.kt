package dev.krethick.movies

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection =  "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review (

    @Id
    private var id: ObjectId = ObjectId(),
    private var body: String = "",


)