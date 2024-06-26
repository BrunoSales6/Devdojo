package optional.repository;

import optional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Repository {
    public static List<Manga> mangas= List.of(new Manga(1,"DBZ",213),new Manga(2,"Jojo",9));
    public static Optional<Manga> findByName(String title){
        return findBy(ma -> ma.getTitle().equals(title));

    }
    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found=null;
        for (Manga manga:mangas){
            if (predicate.test(manga)){
                found=manga;
            }

        }
        return Optional.ofNullable(found);

    }




}
