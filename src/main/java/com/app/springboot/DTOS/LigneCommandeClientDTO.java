package com.app.springboot.DTOS;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LigneCommandeClientDTO {
    private long id;

    private ArticleDTO article;


    private Integer quantite;


    private CommandeClientDTO commandeClient ;
}
