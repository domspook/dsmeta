package com.devsuperior.dsmeta.repositories;

import com.devsuperior.dsmeta.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

//Componente responsável por acessor o banco de dados
//Crinção de Interface extendendo o JpaRepository <Classe, tipo do "ID">
public interface SaleRepository extends JpaRepository<Sale, Long> {
    //Busca todos os objetos do tipo Sale onde a data do objeto esteja entre as datas minimas e maximas e ordena por valor do montante "decrescente"
    @Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC") // Linguagem "JPQL"
    Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable); //Amostragem de dados paginadas padrão 20

}
