package tn.esprit.dhou.gestiondeproduit_dhiasn.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = {"idRayon", "produits"})

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rayon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idRayon;

    String Code;
    String libelle;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "rayon")
    Set<Produit> produits;

    

}
