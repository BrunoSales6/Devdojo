package streams.teste;

import streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste04 {
    private static List<LightNovel> lightNovels= new ArrayList<>(List.of(
            new LightNovel("Rakudai Cavalery no Keshi",3.2),
            new LightNovel("Damachi",8.4),
            new LightNovel("DBZ",7.4),
            new LightNovel("Monogatari",2),
            new LightNovel("ZOD",3.6),
            new LightNovel("Naruto",1.5)

    ));
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(lightNovel -> lightNovel.getPrice()>9));
        System.out.println(lightNovels.stream().allMatch(lightNovel -> lightNovel.getPrice()>0));
        System.out.println(lightNovels.stream().noneMatch(lightNovel -> lightNovel.getPrice()<0));

        lightNovels.stream().
                filter(lightNovel -> lightNovel.getPrice()>1)
                .max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        ;
        lightNovels.stream().
                filter(lightNovel -> lightNovel.getPrice() > 1).min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);



    }
}
