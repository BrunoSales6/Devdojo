package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaSorting {
    public static void main(String[] args) {
        List<String> mangas= new ArrayList<>();
        mangas.add("Dragon ball Z");
        mangas.add("Cavaleiros do Zodiaco");
        mangas.add("Beserk");
        mangas.add("Hellsing Ultimate");
        Collections.sort(mangas);

        for ( String manga:mangas
             ) {
            System.out.println(manga);

        }



    }


}
