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
@Table(name = "Athlete")
public class Athlete  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long athleteId;
    String name;
    String nationality;
    String sport;
}
