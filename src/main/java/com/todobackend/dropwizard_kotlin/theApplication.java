package com.todobackend.dropwizard_kotlin;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class theApplication extends Application<theConfiguration> {

    public static void main(final String[] args) throws Exception {
        new theApplication().run(args);
    }

    @Override
    public String getName() {
        return "todobackend";
    }

    @Override
    public void initialize(final Bootstrap<theConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final theConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
