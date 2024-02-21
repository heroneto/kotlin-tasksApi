package com.heroneto.todolist.repository

import com.heroneto.todolist.model.Task
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface TasksRepository {

    fun findById(id: String) : Optional<Task>
}