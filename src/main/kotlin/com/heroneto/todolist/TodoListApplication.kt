package com.heroneto.todolist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoListApplication


suspend fun main(args: Array<String>) {
	runApplication<TodoListApplication>(*args)
}
