package tn.esprit.dhou.gestiondeproduit_dhiasn.repositories;

import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailProduit;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Enums.CategoryClient;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Facture;

import java.time.LocalDate;

public interface FactureRepository extends CrudRepository<Facture, Long> {
    Facture findFactureByClientIdClient(long id);
    @Query(value = "SELECT SUM(montant_facture) FROM Facture f JOIN Client c on f.client_id_client = c.id_client WHERE c.category_client = :categorieClient AND f.date_facture BETWEEN :startDate AND :endDate", nativeQuery = true)
    float getChiffreAffaireParCategorieClient(CategoryClient categorieClient, LocalDate startDate, LocalDate endDate);



    // @Query(value = "SELECT SUM(DetailFacture.prixTotal) FROM Produit p JOIN DetailFacture d ON d.produit.idProduit = p.idProduit WHERE p.idProduit = :idProduit AND d.facture.dateFacture BETWEEN :startDate AND :endDate")
    @Query(value = "SELECT SUM(prix_total) FROM Produit p JOIN detail_facture d ON p.id_produit = d.produit_id_produit JOIN facture f on d.facture_id_facture = f.id_facture WHERE p.id_produit = :idProduit AND f.date_facture BETWEEN :startDate AND :endDate", nativeQuery = true)
    float getRevenuBrutProduit(@Param("idProduit")Long idProduit,@Param("startDate") LocalDate startDate,@Param("endDate") LocalDate endDate);

}
