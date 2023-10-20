package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Enums.CategoryClient;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Facture;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IFactureService;

import java.time.LocalDate;
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

    @PutMapping("/Client/{idClient}")
    @ResponseBody
    public  Facture addFacture(@RequestBody Facture f,@PathVariable Long idClient) {
        if(idClient != 0)
            return _facServ.addFacture(f, idClient);
        return null;
    }

    @GetMapping("/ChiffreAffaire/{categorieClient}/{startDate}/{endDate}")
    @ResponseBody
    public float getChiffreAffaireParCategorieClient(@PathVariable CategoryClient categorieClient,@PathVariable LocalDate startDate,@PathVariable LocalDate endDate)
    {
        return _facServ.getChiffreAffaireParCategorieClient(categorieClient, startDate, endDate);
    }

    @GetMapping("/RevnueBrutProduit/{idProduit}//{startDate}/{endDate}")
    @ResponseBody
    float getRevenuBrutProduit(@PathVariable Long idProduit,@PathVariable LocalDate startDate,@PathVariable LocalDate endDate) {
        return _facServ.getRevenuBrutProduit(idProduit, startDate, endDate);
    }

}
