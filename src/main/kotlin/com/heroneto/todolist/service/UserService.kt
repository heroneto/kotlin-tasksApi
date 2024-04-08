package com.heroneto.todolist.service

import com.heroneto.todolist.model.User
import com.heroneto.todolist.repository.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.util.*

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

    fun deleteUser(id: String) {
        userRepository.findById(id).map{
            userRepository.delete(it)
        }.orElseThrow { throw RuntimeException("user not found $id") }
    }

    fun updateUser(id: String, user: User): Optional<User>? {
        val userFinded = userRepository.findById(id)
        if (userFinded.isEmpty){
            return userFinded
            //TODO retornar um erro 404
        }

        return userFinded.map {
            val userToUpdate = it.copy(
                username = user.username,
                password = it.password,
                id = it.id
            )
            userRepository.save(userToUpdate)
        }
    }
}