package NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Relativize {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/Bruno");
        Path relativo = Paths.get("/home/Bruno/Carro/Deus");
        Path relativize = dir.relativize(relativo);
        System.out.println(relativize);

    }
}
