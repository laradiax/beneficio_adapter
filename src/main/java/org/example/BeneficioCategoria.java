package org.example;

public class BeneficioCategoria implements IBeneficio {

    private String categoria;

    @Override
    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}