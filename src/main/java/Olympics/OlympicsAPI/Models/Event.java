package Olympics.OlympicsAPI.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.*;

@Setter
@Getter
@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long eventId;
    String nameOfEvent;
    String sport;
    String schedule;
}
