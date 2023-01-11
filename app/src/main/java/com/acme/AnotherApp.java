package com.acme;

public class AnotherApp {

    public String getGreeting() {
        var

                first = "Some variable I have here that is poorly formatted.";
        var second = "Oh no, " +
                "can this be? A second poorly formatted variable?";
        var          third = "The world has trully gone to hell.";
        return """
               %s
               %s
               %s
               """
                .formatted(
                        first, second
                        , third);
    }
}
