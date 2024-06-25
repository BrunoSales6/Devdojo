package polimorfismo.dominio;

public class Computador extends Produto {
    public static final double TAXA=0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor*TAXA;
    }

}
