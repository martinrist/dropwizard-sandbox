package com.martinrist.sandbox.dropwizard.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.martinrist.sandbox.dropwizard.config.HelloWorldConfiguration;
import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class SandboxConfiguration extends Configuration {

    @Valid
    @NotNull
    private HelloWorldConfiguration helloWorldConfig;

    @JsonProperty("helloWorld")
    public HelloWorldConfiguration getHelloWorldConfig() {
        return helloWorldConfig;
    }

}
