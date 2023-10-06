package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Stock;

import java.util.List;

public interface IStockService {

    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock s);

    Stock retrieveStock(Long s);

    void removeStock(Long id);
}
