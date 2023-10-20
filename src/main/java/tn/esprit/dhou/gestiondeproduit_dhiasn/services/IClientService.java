package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Enums.CategoryClient;

import java.time.LocalDate;
import java.util.List;

public interface IClientService {
    List<Client> retrieveAllClients();

    Client addClient(Client c);

    Client updateClient(Client c);

    Client retrieveClient(Long c);

    void removeClient(Long id);
}
