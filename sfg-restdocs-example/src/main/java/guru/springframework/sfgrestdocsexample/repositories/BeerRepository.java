package guru.springframework.sfgrestdocsexample.repositories;

import guru.springframework.sfgrestdocsexample.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
