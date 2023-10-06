package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Fournisseur;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Produit;

import java.util.List;

public interface IProduitService {

    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit f);

    Produit updateProduit(Produit f);

    Produit retrieveProduit(Long id);

    void removeProduit(Long id);
}
