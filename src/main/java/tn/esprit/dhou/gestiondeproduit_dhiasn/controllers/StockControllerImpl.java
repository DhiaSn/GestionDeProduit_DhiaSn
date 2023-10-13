package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IStockService;

@AllArgsConstructor
@RestController
@RequestMapping("/Stock")
public class StockControllerImpl {
    IStockService _stockServ;

}
