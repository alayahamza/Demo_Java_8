package com.demo;

public interface Vehicle {
    java.util.logging.Logger log = java.util.logging.Logger.getLogger(Vehicle.class.getName());

    default void print() {
        log.info("I'm a vehicle");
    }
}
