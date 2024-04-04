package com.heroneto.todolist.service

import com.heroneto.todolist.model.User
import com.heroneto.todolist.repository.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.util.UUID

@Service()
class UserService(
    private val userRepository: UserRepository
) {
    fun getAllUsers(): List<User> = userRepository.findAll()

    fun createUser(newUser: User): User {
        val myUuid = UUID.randomUUID()
        val myUuidAsString = myUuid.toString()
        return userRepository.save(newUser)
    }

}