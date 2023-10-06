package tn.esprit.dhou.gestiondeproduit_dhiasn.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailProduit;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Facture;

public interface FactureRepository extends CrudRepository<Facture, Long> {
    Facture findFactureByClientIdClient(long id);
}
