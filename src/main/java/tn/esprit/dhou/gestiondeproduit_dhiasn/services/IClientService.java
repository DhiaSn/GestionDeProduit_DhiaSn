package tn.esprit.dhou.gestiondeproduit_dhiasn.services;

import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;

import java.util.List;

public interface IClientService {
    List<Client> retrieveAllClients();

    Client addClient(Client c);

    Client updateClient(Client c);

    Client retrieveClient(Long c);

    void removeClient(Long id);
}
