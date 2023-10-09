package tn.esprit.dhou.gestiondeproduit_dhiasn.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Fournisseur;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Produit;

import java.util.List;

public interface ProduitRepository extends CrudRepository<Produit, Long> {


}
