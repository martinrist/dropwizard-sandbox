package com.martinrist.sandbox.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SandboxApplication extends Application<SandboxConfiguration> {

    public static void main(final String[] args) throws Exception {
        new SandboxApplication().run(args);
    }

    @Override
    public String getName() {
        return "Sandbox";
    }

    @Override
    public void initialize(final Bootstrap<SandboxConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final SandboxConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
