package com.demo;

import java.time.LocalDateTime;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NewDateTimeAPI {

	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now();
		LocalDateTime nextDayOfTheWeek = currentTime.plusDays(7);
		log.info("Today is : " + currentTime.getDayOfWeek() + " the " + currentTime.getDayOfMonth() + "th " + " of "
				+ currentTime.getYear());
		log.info("Next " + currentTime.getDayOfWeek() + " is going to be : " + nextDayOfTheWeek.getDayOfWeek() + " the "
				+ nextDayOfTheWeek.getDayOfMonth() + "th " + " of " + nextDayOfTheWeek.getYear());
		log.info("Current time is : " + currentTime.getHour() + ":" + currentTime.getMinute());
	}

}
