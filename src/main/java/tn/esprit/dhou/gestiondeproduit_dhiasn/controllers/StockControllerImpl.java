package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IStockService;

@Controller
@AllArgsConstructor
public class StockControllerImpl {
    IStockService _stockServ;

}
