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
@Table(name="commandeClient")
public class CommandeClient {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="dateCommande")
    private Date dateCommande;

    @Column(name="etat")
    private String Etat;

    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;


    @OneToMany(mappedBy="commandeClient")
    private List<LigneCommandeClient>lignecommandeclients;
}

