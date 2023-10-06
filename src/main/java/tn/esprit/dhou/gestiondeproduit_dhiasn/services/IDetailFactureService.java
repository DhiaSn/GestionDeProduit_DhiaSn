package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailFacture;

import java.util.List;

public interface IDetailFactureService {
    DetailFacture getDetailFactureByClientId(Long id);

    List<DetailFacture> retrieveAllDetailFacture();

    DetailFacture addDetailFacture(DetailFacture df);

    DetailFacture updateDetailFacture(DetailFacture df);

    DetailFacture retrieveDetailFacture(Long id);

    void removeDetailFacture(Long id);
}
