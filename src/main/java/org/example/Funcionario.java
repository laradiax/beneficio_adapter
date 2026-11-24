package org.example;

public class Funcionario {

    IBeneficio beneficio;
    BeneficioAdapter persistencia;

    public Funcionario() {
        beneficio = new BeneficioCategoria();
        persistencia = new BeneficioAdapter(beneficio);
    }

    public void setCategoriaBeneficio(String categoria) {
        beneficio.setCategoria(categoria);
        persistencia.salvarCategoria();
    }

    public String getCategoriaBeneficio() {
        return persistencia.recuperarCategoria();
    }

    public float getPontosBeneficio() {
        return persistencia.getPontos();
    }
}