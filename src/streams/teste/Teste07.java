package streams.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Teste07 {
    public static void main(String[] args) {
        IntStream.rangeClosed(0,50).filter(n-> n%2==0).forEach(n->System.out.print(n+" "));
        System.out.println(" ");


        int [] numeros={1,2,3,4,5};

        Arrays.stream(numeros).average().ifPresent(System.out::println);

        Stream.of("Que ","Deus ","Seja ","Louvado")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s+" "));


        try(Stream<String> linha= Files.lines(Paths.get("aumentaOSomMarcelo.txt"))) {
            linha.forEach(System.out::println);


        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
