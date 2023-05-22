package Olympics.OlympicsAPI.Repositories;

import Olympics.OlympicsAPI.Models.Athelte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthelteRepository extends JpaRepository<Athelte, Long> {
}
