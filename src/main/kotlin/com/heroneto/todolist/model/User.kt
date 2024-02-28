package com.heroneto.todolist.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document("users")
data class User(
    @Id
    val id: String,
    val username: String,
    val password: String
)
