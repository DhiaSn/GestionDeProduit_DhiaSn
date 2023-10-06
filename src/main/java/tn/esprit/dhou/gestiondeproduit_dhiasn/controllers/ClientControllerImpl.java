package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IClientService;

@Controller
@AllArgsConstructor

public class ClientControllerImpl {
    IClientService _userServ;

}
