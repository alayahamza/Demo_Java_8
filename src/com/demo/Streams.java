package com.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class Streams {
	public Streams() {
	}

	static List<String> names = Arrays.asList("Hamza", "Ali", "Achraf", "Mahdi", "Saber", "mohamed", "sami", "aladain", "abir", "Chaima", "asma");

	public static void main(String[] args) {
		log.info("/********* 	PRINTING forEach  *****************/");
		Streams.printForEach();
		log.info("/********* 	PRINTING map      ****************/");
		Streams.printMap();
		log.info("/********* 	PRINTING filter   *****************/");
		Streams.printFilter();
		log.info("/********* 	PRINTING limit    *****************/");
		Streams.printLimit();
		log.info("/********* 	PRINTING sorted   *****************/");
		Streams.printSorted();
	}

	static void printForEach() {
		names.forEach(log::info);
	}

	static void printMap() {
		names.stream().map(name -> name.toLowerCase()).forEach(log::info);
	}

	static void printFilter() {
		names.stream().map(name -> name.toLowerCase()).filter(name -> name.startsWith("a")).forEach(log::info);
	}

	static void printLimit() {
		long namesSize = names.size();
		names.stream().limit(namesSize / 3).forEach(log::info);
	}

	static void printSorted() {
		names.stream().sorted().forEach(log::info);
	}
}
