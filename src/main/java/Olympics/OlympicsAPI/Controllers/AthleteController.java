package Olympics.OlympicsAPI.Controllers;

import Olympics.OlympicsAPI.Models.Athlete;
import Olympics.OlympicsAPI.Services.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "athlete")
public class AthleteController {
    @Autowired
    AthleteService athleteService;

    @GetMapping(value = "getAll")
    public List<Athlete> getAllAthletes() {
        return athleteService.getAllAthletes();
    }

    @GetMapping("{id}")
    public Athlete getById(@PathVariable("id") Long athleteId) {
        return athleteService.findByID(athleteId);
    }
    @PostMapping(value = "Add")
    Athlete createAthlete(@RequestBody Athlete athlete) {
        return athleteService.addAthlete(athlete);
    }
}
