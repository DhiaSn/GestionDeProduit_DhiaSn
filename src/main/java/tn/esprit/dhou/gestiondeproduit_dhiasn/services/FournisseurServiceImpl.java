package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Facture;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Fournisseur;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.ClientRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.FournisseurRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class FournisseurServiceImpl implements IFournisseurService {
    FournisseurRepository _fourRepo;

    @Override
    public List<Fournisseur> retrieveAllFournisseurs() {
        return (List<Fournisseur>) _fourRepo.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        return _fourRepo.save(f);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        if(_fourRepo.existsById(f.getIdFourisseur()))
            return _fourRepo.save(f);
        return null;
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return _fourRepo.findById(id).get();
    }

    @Override
    public void removeFournisseur(Long id) {
        _fourRepo.deleteById(id);
    }
}
