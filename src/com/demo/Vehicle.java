package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Vehicle {

	public static final Logger LOG = LoggerFactory.getLogger(Lambda_Expressions.class);

	default void print() {
		LOG.info("I'm a vehicle");
	}
}
