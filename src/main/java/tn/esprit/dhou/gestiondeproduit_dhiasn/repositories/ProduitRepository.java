package tn.esprit.dhou.gestiondeproduit_dhiasn.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Fournisseur;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Produit;

public interface ProduitRepository extends CrudRepository<Produit, Long> {
}
