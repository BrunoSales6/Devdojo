package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> nomes= new ArrayList<>(10);
        nomes.add("Bruno");
        nomes.add("Iruan");
        nomes.add("Tibério");

//        for (String valor:nomes
//             ) {
//            System.out.println(valor);
//
//        }

        for( int c=0; c< nomes.size();c++){
            System.out.println(nomes.get(c));
        }


    }
}
