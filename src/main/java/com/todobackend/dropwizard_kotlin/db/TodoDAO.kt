package com.todobackend.dropwizard_kotlin.db

import com.todobackend.dropwizard_kotlin.core.Todo
import org.skife.jdbi.v2.sqlobject.Bind
import org.skife.jdbi.v2.sqlobject.SqlQuery
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper

@RegisterMapper(TodoMapper::class)
interface TodoDAO {
    @SqlQuery("SELECT * FROM todos WHERE id = :id LIMIT 1")
    fun findById(@Bind("id") id: Int?): Todo

    @SqlQuery("SELECT * FROM todos")
    fun findAll(): List<Todo>
}
