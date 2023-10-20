package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Fournisseur;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Produit;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IProduitService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Produit")
public class ProduitControllerImpl {
    IProduitService _prodServ;

    @GetMapping("/")
    @ResponseBody
    public List<Produit> getProduits() {
        return _prodServ.retrieveAllProduits();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Produit getProduitById(@PathVariable long id) {
        return _prodServ.retrieveProduit(id);
    }

    @PostMapping("/getProduitByFourniseur")
    @ResponseBody
    public List<Produit> getProduitByFourniseur(@RequestBody Fournisseur f) {
        return _prodServ.getProduitByFourniseur(f);
    }

    @PostMapping("/")
    @ResponseBody
    public Produit postProduit(@RequestBody Produit c) {
        if(c == null)
            return null;
        return _prodServ.addProduit(c);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Produit putProduit(@PathVariable long id, @RequestBody Produit c) {
        if(c == null || id != c.getIdProduit())
            return  null;
        return _prodServ.updateProduit(c);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteProduit(@PathVariable long id) {
        _prodServ.removeProduit(id);
    }

    @PutMapping("/{produitId}/stock/{stockId}")
    @ResponseBody
    public void assignProduitToStock(@PathVariable Long produitId,@PathVariable Long stockId)
    {
        _prodServ.assignProduitToStock(produitId, stockId);
    }

}
