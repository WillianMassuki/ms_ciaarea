package br.com.ms_ciaarea.companhiaarea.model;

import jakarta.persistence.*;

@Entity
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    @ManyToOne
    @JoinColumn(name = "companhia_aerea_id")
    private CompanhiaAerea companhiaAerea;

    public Voo() {
    }

    public Voo(Long id, String codigo, CompanhiaAerea companhiaAerea) {
        this.id = id;
        this.codigo = codigo;
        this.companhiaAerea = companhiaAerea;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public CompanhiaAerea getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(CompanhiaAerea companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }
}

