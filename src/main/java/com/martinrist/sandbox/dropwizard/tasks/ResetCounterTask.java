package com.martinrist.sandbox.dropwizard.tasks;

import com.google.common.collect.ImmutableMultimap;
import com.martinrist.sandbox.dropwizard.resources.HelloWorldResource;
import io.dropwizard.servlets.tasks.Task;

import java.io.PrintWriter;

public class ResetCounterTask extends Task {

    private final HelloWorldResource helloWorldResource;

    public ResetCounterTask(HelloWorldResource resource) {
        super("reset-counter");
        this.helloWorldResource = resource;
    }

    @Override
    public void execute(ImmutableMultimap<String, String> parameters, PrintWriter output) throws Exception {
        helloWorldResource.resetCounter();
    }
}