package tn.esprit.dhou.gestiondeproduit_dhiasn.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.dhou.gestiondeproduit_dhiasn.entities.Enums.CategoryProduit;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@EqualsAndHashCode

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = {"produit", "idDetailProduit"})

@FieldDefaults(level = AccessLevel.PRIVATE)
public class DetailProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idDetailProduit;
    LocalDate dateCreation;
    LocalDate dateDeriniereModification;
    @Enumerated(EnumType.STRING)
    CategoryProduit categoryProduit;

    @EqualsAndHashCode.Exclude
    @OneToOne(cascade = CascadeType.ALL)
    Produit produit;


}
