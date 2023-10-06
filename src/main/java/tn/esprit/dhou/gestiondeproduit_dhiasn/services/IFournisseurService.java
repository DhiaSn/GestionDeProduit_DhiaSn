package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {

    List<Fournisseur> retrieveAllFournisseurs();

    Fournisseur addFournisseur(Fournisseur f);

    Fournisseur updateFournisseur(Fournisseur f);

    Fournisseur retrieveFournisseur(Long id);

    void removeFournisseur(Long id);
}
