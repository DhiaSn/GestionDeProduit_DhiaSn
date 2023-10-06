package tn.esprit.dhou.gestiondeproduit_dhiasn.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Facture;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Stock;

public interface StockReporitory extends CrudRepository<Stock, Long> {
}
