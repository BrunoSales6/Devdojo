package colecoes;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;

    private int quantidade;

    public Manga(Long id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Não pode ser nulo o id.");
        Objects.requireNonNull(nome, "Não pode ser nulo o nome");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Double.compare(preco, manga.preco) == 0 && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }


    @Override
    public int compareTo(@NotNull Manga outromanga) {
        //negativo se o this<outromanga
        //return 0 se o this==outromanga
        //positivo se o this>outromanga
//        if (this.id<outromanga.getId()){
//            return -1;
//        } else if (this.id== outromanga.getId()) {
//            return 0;
//        }
//        else{
//            return 1;
//        }
        return this.nome.compareTo(outromanga.getNome());





    }
}
