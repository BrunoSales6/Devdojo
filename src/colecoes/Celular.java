package colecoes;

public class Celular {
    private String nome;
    private String serie;

    public Celular(String nome, String serie) {
        this.nome = nome;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj== null) return false;
        if(this==obj) return true;
        if(this.getClass()!=obj.getClass()) return false;
        Celular celular = (Celular) obj;
        return serie!=null && serie.equals(celular.getSerie());
    }

    @Override
    public int hashCode() {
        return serie==null ? 0: this.serie.hashCode();
    }
}
