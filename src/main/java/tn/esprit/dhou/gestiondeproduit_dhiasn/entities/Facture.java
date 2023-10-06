package tn.esprit.dhou.gestiondeproduit_dhiasn.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity

@Getter
@Setter
@EqualsAndHashCode

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = {"idFacture", "client", "detailFactures"})

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idFacture;

    float montantRemise;
    float montantFacture;
    LocalDate dateFacture;
    boolean Active;

    @EqualsAndHashCode.Exclude
    @ManyToOne
    Client client;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "facture", cascade = CascadeType.ALL)
    Set<DetailFacture> detailFactures;

}
