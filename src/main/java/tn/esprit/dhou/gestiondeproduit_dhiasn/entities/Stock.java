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
@ToString(exclude = {"idStock", "produits"})

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idStock;
    int qte;
    int qteMin;
    String libelleStock;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "stock")
    Set<Produit> produits;




}
