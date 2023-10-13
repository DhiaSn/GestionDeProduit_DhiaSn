package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailProduit;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IDetailFactureService;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IDetailProduitService;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/DetailProduit")
public class DetailProduitControllerImpl {
    IDetailProduitService _detailProdServ;

    @GetMapping("/")
    @ResponseBody
    public List<DetailProduit> getDetailProduits() {
        return _detailProdServ.retrieveAllDetailProduits();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public DetailProduit getDetailProduitById(@PathVariable long id) {
        return _detailProdServ.retrieveDetailProduit(id);
    }

    @PostMapping("/")
    @ResponseBody
    public DetailProduit postDetailProduit(@RequestBody DetailProduit c) {
        if(c == null)
            return null;
        return _detailProdServ.addDetailProduit(c);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public DetailProduit putDetailProduit(@PathVariable long id, @RequestBody DetailProduit c) {
        if(c == null || id != c.getIdDetailProduit())
            return  null;
        return _detailProdServ.updateDetailProduit(c);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteDetailProduit(@PathVariable long id) {
        _detailProdServ.removeDetailProduit(id);
    }

}
