package com.example.tasks

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

val task1 = object  {
    val title = "Minha tarefa 1"
    val done = false

    override fun toString() = "$title  $done"
}

val task2 = object  {
    val title = "Minha tarefa 2"
    val done = false

    override fun toString() = "$title  $done"
}

val tasksMock = arrayOf(task1, task2)

@RestController
@RequestMapping("tasks")
class TasksController() {

    @GetMapping
    fun get() = tasksMock
}