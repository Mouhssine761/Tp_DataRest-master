package emsi.tp_datarest.repositories;

import emsi.tp_datarest.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    List<Etudiant> findEtudiantByNom(@Param("nom") String nom);

}
