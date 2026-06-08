package br.com.ms_ciaarea.companhiaarea.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CompanhiaAerea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String codigoIata;

    private String pais;

    @OneToMany(mappedBy = "companhiaAerea")
    private List<Voo> voos = new ArrayList<>();

    public CompanhiaAerea() {
    }

    public CompanhiaAerea(Long id, String nome, String codigoIata, String pais, List<Voo> voos) {
        this.id = id;
        this.nome = nome;
        this.codigoIata = codigoIata;
        this.pais = pais;
        this.voos = voos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoIata() {
        return codigoIata;
    }

    public void setCodigoIata(String codigoIata) {
        this.codigoIata = codigoIata;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }
}