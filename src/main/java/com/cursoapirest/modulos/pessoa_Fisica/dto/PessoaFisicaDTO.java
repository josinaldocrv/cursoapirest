package com.cursoapirest.modulos.pessoa_Fisica.dto;

import java.io.Serializable;
import java.util.Objects;

public class PessoaFisicaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private  String name;
    private String email;

    public PessoaFisicaDTO(){
    }

    public PessoaFisicaDTO(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PessoaFisicaDTO)) return false;
        PessoaFisicaDTO that = (PessoaFisicaDTO) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
