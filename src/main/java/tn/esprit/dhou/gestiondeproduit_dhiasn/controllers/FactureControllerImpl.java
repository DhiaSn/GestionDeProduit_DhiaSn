package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IFactureService;

@Controller
@AllArgsConstructor
public class FactureControllerImpl {
    IFactureService _facServ;
}
