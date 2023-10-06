package tn.esprit.dhou.gestiondeproduit_dhiasn.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Enums.CategoryClient;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Enums.Profession;

import java.time.LocalDate;
import java.util.Set;

@Entity

@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"nom", "idClient", "factures"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idClient;

    String nom;
    String prenom;
    LocalDate dateNaissance;
    String email;
    String password;
    @Enumerated(EnumType.STRING)
    CategoryClient categoryClient;
    @Enumerated(EnumType.STRING)
    Profession profession;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "client")
    Set<Facture> factures;


}
