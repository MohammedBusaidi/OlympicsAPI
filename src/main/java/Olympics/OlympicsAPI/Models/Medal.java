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
public class Medal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long medalId;
    String typeOfMedal;
}
