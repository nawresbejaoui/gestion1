package com.app.springboot.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="article")
public class Article  {

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="designation")
    private String designation;

    @Column(name="prixunitaireht")
    private BigDecimal prixUnitaireHt;

    @Column(name="tauxTva")
    private BigDecimal tauxTva;

    @Column(name="prixunitairettc")
    private BigDecimal prixUnitaireTtc;

    @ManyToOne
    @JoinColumn(name="stock")
     private Stock mystock;








}
