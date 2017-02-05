package com.todobackend.dropwizard_kotlin

import com.todobackend.dropwizard_kotlin.resources.TodoResource
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class theApplication : Application<theConfiguration>() {

    override fun getName(): String = "todobackend"

    override fun initialize(bootstrap: Bootstrap<theConfiguration>?) {
        // TODO: application initialization
    }

    override fun run(configuration: theConfiguration,
                     environment: Environment) {
        val todoResource = TodoResource()
        environment.jersey().register(todoResource)
    }
}