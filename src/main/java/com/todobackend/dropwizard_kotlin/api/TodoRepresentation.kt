package com.todobackend.dropwizard_kotlin.api

import com.todobackend.dropwizard_kotlin.core.Todo

data class TodoRepresentation(val id:Int, val title:String, val completed:Boolean, val order:Int) {
    companion object Factory {
        fun fromDomain(todo: Todo): TodoRepresentation {
            return TodoRepresentation(id=todo.id,title=todo.title,completed = todo.completed, order=todo.order)
        }
    }
}
