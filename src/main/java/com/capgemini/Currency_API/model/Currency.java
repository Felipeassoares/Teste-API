package com.capgemini.Currency_API.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SLDG_TDIVISA")
@AttributeOverride(name = "id", column = @Column(name = "OID_DIVISA", unique = true, nullable = false, length = 36))
public class Currency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    @Column(name = "COD_ISO")
    private String code;
    @Column(name = "DES_DIVISA")
    private String description;
    @Column(name = "DES_SIMBOLO")
    private String symbol;

    public Currency() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}


