package streams.teste;

import streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class Teste03 {
    private static List<LightNovel> lightNovels= new ArrayList<>(List.of(
            new LightNovel("Rakudai Cavalery no Keshi",3.2),
            new LightNovel("Damachi",8.4),
            new LightNovel("DBZ",7.4),
            new LightNovel("Monogatari",2),
            new LightNovel("ZOD",3.6),
            new LightNovel("Naruto",1.5)

    ));
    public static void main(String[] args) {
        lightNovels.stream().forEach(lightNovel -> System.out.println(lightNovel));


    }
}
