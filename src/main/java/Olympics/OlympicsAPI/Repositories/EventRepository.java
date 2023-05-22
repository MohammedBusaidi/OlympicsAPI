package Olympics.OlympicsAPI.Repositories;

import Olympics.OlympicsAPI.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}
