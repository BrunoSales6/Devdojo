package streams.teste;

import java.util.List;

public class Teste05 {
    public static void main(String[] args) {
        List<Integer> lista=List.of(1,2,3,4,5,6);

        System.out.println(lista.stream().reduce(0,Integer::sum));
        System.out.println(lista.stream().reduce(1,(a,b)->a*b));
        System.out.println(lista.stream().reduce(0,Integer::max));

    }
}
