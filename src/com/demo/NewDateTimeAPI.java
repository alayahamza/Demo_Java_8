package com.demo;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewDateTimeAPI {
	static final Logger LOG = LoggerFactory.getLogger(NewDateTimeAPI.class);

	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now();
		LocalDateTime nextDayOfTheWeek = currentTime.plusDays(7);
		LOG.info("Today is : " + currentTime.getDayOfWeek() + " the " + currentTime.getDayOfMonth() + "th " + " of "
				+ currentTime.getYear());
		LOG.info("Next " + currentTime.getDayOfWeek() + " is going to be : " + nextDayOfTheWeek.getDayOfWeek() + " the "
				+ nextDayOfTheWeek.getDayOfMonth() + "th " + " of " + nextDayOfTheWeek.getYear());
		LOG.info("Current time is : " + currentTime.getHour() + ":" + currentTime.getMinute());
	}

}
