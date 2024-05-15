package streams.teste;

import streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class Teste06 {
    private static List<LightNovel> lightNovels= new ArrayList<>(List.of(
            new LightNovel("Rakudai Cavalery no Keshi",3.2),
            new LightNovel("Damachi",8.4),
            new LightNovel("DBZ",7.4),
            new LightNovel("Monogatari",2),
            new LightNovel("ZOD",3.6),
            new LightNovel("Naruto",1.5)

    ));
    public static void main(String[] args) {
        Double reduceSoma = lightNovels.stream()// pior jeito
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(0.0, Double::sum);

        System.out.println(reduceSoma);


        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();


    }
}
