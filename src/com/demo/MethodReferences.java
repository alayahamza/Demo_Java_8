package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodReferences {
	public MethodReferences() {
	}

	static final Logger LOG = LoggerFactory.getLogger(MethodReferences.class);

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Hamza");
		names.add("Achraf");
		names.add("Mahdi");
		names.forEach(LOG::info);
	}

}
