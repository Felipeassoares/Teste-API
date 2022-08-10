package com.capgemini.Currency_API.Service;

import com.capgemini.Currency_API.model.Currency;
import com.capgemini.Currency_API.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository repository;

    public List<Currency> findAll(){
        return repository.findAll();
    }
    public Currency findById(Long id){
        Optional<Currency> obj = repository.findById(id);
        return obj.get();
    }

    public Currency save(Currency currency) {

        return repository.save(currency);
    }

    public Currency update(Currency currency, Long id) {
        currency.setId(id);
        return repository.save(currency);
    }

    public void delete(Long id){

        repository.deleteById(id);
    }

}
