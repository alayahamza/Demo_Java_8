package com.demo;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Streams {
	public Streams() {
	}

	static final Logger LOG = LoggerFactory.getLogger(Streams.class);
	static List<String> names = Arrays.asList("Hamza", "Ali", "Achraf", "Mahdi", "Saber", "mohamed", "sami", "aladain", "abir", "Chaima", "asma");

	public static void main(String[] args) {
		LOG.info("/********* 	PRINTING forEach  *****************/");
		Streams.printForEach();
		LOG.info("/********* 	PRINTING map      ****************/");
		Streams.printMap();
		LOG.info("/********* 	PRINTING filter   *****************/");
		Streams.printFilter();
		LOG.info("/********* 	PRINTING limit    *****************/");
		Streams.printLimit();
		LOG.info("/********* 	PRINTING sorted   *****************/");
		Streams.printSorted();
	}

	static void printForEach() {
		names.forEach(LOG::info);
	}

	static void printMap() {
		names.stream().map(name -> name.toLowerCase()).forEach(LOG::info);
	}

	static void printFilter() {
		names.stream().map(name -> name.toLowerCase()).filter(name -> name.startsWith("a")).forEach(LOG::info);
	}

	static void printLimit() {
		long namesSize = names.size();
		names.stream().limit(namesSize / 3).forEach(LOG::info);
	}

	static void printSorted() {
		names.stream().sorted().forEach(LOG::info);
	}
}
