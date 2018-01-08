package com.demo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Car implements Vehicle {


	@Override
	public void print() {
		Vehicle.super.print();
		log.info("Well i'm a car");
	}
}