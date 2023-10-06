package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailProduit;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Facture;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.FactureRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class FactureServiceImpl implements  IFactureService {
    FactureRepository _factureRepo;

    @Override
    public Facture getFactureByClientId(long id) {
        return _factureRepo.findFactureByClientIdClient(id);
    }

    @Override
    public List<Facture> retrieveAlFactures() {
        return (List<Facture>) _factureRepo.findAll();
    }

    @Override
    public Facture addFacture(Facture f) {
        return _factureRepo.save(f);
    }

    @Override
    public Facture updateFacture(Facture f) {
        if(_factureRepo.existsById(f.getIdFacture()))
            return _factureRepo.save(f);
        return null;
    }

    @Override
    public Facture retrieveFacture(Long id) {
        return _factureRepo.findById(id).get();
    }

    @Override
    public void removeFacture(Long id) {
        _factureRepo.deleteById(id);
    }
}
