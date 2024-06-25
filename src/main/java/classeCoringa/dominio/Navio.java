package classeCoringa.dominio;

public class Navio {
    private String nome;

    public Navio(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Navio{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
