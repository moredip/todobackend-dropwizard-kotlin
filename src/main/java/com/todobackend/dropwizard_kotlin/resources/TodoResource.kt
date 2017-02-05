package com.todobackend.dropwizard_kotlin.resources

import com.todobackend.dropwizard_kotlin.api.Todo
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/todos")
@Produces(MediaType.APPLICATION_JSON)
class TodoResource{
    @GET
    fun getTodos():List<Todo>{
        return arrayListOf(
                Todo(id=1,title="todo first",completed=false,order=100),
                Todo(id=2,title="todo segundo",completed=true,order=200)
        )
    }
}