package com.todobackend.dropwizard_kotlin.resources

import com.todobackend.dropwizard_kotlin.api.TodoRepresentation
import com.todobackend.dropwizard_kotlin.core.Todo
import com.todobackend.dropwizard_kotlin.db.TodoDAO
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/todos")
@Produces(MediaType.APPLICATION_JSON)
class TodoResource(val todoDao: TodoDAO) {
    @GET
    fun getAll(): List<TodoRepresentation> {
        return todoDao.findAll().map{TodoRepresentation.fromDomain(it)}
    }

    @GET
    @Path("{id}")
    fun getById(@PathParam("id") id: Int): TodoRepresentation {
        return TodoRepresentation(id = 1, title = "todo first", completed = false, order = 100)
    }
}