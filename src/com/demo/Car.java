package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements Vehicle {

	private static final Logger LOG = LoggerFactory.getLogger(Lambda_Expressions.class);

	@Override
	public void print() {
		Vehicle.super.print();
		LOG.info("Well i'm a car");
	}
}