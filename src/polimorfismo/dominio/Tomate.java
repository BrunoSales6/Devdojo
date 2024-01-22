package polimorfismo.dominio;

import polimorfismo.dominio.Produto;

public class Tomate extends Produto {
    public static final double TAXA=0.06;
    private String dataDeValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor*TAXA;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
