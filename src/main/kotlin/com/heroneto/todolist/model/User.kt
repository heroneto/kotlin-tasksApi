package com.heroneto.todolist.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.aot.generate.Generated
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document("users")
data class User(
    @Id
    val id: String = UUID.randomUUID().toString(),
    val username: String,
    val password: String
)
