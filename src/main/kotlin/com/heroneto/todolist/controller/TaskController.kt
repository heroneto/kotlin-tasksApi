package com.heroneto.todolist.controller

import com.heroneto.todolist.model.Task
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
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

    @GetMapping()
    fun get() = tasksMock

    @PostMapping()
    fun create(@RequestBody task: Task) : Task {
        println(task)
        return task
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) : String {
        println(id)
        return "task " + id + " deleted"
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: String, @RequestBody task: Task) : String{
        println(id)
        println(task)
        return "task " + id + " updated"
    }


}