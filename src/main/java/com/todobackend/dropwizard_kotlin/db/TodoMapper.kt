package com.todobackend.dropwizard_kotlin.db

import com.todobackend.dropwizard_kotlin.core.Todo
import org.skife.jdbi.v2.StatementContext
import org.skife.jdbi.v2.tweak.ResultSetMapper
import java.sql.ResultSet

class TodoMapper : ResultSetMapper<Todo> {
    override fun map(i: Int, rs: ResultSet, statementContext: StatementContext): Todo {
        return Todo(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getBoolean("completed"),
                rs.getInt("item_order"))
    }
}