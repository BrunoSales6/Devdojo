package NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioTeste2 {
    public static void main(String[] args) throws IOException {
        Path pastaPath= Paths.get("TomeMaisUma");
        if(Files.notExists(pastaPath)){
            Files.createDirectory(pastaPath);
        }
        Path subPasta = Paths.get("TomeMaisUma/TomeOutra");
        if(Files.notExists(subPasta)){
            Files.createDirectory(subPasta);
        }
        Path aumentaOSomMarcelo = Paths.get(subPasta.toString(), "aumentaOSomMarcelo.txt");
        if (Files.notExists(aumentaOSomMarcelo)){
            Files.createFile(aumentaOSomMarcelo);
        }



    }
}
