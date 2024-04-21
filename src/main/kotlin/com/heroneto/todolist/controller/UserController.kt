package com.heroneto.todolist.controller


import com.heroneto.todolist.model.User
import com.heroneto.todolist.service.UserService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("users")
class UserController(private val userService: UserService) {

    @GetMapping()
    fun get() : List<UserResponse> =
        userService.getAllUsers().map { it.toResponse() }

    private fun User.toResponse() : UserResponse = UserResponse(username = this.username, id = this.id)

    @PostMapping()
    fun create(@RequestBody user: User) = userService.createUser(user)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) = userService.deleteUser(id)

    @PutMapping("/{id}") //TODO remover prop password do User
    fun update(@PathVariable id: String, @RequestBody user: User) = userService.updateUser(id, user)

    //TODO adicionar rotas de troca de senha
}