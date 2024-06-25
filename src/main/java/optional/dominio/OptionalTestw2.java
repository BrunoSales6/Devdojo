package optional.dominio;

import optional.repository.Repository;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTestw2 {
    public static void main(String[] args) {
        Optional<Manga> optionalManga = Repository.findByName("DBZ");
        optionalManga.ifPresent(manga -> manga.setTitle("DBZ Super"));
        System.out.println(optionalManga);

        Manga newmanga = Repository.findByName("Dungeon ni Deai").orElse(new Manga(3, "Dungeon ni Deai", 58));
        System.out.println(newmanga);


    }

}
