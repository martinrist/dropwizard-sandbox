package com.martinrist.sandbox.dropwizard.cli;

import com.martinrist.sandbox.dropwizard.config.HelloWorldConfiguration;
import com.martinrist.sandbox.dropwizard.config.SandboxConfiguration;
import io.dropwizard.cli.ConfiguredCommand;
import io.dropwizard.setup.Bootstrap;
import net.sourceforge.argparse4j.inf.Namespace;

public class ConfiguredHelloWorldCommand extends ConfiguredCommand<SandboxConfiguration> {

    public ConfiguredHelloWorldCommand() {
        super("greet", "greets the user using the current application configuration");
    }

    @Override
    protected void run(Bootstrap<SandboxConfiguration> bootstrap, Namespace namespace,
            SandboxConfiguration configuration) throws Exception {
        final HelloWorldConfiguration helloWorldConfig = configuration.getHelloWorldConfig();
        System.out.format(helloWorldConfig.getTemplate(), helloWorldConfig.getDefaultName());
    }
}
