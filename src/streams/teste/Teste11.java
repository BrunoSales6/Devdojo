package streams.teste;

import streams.dominio.Category;
import streams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Teste11 {
    private static List<LightNovel> lightNovels= new ArrayList<>(List.of(
            new LightNovel("Rakudai Cavalery no Keshi",3.2, Category.ROMANCE),
            new LightNovel("Damachi",8.4,Category.FANTASIA),
            new LightNovel("DBZ",7.4,Category.FANTASIA),
            new LightNovel("Monogatari",2,Category.DRAMA),
            new LightNovel("ZOD",3.6,Category.FANTASIA),
            new LightNovel("Naruto",1.5,Category.FANTASIA)

    ));

    public static void main(String[] args) {

        Map<Category, Long> contagem = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(contagem);

        Map<Category, Optional<LightNovel>> maxByPreco = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(maxByPreco);// o problema é que aqui ele tem um optional, vamos extrair.

        Map<Category, LightNovel> maxBy = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        //agr está sem o optional
        System.out.println(maxBy);


    }
}
