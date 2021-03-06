package com.esprit.hypnotrip.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.hypnotrip.persistence.Event;

@Remote
public interface EventServicesRemote {

	List<Event> getAllThisWeekEvents();

	List<Event> getAllNextWeekEvents();

	List<String> getAllEventMonths();

	List<Event> getAllThisMonthEvents();

	List<Event> getAllThisMonthEvents2();

	List<Event> getMonthlyEventsByMonth();

	List<Event> eventsIHaveMissedInTheLastWeek(Integer idUser);

	Event mostFollowedEventToCome();

	boolean eventIsAvailaible(Integer idPage);

	List<Event> availableOrUpcomingEventsIMightLike(String idUser, String place);

}
