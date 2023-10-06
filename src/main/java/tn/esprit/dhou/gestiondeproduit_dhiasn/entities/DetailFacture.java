package tn.esprit.dhou.gestiondeproduit_dhiasn.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@EqualsAndHashCode

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = {"facture", "produit", "idDetailFacture"})

@FieldDefaults(level = AccessLevel.PRIVATE)
public class DetailFacture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idDetailFacture;

    int qte;
    float prixTotal;
    int pourcentageRemise;
    float montantRemise;

    @ManyToOne
    Facture facture;

    @ManyToOne
    Produit produit;

}
