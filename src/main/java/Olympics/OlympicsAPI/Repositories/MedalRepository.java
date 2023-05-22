package Olympics.OlympicsAPI.Repositories;

import Olympics.OlympicsAPI.Models.Medal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedalRepository extends JpaRepository<Medal,Long> {
}
