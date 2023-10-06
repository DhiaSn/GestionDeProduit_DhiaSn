package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Rayon;

import java.util.List;

public interface IRayonService {

    List<Rayon> retrieveAllRayons();

    Rayon addRayon(Rayon r);

    Rayon updateRayon(Rayon r);

    Rayon retrieveRayon(Long r);

    void removeRayon(Long id);
}
