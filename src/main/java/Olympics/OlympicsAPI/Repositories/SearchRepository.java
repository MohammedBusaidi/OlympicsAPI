package Olympics.OlympicsAPI.Repositories;

import Olympics.OlympicsAPI.Models.Search;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchRepository extends JpaRepository<Search,Long> {
}
