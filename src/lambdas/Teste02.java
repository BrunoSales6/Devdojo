package lambdas;

import java.util.List;
import java.util.function.Consumer;

public class Teste02 {
    public static void main(String[] args) {
        List<String> strings= List.of("Buno","Iruan","Shaianne");
        List<Integer> integers= List.of(1,-2,3);

        foreach(strings,(String s)-> System.out.println(s));
        foreach(integers,(Integer i)-> System.out.println(Integer.compare(i,1)));

    }
    private static <T> void foreach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
