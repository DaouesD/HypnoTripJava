package com.esprit.hypnotrip.services.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.hypnotrip.persistence.Event;

@Local
public interface EventServicesLocal {

	List<Event> getAllThisWeekEvents();

	List<Event> getAllNextWeekEvents();

	List<String> getAllEventMonths();

	List<Event> getAllThisMonthEvents();

	List<Event> getAllThisMonthEvents2();

	List<Event> getMonthlyEventsByMonth();

	List<Event> eventsIHaveMissedInTheLastWeek();

	Event mostFollowedEventToCome();

	boolean eventIsAvailaible();

}