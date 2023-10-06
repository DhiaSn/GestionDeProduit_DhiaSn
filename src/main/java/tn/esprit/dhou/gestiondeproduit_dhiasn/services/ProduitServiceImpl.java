package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Produit;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.ProduitRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ProduitServiceImpl implements IProduitService {
    ProduitRepository _produitRepo;

    @Override
    public List<Produit> retrieveAllProduits() {
        return (List<Produit>) _produitRepo.findAll();
    }

    @Override
    public Produit addProduit(Produit p) {
        return _produitRepo.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        if(_produitRepo.existsById(p.getIdProduit()))
            return _produitRepo.save(p);
        return null;
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return _produitRepo.findById(id).get();
    }

    @Override
    public void removeProduit(Long id) {
        _produitRepo.deleteById(id);
    }
}
