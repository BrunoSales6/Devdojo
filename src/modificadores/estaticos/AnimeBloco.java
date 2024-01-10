package modificadores.estaticos;

public class AnimeBloco {
    private String nome;
    private static int[] ep;

    static {
        System.out.println("Dentro do bloco de inicialização");
        ep=new int[1000];
        for(int c=0;c<ep.length;c++){
            ep[c]=c+1;
        }
    }

    public AnimeBloco() {
        for(int episodio:this.ep){
            System.out.print(episodio+" ");
        }
        System.out.println();

    }
}
