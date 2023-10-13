package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Facture;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IFactureService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Facture")
public class FactureControllerImpl {
    IFactureService _facServ;

    @GetMapping("/")
    @ResponseBody
    public List<Facture> getFactures() {
        return _facServ.retrieveAlFactures();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Facture getFactureById(@PathVariable long id) {
        return _facServ.retrieveFacture(id);
    }

    @PostMapping("/")
    @ResponseBody
    public Facture postFacture(@RequestBody Facture c) {
        if(c == null)
            return null;
        return _facServ.addFacture(c);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Facture putFacture(@PathVariable long id, @RequestBody Facture c) {
        if(c == null || id != c.getIdFacture())
            return  null;
        return _facServ.updateFacture(c);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteFacture(@PathVariable long id) {
        _facServ.removeFacture(id);
    }
}
