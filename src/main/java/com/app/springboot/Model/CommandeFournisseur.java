package com.app.springboot.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="commandeFournisseur")

public class CommandeFournisseur {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name=" dateCommande")
    private Date dateCommande;

    @Column(name="etat")
    private String Etat;

    @ManyToOne
    @JoinColumn(name="idFournisseur")
    private Fournisseur fournisseur;


    @OneToMany(mappedBy="commandefournisseurs")
    private List<LigneCommandeFour>lignecommandefournisseurs;
}


