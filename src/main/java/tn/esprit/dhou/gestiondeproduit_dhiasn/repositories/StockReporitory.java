package tn.esprit.dhou.gestiondeproduit_dhiasn.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Facture;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Fournisseur;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Stock;

import java.util.List;

public interface StockReporitory extends CrudRepository<Stock, Long> {
    @Query(value = "FROM Stock s JOIN Produit p on (p.stock.idStock = s.idStock ) where :f member of p.fournisseurs")
    List<Stock> getStockByFourniseur(Fournisseur f);

}
