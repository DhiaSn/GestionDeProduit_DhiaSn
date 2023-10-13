package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Fournisseur;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Stock;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IStockService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Stock")
public class StockControllerImpl {
    IStockService _stockServ;

    @GetMapping("/")
    @ResponseBody
    public List<Stock> getStocks() {
        return _stockServ.retrieveAllStocks();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Stock getStockById(@PathVariable long id) {
        return _stockServ.retrieveStock(id);
    }

    @PostMapping("/getStockByFourniseur")
    @ResponseBody
    public List<Stock> getStockByFourniseur(@RequestBody Fournisseur f) {
        return _stockServ.getStockByFourniseur(f);
    }

    @PostMapping("/")
    @ResponseBody
    public Stock postStock(@RequestBody Stock c) {
        if(c == null)
            return null;
        return _stockServ.addStock(c);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Stock putStock(@PathVariable long id, @RequestBody Stock c) {
        if(c == null || id != c.getIdStock())
            return  null;
        return _stockServ.updateStock(c);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteStock(@PathVariable long id) {
        _stockServ.removeStock(id);
    }
    
}
