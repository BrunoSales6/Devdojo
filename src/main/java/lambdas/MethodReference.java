package lambdas;

import lambdas.dominio.Anime;
import lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class MethodReference {
    public static void main(String[] args) {
        List<Anime> animeList =new ArrayList<>( List.of(new Anime("Beserk", 23), new Anime("AKame ga Kill", 213)));
        sort(animeList, AnimeComparator::compareByTitle);
        sort(animeList, AnimeComparator::compareByEp);
        System.out.println(animeList);
    }

}
