package optional;

import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optionalString=findName("Bruno");
        String empty= optionalString.orElse("Empty");
        System.out.println(empty);



    }

    private static Optional<String> findName(String name){
        List<String> list= List.of("William");
        int i= list.indexOf(name);
        if(i>=0){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}

