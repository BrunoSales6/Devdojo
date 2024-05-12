package streams.teste;

import streams.dominio.LightNovel;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1) ordene por titulo
//2) traga os 3 primieiros light novels que tenham valor menor que 4.
public class Teste {

    private static List<LightNovel> lightNovels= new ArrayList<>(List.of(
            new LightNovel("Rakudai Cavalery no Keshi",3.2),
            new LightNovel("Damachi",8.4),
            new LightNovel("DBZ",7.4),
            new LightNovel("Monogatari",2),
            new LightNovel("ZOD",3.6),
            new LightNovel("Naruto",1.5)

    ));
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovels);
        List<String> titles= new ArrayList<>();
        for(LightNovel lightNovel:lightNovels){
            if(lightNovel.getPrice()<4){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size()>=3){
                break;
            }
        }
        System.out.println(titles);



    }
}
