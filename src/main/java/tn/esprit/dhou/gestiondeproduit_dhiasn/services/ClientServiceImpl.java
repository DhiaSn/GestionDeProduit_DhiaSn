package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Enums.CategoryClient;
import tn.esprit.dhou.gestiondeproduit_dhiasn.repositories.ClientRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService {

    ClientRepository _userRepo;
    @Override
    public List<Client> retrieveAllClients() {
        return (List<Client>) _userRepo.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return _userRepo.save(c);
    }

    @Override
    public Client updateClient(Client c) {
        if(_userRepo.existsById(c.getIdClient()))
            return _userRepo.save(c);
        return null;
    }

    @Override
    public Client retrieveClient(Long id) {
        return _userRepo.findById(id).get();
    }

    @Override
    public void removeClient(Long id) {
        _userRepo.deleteById(id);
    }
}
