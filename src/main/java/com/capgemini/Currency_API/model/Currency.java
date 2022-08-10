package com.capgemini.Currency_API.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
<<<<<<<<< Temporary merge branch 1:src/main/java/com/capgemini/TesteAPI/model/Usuario.java
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
=========
@Table(name = "SLDG_TDIVISA")
>>>>>>>>> Temporary merge branch 2:src/main/java/com/capgemini/Currency_API/model/Currency.java
@AttributeOverride(name = "id", column = @Column(name = "OID_DIVISA", unique = true, nullable = false, length = 36))
public class Currency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
<<<<<<<<< Temporary merge branch 1:src/main/java/com/capgemini/TesteAPI/model/Usuario.java
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="usuario_id")
    private Integer id;
=========
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
>>>>>>>>> Temporary merge branch 2:src/main/java/com/capgemini/Currency_API/model/Currency.java
    @Column(name = "COD_ISO")
    private String code;
    @Column(name = "DES_DIVISA")
    private String description;
    @Column(name = "DES_SIMBOLO")
    private String symbol;

<<<<<<<<< Temporary merge branch 1:src/main/java/com/capgemini/TesteAPI/model/Usuario.java
    public Integer getId() {
=========
    public Currency() {
    }

    public Long getId() {
>>>>>>>>> Temporary merge branch 2:src/main/java/com/capgemini/Currency_API/model/Currency.java
        return id;
    }

    public void setId(Integer id) {
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


