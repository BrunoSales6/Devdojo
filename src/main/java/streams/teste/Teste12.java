package streams.teste;

import streams.dominio.Category;
import streams.dominio.LightNovel;
import streams.dominio.State;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Teste12 {
    private static List<LightNovel> lightNovels= new ArrayList<>(List.of(
            new LightNovel("Rakudai Cavalery no Keshi",3.2, Category.ROMANCE),
            new LightNovel("Damachi",8.4,Category.FANTASIA),
            new LightNovel("DBZ",7.4,Category.FANTASIA),
            new LightNovel("Monogatari",2,Category.DRAMA),
            new LightNovel("ZOD",3.6,Category.FANTASIA),
            new LightNovel("Naruto",1.5,Category.FANTASIA)

    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> map = lightNovels.stream().
                collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(map);

        Map<Category, List<State>> categoryListMap = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(lightNovel -> lightNovel.getPrice() < 4 ? State.Promotion : State.Normal, Collectors.toList())));

        System.out.println(categoryListMap);


    }
}
