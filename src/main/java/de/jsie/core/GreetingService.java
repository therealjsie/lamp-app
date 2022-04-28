package de.jsie.core;

import org.jdbi.v3.core.Jdbi;

public class GreetingService {

    private final Jdbi jdbi;

    public GreetingService(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public String greeting() {
        return "Hello, World!";
    }
}
