package tn.esprit.dhou.gestiondeproduit_dhiasn.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailProduit;

public interface DetailProduitRepository extends CrudRepository<DetailProduit, Long> {

}
