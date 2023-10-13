package tn.esprit.dhou.gestiondeproduit_dhiasn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Rayon;
import tn.esprit.dhou.gestiondeproduit_dhiasn.services.IRayonService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Rayon")
public class RayonControllerImpl {
    IRayonService _rayonServ;

    @GetMapping("/")
    @ResponseBody
    public List<Rayon> getRayons() {
        return _rayonServ.retrieveAllRayons();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Rayon getRayonById(@PathVariable long id) {
        return _rayonServ.retrieveRayon(id);
    }

    @PostMapping("/")
    @ResponseBody
    public Rayon postRayon(@RequestBody Rayon c) {
        if(c == null)
            return null;
        return _rayonServ.addRayon(c);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Rayon putRayon(@PathVariable long id, @RequestBody Rayon c) {
        if(c == null || id != c.getIdRayon())
            return  null;
        return _rayonServ.updateRayon(c);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteRayon(@PathVariable long id) {
        _rayonServ.removeRayon(id);
    }
    
}
