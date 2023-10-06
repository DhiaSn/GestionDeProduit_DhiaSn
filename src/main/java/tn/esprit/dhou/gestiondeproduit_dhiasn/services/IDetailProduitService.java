package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailProduit;

import java.util.List;

public interface IDetailProduitService {
    List<DetailProduit> retrieveAllDetailProduits();

    DetailProduit addDetailProduit(DetailProduit dp);

    DetailProduit updateDetailProduit(DetailProduit dp);

    DetailProduit retrieveDetailProduit(Long id);

    void removeDetailProduit(Long id);
}
