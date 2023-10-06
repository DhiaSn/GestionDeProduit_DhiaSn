package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IRayonService;

@Controller
@AllArgsConstructor
public class RayonControllerImpl {
    IRayonService _rayonServ;
}
