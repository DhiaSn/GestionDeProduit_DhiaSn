package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.DetailFacture;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IDetailFactureService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/DetailFacture")
public class DetailFactureControllerImpl {
    IDetailFactureService _detailFacService;

    @GetMapping("/")
    @ResponseBody
    public List<DetailFacture> getDetailFactures() {
        return _detailFacService.retrieveAllDetailFacture();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public DetailFacture getDetailFactureById(@PathVariable long id) {
        return _detailFacService.retrieveDetailFacture(id);
    }

    @GetMapping("/getDetailFactureByClientId/{clientId}")
    @ResponseBody
    public DetailFacture getDetailFactureByClientId(@PathVariable Long clientId) {
        return _detailFacService.getDetailFactureByClientId(clientId);
    }

    @PostMapping("/")
    @ResponseBody
    public DetailFacture postDetailFacture(@RequestBody DetailFacture c) {
        if(c == null)
            return null;
        return _detailFacService.addDetailFacture(c);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public DetailFacture putDetailFacture(@PathVariable long id, @RequestBody DetailFacture c) {
        if(c == null || id != c.getIdDetailFacture())
            return  null;
        return _detailFacService.updateDetailFacture(c);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteDetailFacture(@PathVariable long id) {
        _detailFacService.removeDetailFacture(id);
    }
    
}
