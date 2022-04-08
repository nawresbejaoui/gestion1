package com.app.springboot.DTOS;

import com.app.springboot.Model.Adresse;
import com.app.springboot.Model.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class ClientDTO {
    private Long id;

    private String nom;


    private Adresse adresse;



    private String mail;


    private String numTel;


    private List<CommandeClientDTO> commandeclients;

    public ClientDTO fromEntity(Client client)
    {
        if(client == null)
            return null;
        return ClientDTO.builder().id(client.getId())
                .nom(client.getNom())
                .adresse(client.getAdresse())
                .mail(client.getMail())
                .numTel(client.getNumTel()).build();
           //     .commandeclients(client.getCommandeclients()) to revisit


    }
    public Client toEntity(ClientDTO clientDTO){
        if(clientDTO ==null)return null;
        Client client=new Client();
        client.setNom(clientDTO.getNom());
        client.setAdresse(clientDTO.getAdresse());
        client.setMail(clientDTO.getMail());
        client.setNumTel(clientDTO.getNumTel());
       // need a list here figure it out
        return client;
    }



}
