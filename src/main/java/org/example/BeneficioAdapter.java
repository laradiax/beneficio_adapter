package org.example;

public class BeneficioAdapter extends BeneficioPontos {

    private IBeneficio beneficioCategoria;

    public BeneficioAdapter(IBeneficio beneficioCategoria) {
        this.beneficioCategoria = beneficioCategoria;
    }

    public String recuperarCategoria() {
        if (this.getPontos() >= 9.0f)
            beneficioCategoria.setCategoria("A");
        else
        if (this.getPontos() >= 8.0f)
            beneficioCategoria.setCategoria("B");
        else
        if (this.getPontos() >= 7.0f)
            beneficioCategoria.setCategoria("C");
        else
            beneficioCategoria.setCategoria("D");

        return beneficioCategoria.getCategoria();
    }

    public void salvarCategoria() {
        if (beneficioCategoria.getCategoria().equals("A"))
            this.setPontos(9.0f);
        else
        if (beneficioCategoria.getCategoria().equals("B"))
            this.setPontos(8.0f);
        else
        if (beneficioCategoria.getCategoria().equals("C"))
            this.setPontos(7.0f);
        else
            this.setPontos(0.0f);
    }
}