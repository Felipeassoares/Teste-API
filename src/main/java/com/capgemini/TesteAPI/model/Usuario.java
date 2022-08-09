package com.capgemini.TesteAPI.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
@AttributeOverride(name = "id", column = @Column(name = "OID_DIVISA", unique = true, nullable = false, length = 36))
public class Usuario implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="usuario_id")
    private Integer id;
    @Column(name = "COD_ISO")
    private String code;
    @Column(name = "DES_DIVISA")
    private String description;
    @Column(name = "DES_SIMBOLO")
    private String symbol;

    public Integer getId() {
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
