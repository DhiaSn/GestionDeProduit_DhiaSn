package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IFournisseurService;

@Controller
@AllArgsConstructor

public class FournisseurControllerImpl {
    IFournisseurService _fourServ;

}
