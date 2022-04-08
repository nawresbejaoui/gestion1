package com.app.springboot.DTOS;

import com.app.springboot.Model.Article;
import com.app.springboot.Model.Stock;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;



@Data
@Builder
public class ArticleDTO {


    private long id;

    private String designation;


    private BigDecimal prixUnitaireHt;


    private BigDecimal tauxTva;


    private BigDecimal prixUnitaireTtc;

    private Stock mystock;
    public ArticleDTO fromEntity(Article article)
    {
        if(article == null)
            return null;
        return ArticleDTO.builder().id(article.getId())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .tauxTva(article.getTauxTva())
                .mystock(article.getMystock())
                .build();

    }
    public Article toEntity(ArticleDTO articleDto){
        if(articleDto ==null)return null;
        Article article=new Article();
        article.setDesignation(articleDto.getDesignation());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        article.setTauxTva(articleDto.getTauxTva());
        article.setMystock(articleDto.getMystock());
        return article;
    }




}
