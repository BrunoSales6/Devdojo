package colecoes;

import java.util.ArrayList;
import java.util.List;


public class Iterator {
    public static void main(String[] args) {
        List<Manga> mangaList=new ArrayList<>();
        mangaList.add(new Manga(48L,"DBZ",30.5,0));
        mangaList.add(new Manga(45L,"Hellsing",19.5,10));
        mangaList.add(new Manga(44L,"JoJo",20.5,0));
        mangaList.add(new Manga(41L,"Alice in Botherland",20.5,2));

//        java.util.Iterator<Manga> mangaIterator = mangaList.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade()==0){
//                mangaIterator.remove();
//            }
//        }


//        mangaList.removeIf(m-> m.getQuantidade()==0);
//        System.out.println(mangaList);

    }
}
