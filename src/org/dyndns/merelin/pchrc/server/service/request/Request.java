package org.dyndns.merelin.pchrc.server.service.request;

import java.util.Arrays;

import org.dyndns.merelin.pchrc.server.service.Function;
import org.dyndns.merelin.pchrc.server.service.Module;

public class Request {
    private final Module module;
    private final Function function;
    private final String[] arguments;

    public Request(Module module, Function function, String... arguments) {
        this.module = module;
        this.function = function;
        this.arguments = arguments;
    }

    public Module getModule() {
        return module;
    }

    public Function getFunction() {
        return function;
    }

    public String[] getArguments() {
        return arguments;
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append(module.getName());
        buf.append('.');
        buf.append(function.getName());
        buf.append('(');
        Arrays.toString(arguments);
        buf.append(')');

        return buf.toString();
    }
}
