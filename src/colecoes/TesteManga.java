package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class MangaByIDComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga m1, Manga m2) {

        return Long.compare(m1.getId(), m2.getId());


    }
}

public class TesteManga {
    public static void main(String[] args) {
        List<Manga> mangaList=new ArrayList<>();
        mangaList.add(new Manga(48L,"DBZ",30.5));
        mangaList.add(new Manga(45L,"Hellsing",19.5));
        mangaList.add(new Manga(44L,"JoJo",20.5));
        mangaList.add(new Manga(41L,"Alice in Botherland",20.5));
        for (Manga manga : mangaList) {
            System.out.println(manga);
        }
        System.out.println("------------------------------------");
        Collections.sort(mangaList);
        for (Manga manga : mangaList) {
            System.out.println(manga);
        }
        mangaList.sort(new MangaByIDComparator());
        System.out.println("------------------------------------");
        for (Manga manga : mangaList) {
            System.out.println(manga);
        }







    }
}
