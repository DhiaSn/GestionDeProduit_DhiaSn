package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailFacture;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailProduit;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.DetailProduitRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class DetailProduitServiceImpl implements  IDetailProduitService{
    DetailProduitRepository _detailProdRepo;

    @Override
    public List<DetailProduit> retrieveAllDetailProduits() {
        return (List<DetailProduit>) _detailProdRepo.findAll();
    }

    @Override
    public DetailProduit addDetailProduit(DetailProduit dp) {
        return _detailProdRepo.save(dp);
    }

    @Override
    public DetailProduit updateDetailProduit(DetailProduit dp) {
        if(_detailProdRepo.existsById(dp.getIdDetailProduit()))
            return _detailProdRepo.save(dp);
        return null;
    }

    @Override
    public DetailProduit retrieveDetailProduit(Long id) {
        return _detailProdRepo.findById(id).get();
    }

    @Override
    public void removeDetailProduit(Long id) {
        _detailProdRepo.deleteById(id);
    }
}

