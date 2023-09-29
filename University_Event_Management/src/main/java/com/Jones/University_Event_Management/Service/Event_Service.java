package com.Jones.University_Event_Management.Service;

import com.Jones.University_Event_Management.Model.Event;
import com.Jones.University_Event_Management.Repository.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class Event_Service {

    @Autowired
    IEventRepository iEventRepository;

    // Add Event
    public String addEvent(Event event) {
        iEventRepository.save(event);
        return "Event Added";
    }

    // Add Events
    public String addEvents(List<Event> eventList) {
        iEventRepository.saveAll(eventList);
        return "Events added";
    }

    // Update Event
    public String updateEvent(Long eventId, Event event) {
        Event existingEvent = iEventRepository.findById(eventId).get();

        existingEvent.setEventName(event.getEventName());
        existingEvent.setLocationOfEvent(event.getLocationOfEvent());
        existingEvent.setEventDate(event.getEventDate());
        existingEvent.setStartTime(event.getStartTime());
        existingEvent.setEndTime(event.getEndTime());
        iEventRepository.save(existingEvent);

        return "Event Updated";
    }

    // Delete Event BY I'd
    public String deleteEventById(Long eventId) {
        iEventRepository.deleteById(eventId);
        return "Event Deleted";
    }


    // Get Event By I'd
    public List<Event> getEventsByDate(LocalDate date) {
        return iEventRepository.findByEventDate(date);
    }

}
