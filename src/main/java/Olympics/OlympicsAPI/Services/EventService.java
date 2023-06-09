package Olympics.OlympicsAPI.Services;

import Olympics.OlympicsAPI.Models.Event;
import Olympics.OlympicsAPI.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
    public Event findByID(Long eventId) {
        return eventRepository.findById(eventId).get();
    }
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

}
