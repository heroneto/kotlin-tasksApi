package com.heroneto.todolist.controller


import com.heroneto.todolist.service.UserService
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
    fun get() = userService.getAllUsers()

//    @PostMapping()
//    fun create(@RequestBody user: User) : User {
//        println(user)
//        return user
//    }
//
//    @DeleteMapping("/{id}")
//    fun delete(@PathVariable id: String) : String {
//        println(id)
//        return "user " + id + " deleted"
//    }
//
//    @PutMapping("/{id}")
//    fun update(@PathVariable id: String, @RequestBody user: User) : String{
//        println(id)
//        println(user)
//        return "user " + id + " updated"
//    }


}