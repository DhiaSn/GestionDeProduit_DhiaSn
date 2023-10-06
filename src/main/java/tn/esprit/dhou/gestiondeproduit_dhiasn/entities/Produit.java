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
@ToString(exclude = {"idProduit", "detailFactures", "stock", "rayon", "fournisseurs", "detailProduit"})


@FieldDefaults(level = AccessLevel.PRIVATE)
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idProduit;

    String code;
    String label;

    float prixUnitaire;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
    Set<DetailFacture> detailFactures;

    @EqualsAndHashCode.Exclude
    @ManyToOne(cascade = CascadeType.ALL)
    Stock stock;

    @EqualsAndHashCode.Exclude
    @ManyToOne(cascade = CascadeType.ALL)
    Rayon rayon;

    @EqualsAndHashCode.Exclude
    @ManyToMany
    Set<Fournisseur> fournisseurs;

    @EqualsAndHashCode.Exclude
    @OneToOne(mappedBy = "produit",cascade = CascadeType.ALL)
    DetailProduit detailProduit;

}
