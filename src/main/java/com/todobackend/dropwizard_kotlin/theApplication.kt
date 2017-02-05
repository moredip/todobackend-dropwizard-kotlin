package com.todobackend.dropwizard_kotlin

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
        // TODO: implement application
    }
}