package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Enums.CategoryClient;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Facture;

import java.time.LocalDate;
import java.util.List;

public interface IFactureService {
    Facture getFactureByClientId(long id);

    List<Facture> retrieveAlFactures();

    Facture addFacture(Facture c);

    Facture updateFacture(Facture c);

    Facture retrieveFacture(Long c);

    void removeFacture(Long id);
    Facture addFacture(Facture f, Long idClient);

    public float getChiffreAffaireParCategorieClient(CategoryClient categorieClient, LocalDate startDate, LocalDate endDate);
    float getRevenuBrutProduit(Long idProduit, LocalDate startDate, LocalDate endDate);

}
