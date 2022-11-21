package com.devsuperior.dsmeta.entities;

import javax.persistence.*;
import java.time.LocalDate;


// Regras de Negócio
@Entity //(Mapeamento Objeto Relacional - ORM / JPA) -
@Table(name = "tb_sales")
public class Sale {
    @Id //(Receberá valores únicos)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //(Valores serão gerados de forma automática)
    private Long id;
    private String sellerName;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    //Construtor
    public Sale(){

    }

    //Métodos de Acesso (Getings e Setings / Encapsulamento)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
