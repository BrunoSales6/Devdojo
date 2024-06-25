package blocos;

import org.w3c.dom.ls.LSOutput;

public class AnimeBloco {
    private String nome;
    private int[] ep;

    public AnimeBloco() {
        ep=new int[1000];
        for (int i = 0; i < ep.length ; i++) {
            ep[i]=i+1;

        }

        for(int episodio:this.ep){
            System.out.print(episodio+" ");
        }
        System.out.println();
     
    }
}
