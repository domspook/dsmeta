package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import com.devsuperior.dsmeta.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

// API "REST"
//Componente responsável por implementar os endpoints (caminhos) que o Frontend vai precisar para acessar o Backend

@RestController
@RequestMapping(value = "/sales") //Endereço de acesso web
public class SaleController {

    @Autowired
    private SaleService service;

    @Autowired
    private SmsService  smsService;

    @GetMapping //Acessa a interface "SaleRepository" para buscar as informações
    public Page<Sale> findSales(
            @RequestParam(value="minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
            Pageable pageable){
        return service.findSales(minDate, maxDate,pageable);
    }
    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id) {
        smsService.sendSms(id);
    }
}
