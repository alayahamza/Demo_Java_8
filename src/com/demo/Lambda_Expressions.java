package com.demo;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lambda_Expressions {
	public Lambda_Expressions() {
	}

	private static final Logger LOG = LoggerFactory.getLogger(Lambda_Expressions.class);

	public static void main(String[] args) {
		MathOperation addition = (a, b) -> a + b;
		LOG.info("addition : " + operate(6, 5, addition));
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.stream().map(x -> x.toString()).forEach(LOG::info);
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	static int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
