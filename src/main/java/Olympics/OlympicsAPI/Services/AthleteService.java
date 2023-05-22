package Olympics.OlympicsAPI.Services;

import Olympics.OlympicsAPI.Models.Athlete;
import Olympics.OlympicsAPI.Repositories.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AthleteService {
    @Autowired
    AthleteRepository athleteRepository;
    public List<Athlete> getAllAthletes() {
        return athleteRepository.findAll();
    }

    public Athlete findByID(Long athleteId) {
        return athleteRepository.findById(athleteId).get();
    }
    public Athlete addAthlete(Athlete athlete) {
        return athleteRepository.save(athlete);
    }
}
