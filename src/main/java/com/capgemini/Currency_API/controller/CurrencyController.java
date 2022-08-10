package com.capgemini.Currency_API.controller;

import com.capgemini.Currency_API.Service.CurrencyService;
import com.capgemini.Currency_API.model.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService service;

    @GetMapping
    public ResponseEntity<List<Currency>> findAll(){
        List<Currency> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Currency list = service.findById(id);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Currency> create(@RequestBody Currency currency){
        currency = service.save(currency);
        URI uri = (ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(currency.getId()).toUri());
        return ResponseEntity.created(uri).body(currency);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.PUT)
    public ResponseEntity<Currency> update(@RequestBody Currency currency, @PathVariable Long id){
        currency = service.update(currency, id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = {"/{id}" })
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}


