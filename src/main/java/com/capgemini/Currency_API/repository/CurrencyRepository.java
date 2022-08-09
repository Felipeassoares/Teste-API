package com.capgemini.Currency_API.repository;

import com.capgemini.Currency_API.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {

    Currency getById(long id);

}
