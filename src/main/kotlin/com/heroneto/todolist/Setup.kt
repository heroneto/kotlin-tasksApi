package com.heroneto.todolist

import com.mongodb.MongoException
import com.mongodb.kotlin.client.coroutine.MongoClient
import com.mongodb.kotlin.client.coroutine.MongoDatabase
import org.bson.BsonInt64
import org.bson.Document

suspend fun setupConnection(): MongoDatabase? {
    val databaseName: String = "todolist-users"
    val connectionEnvVariable: String = "mongodb://root:MongoDB2019!@127.0.0.1:27017/"
    val client = MongoClient.create(connectionString = connectionEnvVariable)
    val database = client.getDatabase(databaseName = databaseName)

    return try {
        // Send a ping to confirm a successful connection
        val command = Document("ping", BsonInt64(1))
        database.runCommand(command)
        println("Pinged your deployment. You successfully connected to MongoDB!")
        database
    } catch (me: MongoException) {
        System.err.println(me)
        null
    }
}
