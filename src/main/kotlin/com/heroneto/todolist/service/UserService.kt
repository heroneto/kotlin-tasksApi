package com.heroneto.todolist.service

import com.heroneto.todolist.model.User
import com.heroneto.todolist.repository.UserRepository
import org.springframework.stereotype.Service

@Service()
class UserService(
    private val userRepository: UserRepository
) {
    fun getAllUsers(): List<User> = userRepository.findAll()
}