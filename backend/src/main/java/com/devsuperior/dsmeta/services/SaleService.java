package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

//Componete Responsável por buscar as informações no repositório
//Buscas de informações através do filtro das datas
@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;

    public Page<Sale> findSales (String minDate, String maxDate, Pageable pageable) {
        // Variavel today recebe o valor da data atual do sistema
        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        // Variavel min recebe o valor da variavel today menos 365 caso campo esteja vazio, se não, converte para o valor local da variavel minDate
        LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
        // Variavel max recebe o valor da variavel today caso campo esteja vazio, se não, converte para o valor da variavel maxDate
        LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

        return repository.findSales(min,max,pageable);
    }
}
