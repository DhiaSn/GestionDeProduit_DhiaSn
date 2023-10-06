package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Rayon;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.RayonRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class RayonServiceImpl implements  IRayonService {
    RayonRepository _rayonRepo;

    @Override
    public List<Rayon> retrieveAllRayons() {
        return (List<Rayon>) _rayonRepo.findAll();
    }

    @Override
    public Rayon addRayon(Rayon r) {
        return _rayonRepo.save(r);
    }

    @Override
    public Rayon updateRayon(Rayon r) {
        if(_rayonRepo.existsById(r.getIdRayon()))
            return _rayonRepo.save(r);
        return null;
    }

    @Override
    public Rayon retrieveRayon(Long id) {
        return _rayonRepo.findById(id).get();
    }

    @Override
    public void removeRayon(Long id) {
        _rayonRepo.deleteById(id);
    }
}
