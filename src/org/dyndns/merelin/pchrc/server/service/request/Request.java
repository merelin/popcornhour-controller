package org.dyndns.merelin.pchrc.server.service.request;

public class Request {
    private final String module;
    private final String function;
    private final String[] arguments;

    public Request(String module, String function, String... arguments) {
        this.module = module;
        this.function = function;
        this.arguments = arguments;
    }

    public String getModule() {
        return module;
    }

    public String getFunction() {
        return function;
    }

    public String[] getArguments() {
        return arguments;
    }
}
