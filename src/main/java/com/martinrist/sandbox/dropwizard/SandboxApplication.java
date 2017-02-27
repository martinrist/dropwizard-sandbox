package com.martinrist.sandbox.dropwizard;

import com.martinrist.sandbox.dropwizard.health.TemplateHealthCheck;
import com.martinrist.sandbox.dropwizard.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SandboxApplication extends Application<SandboxConfiguration> {

    private static final Logger LOG = LoggerFactory.getLogger(SandboxApplication.class);

    public static void main(final String[] args) throws Exception {
        new SandboxApplication().run(args);
    }

    @Override
    public String getName() {
        return "Sandbox";
    }

    @Override
    public void initialize(final Bootstrap<SandboxConfiguration> bootstrap) {

    }

    @Override
    public void run(final SandboxConfiguration configuration,
                    final Environment environment) {

        LOG.info("Registering HelloWorldResource");
        final HelloWorldResource helloWorldResource = new HelloWorldResource(
                configuration.getTemplate(), configuration.getDefaultName());
        environment.jersey().register(helloWorldResource);

        LOG.info("Registering TemplateHealthCheck");
        final TemplateHealthCheck templateHealthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", templateHealthCheck);

    }

}