package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Fournisseur;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Stock;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.StockReporitory;

import java.util.List;

@AllArgsConstructor
@Service
public class StockServiceImpl implements IStockService {
    StockReporitory _stockRepo;

    @Override
    public List<Stock> retrieveAllStocks() {
        return (List<Stock>) _stockRepo.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return _stockRepo.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        if(_stockRepo.existsById(s.getIdStock()))
            return _stockRepo.save(s);
        return null;
    }

    @Override
    public Stock retrieveStock(Long id) {
        return _stockRepo.findById(id).get();
    }

    @Override
    public void removeStock(Long id) {
        _stockRepo.deleteById(id);
    }


}
