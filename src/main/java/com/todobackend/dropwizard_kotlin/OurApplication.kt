package com.todobackend.dropwizard_kotlin

import com.todobackend.dropwizard_kotlin.db.TodoDAO
import com.todobackend.dropwizard_kotlin.resources.TodoResource
import io.dropwizard.Application
import io.dropwizard.jdbi.DBIFactory
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class OurApplication : Application<OurConfiguration>() {
    override fun getName(): String = "todobackend"

    override fun initialize(bootstrap: Bootstrap<OurConfiguration>?) {
        // TODO: application initialization
    }

    override fun run(config: OurConfiguration,
                     environment: Environment) {
        val factory = DBIFactory()
        val jdbi = factory.build(environment, config.database(), "postgresql")
        val todoDao = jdbi.onDemand(TodoDAO::class.java)

        environment.jersey().register(TodoResource(todoDao))
    }
}