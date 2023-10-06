package tn.esprit.dhou.gestiondeproduit_dhiasn.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailFacture;

public interface DetailFactureRepository extends CrudRepository<DetailFacture, Long> {
    DetailFacture findByFactureClientIdClient(long facture_client_idClient);

}
