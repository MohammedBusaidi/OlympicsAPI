package Olympics.OlympicsAPI.Repositories;

import Olympics.OlympicsAPI.Models.Medal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedalRepository extends JpaRepository<Medal,Long> {
}
