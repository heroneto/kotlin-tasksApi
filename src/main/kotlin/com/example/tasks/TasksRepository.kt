package com.example.tasks

import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface TasksRepository {

    fun findById(id: String) : Optional<Tasks>
}