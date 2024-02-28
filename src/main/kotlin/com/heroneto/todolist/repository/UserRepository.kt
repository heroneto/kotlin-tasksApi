package com.heroneto.todolist.repository

import com.heroneto.todolist.model.User
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository()
interface UserRepository : MongoRepository<User, String> {
}