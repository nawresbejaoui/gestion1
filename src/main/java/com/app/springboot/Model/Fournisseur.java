package com.app.springboot.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="fournisseur")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="nom")
    private String nom;

    @Embedded
    private Adresse adresse;

    @Column(name="mail")
    private String mail;

    @Column(name="numTel")
    private String numTel;


    @OneToMany(mappedBy="fournisseur")
    private List<CommandeFournisseur>commandefournisseurs;

}

