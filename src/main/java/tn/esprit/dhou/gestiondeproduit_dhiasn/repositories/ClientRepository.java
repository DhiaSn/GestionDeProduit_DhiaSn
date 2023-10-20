package tn.esprit.dhou.gestiondeproduit_dhiasn.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Client;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Enums.CategoryClient;

import java.time.LocalDate;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
