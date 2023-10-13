package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Fournisseur;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IFournisseurService;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/Fournisseur")
public class FournisseurControllerImpl {
    IFournisseurService _fourServ;

    @GetMapping("/")
    @ResponseBody
    public List<Fournisseur> getFournisseurs() {
        return _fourServ.retrieveAllFournisseurs();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Fournisseur getFournisseurById(@PathVariable long id) {
        return _fourServ.retrieveFournisseur(id);
    }

    @PostMapping("/")
    @ResponseBody
    public Fournisseur postFournisseur(@RequestBody Fournisseur c) {
        return _fourServ.addFournisseur(c);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Fournisseur putFournisseur(@PathVariable long id, @RequestBody Fournisseur c) {
        if(c == null || id != c.getIdFourisseur())
            return  null;
        return _fourServ.updateFournisseur(c);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteFournisseur(@PathVariable long id) {
        _fourServ.removeFournisseur(id);
    }
}
