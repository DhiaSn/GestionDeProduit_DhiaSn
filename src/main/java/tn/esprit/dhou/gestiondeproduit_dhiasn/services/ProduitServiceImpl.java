package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Fournisseur;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Produit;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Stock;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.FournisseurRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.ProduitRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.StockReporitory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class ProduitServiceImpl implements IProduitService {
    ProduitRepository _produitRepo;
    StockReporitory _stockRepo;
    FournisseurRepository _fourRepo;

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

    @Override
    public List<Produit> getProduitByFourniseur(Fournisseur f) {
        if(f != null && f.getIdFourisseur() != 0)
            return _produitRepo.getProduitByFourniseur(f);
        return  null;
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {

        /*
        check if it is already assigned
         */
        if (_produitRepo.existsById(idProduit) && _stockRepo.existsById(idStock)) {
            Produit produit = _produitRepo.findById(idProduit).get();
            Stock stock = _stockRepo.findById(idStock).get();
            produit.setStock(stock);
            _produitRepo.save((produit));
        }
    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {

        if(_produitRepo.existsById(produitId) && _fourRepo.existsById(fournisseurId))
        {
            Produit produit = _produitRepo.findById(produitId).get();
            Set<Fournisseur> fournisseurs = new HashSet<Fournisseur>();
            fournisseurs.add(_fourRepo.findById(fournisseurId).get());
            produit.setFournisseurs(fournisseurs);
            _produitRepo.save(produit);
        }
    }


}
