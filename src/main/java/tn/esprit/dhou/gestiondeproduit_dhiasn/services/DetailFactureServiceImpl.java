package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailFacture;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.DetailFactureRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DetailFactureServiceImpl implements IDetailFactureService {
    DetailFactureRepository _detailFacRepo;

    @Override
    public DetailFacture getDetailFactureByClientId(Long id) {
        return _detailFacRepo.findByFactureClientIdClient(id);
    }

    @Override
    public List<DetailFacture> retrieveAllDetailFacture() {
        return (List<DetailFacture>) _detailFacRepo.findAll();
    }

    @Override
    public DetailFacture addDetailFacture(DetailFacture df) {
        return _detailFacRepo.save(df);
    }

    @Override
    public DetailFacture updateDetailFacture(DetailFacture df) {
        if(_detailFacRepo.existsById(df.getIdDetailFacture()))
            return _detailFacRepo.save(df);
        return null;
    }

    @Override
    public DetailFacture retrieveDetailFacture(Long id) {
        return _detailFacRepo.findById(id).get();
    }

    @Override
    public void removeDetailFacture(Long id) {
        _detailFacRepo.deleteById(id);
    }
}
