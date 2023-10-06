package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IProduitService;

@Controller
@AllArgsConstructor
public class ProduitControllerImpl {
    IProduitService _prodServ;
}
