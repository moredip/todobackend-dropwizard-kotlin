package com.todobackend.dropwizard-kotlin;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class todobackendApplication extends Application<todobackendConfiguration> {

    public static void main(final String[] args) throws Exception {
        new todobackendApplication().run(args);
    }

    @Override
    public String getName() {
        return "todobackend";
    }

    @Override
    public void initialize(final Bootstrap<todobackendConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final todobackendConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
