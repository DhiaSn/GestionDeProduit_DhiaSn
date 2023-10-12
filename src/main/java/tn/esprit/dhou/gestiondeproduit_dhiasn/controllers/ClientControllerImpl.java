package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IClientService;

import java.util.List;

@Controller
@AllArgsConstructor

public class ClientControllerImpl {
    IClientService _userServ;

    @GetMapping("/")
    @ResponseBody
    public List<Client> getClients() {
        return _userServ.retrieveAllClients();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Client getClientById(@PathVariable long id) {
        return _userServ.retrieveClient(id);
    }

    @PostMapping("/")
    @ResponseBody
    public Client postClient(@RequestBody Client c) {
        if(c == null)
            return null;
        return _userServ.addClient(c);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Client putClient(@PathVariable long id, @RequestBody Client c) {
        if(c == null || id != c.getIdClient())
            return  null;
        return _userServ.updateClient(c);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteClient(@PathVariable long id) {
        _userServ.removeClient(id);
    }
}
