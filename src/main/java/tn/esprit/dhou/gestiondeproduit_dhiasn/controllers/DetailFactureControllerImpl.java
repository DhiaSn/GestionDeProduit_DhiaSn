package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IDetailFactureService;

@Controller
@AllArgsConstructor
public class DetailFactureControllerImpl {
    IDetailFactureService _detailFacService;
}
