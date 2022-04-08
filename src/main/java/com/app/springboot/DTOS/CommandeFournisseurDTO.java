package com.app.springboot.DTOS;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
@Builder
public class CommandeFournisseurDTO {
    private long id;


    private Date dateCommande;


    private String Etat;



    private FournisseurDTO fournisseur;



    private List<LigneCommandeFourDTO> lignecommandefournisseurs;
}
