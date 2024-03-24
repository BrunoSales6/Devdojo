package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchCustomizado {
    public static void main(String[] args) {
        MangaByIDComparator mangaByIDComparator = new MangaByIDComparator();
        List<Manga> mangaList=new ArrayList<>();
        mangaList.add(new Manga(48L,"DBZ",30.5));
        mangaList.add(new Manga(45L,"Hellsing",19.5));
        mangaList.add(new Manga(44L,"JoJo",20.5));
        mangaList.add(new Manga(41L,"Alice in Botherland",20.5));
//        Collections.sort(mangaList);
        for (Manga manga : mangaList) {
            System.out.println(manga);
        }
        Manga procura= new Manga(44L,"JoJo",20.5);
        //index 0 1 2 3
        //value A D H J
//        System.out.println(Collections.binarySearch(mangaList,procura));

        // usando o comparator
        mangaList.sort(mangaByIDComparator);
        System.out.println(Collections.binarySearch(mangaList,procura,mangaByIDComparator));

        //index 0 1 2 3
        //value A J H D





    }
}
