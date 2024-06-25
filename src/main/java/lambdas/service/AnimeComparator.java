package lambdas.service;

import lambdas.dominio.Anime;

public class AnimeComparator {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static Integer compareByEp(Anime a1, Anime a2){
        return Integer.compare(a1.getQuantity(), a2.getQuantity());
    }
}
