package com.heroneto.todolist.controller

import com.heroneto.todolist.model.User
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

val user1 = object  {
    val id = "a144ba09-5be2-42ab-98a3-006564042eee"
    val username = "heronhideki"
    val password = "pass123"

    override fun toString() = "$id $username  $password"
}

val user2 = object  {
    val id = "6d2d41fe-566a-4e96-99a8-c6122121e4f6"
    val username = "heronhideki2"
    val password = "pass1234"

    override fun toString() = "$id $username  $password"
}

val usersMock = arrayOf(user1, user2)

@RestController
@RequestMapping("users")
class UserController() {

    @GetMapping()
    fun get() = usersMock

    @PostMapping()
    fun create(@RequestBody user: User) : User {
        println(user)
        return user
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) : String {
        println(id)
        return "user " + id + " deleted"
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: String, @RequestBody user: User) : String{
        println(id)
        println(user)
        return "user " + id + " updated"
    }


}