package tn.esprit.dhou.gestiondeproduit_dhiasn.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Facture;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Rayon;

public interface RayonRepository extends CrudRepository<Rayon, Long> {
}
