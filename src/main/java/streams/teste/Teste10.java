package streams.teste;

import streams.dominio.Category;
import streams.dominio.LightNovel;
import streams.dominio.State;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Teste10 {
    private static List<LightNovel> lightNovels= new ArrayList<>(List.of(
            new LightNovel("Rakudai Cavalery no Keshi",3.2, Category.ROMANCE),
            new LightNovel("Damachi",8.4,Category.FANTASIA),
            new LightNovel("DBZ",7.4,Category.FANTASIA),
            new LightNovel("Monogatari",2,Category.DRAMA),
            new LightNovel("ZOD",3.6,Category.FANTASIA),
            new LightNovel("Naruto",1.5,Category.FANTASIA)

    ));
    public static void main(String[] args) {
        Map<State, List<LightNovel>> stateListMap = lightNovels.stream().collect(Collectors.groupingBy(lightNovel -> lightNovel.getPrice() < 4 ? State.Promotion : State.Normal));
        System.out.println(stateListMap);

        Map<Category, Map<State, List<LightNovel>>> maps = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(lightNovel -> lightNovel.getPrice() < 4 ? State.Promotion : State.Normal)));
        System.out.println(maps);
    }
}
