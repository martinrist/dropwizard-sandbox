package com.martinrist.sandbox.dropwizard.cli;

import io.dropwizard.cli.Command;
import io.dropwizard.setup.Bootstrap;
import net.sourceforge.argparse4j.inf.Namespace;
import net.sourceforge.argparse4j.inf.Subparser;

public class HelloWorldCommand extends Command {

    public HelloWorldCommand() {
        super("hello", "prints a simple greeting");
    }

    @Override
    public void configure(Subparser subparser) {
        subparser.addArgument("-u", "--user")
                .dest("user")
                .type(String.class)
                .setDefault("world!")
                .help("The user of the program");
    }

    @Override
    public void run(Bootstrap<?> bootstrap, Namespace namespace) throws Exception {
        System.out.println("Hello " + namespace.getString("user"));
    }
}
