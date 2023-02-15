package kaddem.repositories;

import kaddem.entities.Contrat;
import kaddem.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {

}
