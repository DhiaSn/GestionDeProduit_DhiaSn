package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IFactureService;

@AllArgsConstructor
@RestController
@RequestMapping("/Facture")
public class FactureControllerImpl {
    IFactureService _facServ;
}
