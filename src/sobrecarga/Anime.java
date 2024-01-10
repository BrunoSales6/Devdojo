package sobrecarga;

public class Anime {
    private String nome;
    private int ep;
    private String tipo;
    private String estudio;
    private String autor;

    public void init(String nome, String tipo, int ep){
        this.nome=nome;
        this.tipo=tipo;
        this.ep=ep;
    }
    public Anime(){
        System.out.println("INFORMAÇÔES DO ANIME:");
    }
    public void init(String nome, String tipo, int ep,String estudio){
        this.init(nome,tipo,ep);
        this.estudio=estudio;
    }
    public void init(String nome, String tipo, int ep,String estudio,String autor){
        this.init(nome, tipo, ep, estudio);
        this.autor=autor;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.ep);
        System.out.println(this.tipo);
        System.out.println(this.estudio);
        System.out.println(this.autor);
    }

    public String getNome(){
        return nome;
    }

    public int getEp() {
        return ep;
    }


    public String getTipo(){
        return this.tipo;
    }
}
