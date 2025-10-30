package emsi.tp_datarest.repositories;

import emsi.tp_datarest.models.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "centres")
public interface CentreRepository extends JpaRepository<Centre, Long> {
}