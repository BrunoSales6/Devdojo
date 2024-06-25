package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leitura {
    public static void main(String[] args) {
        File file=new File("C:\\idea\\Devdojo\\pasta_de_arquivos\\Escrito.txt");
        try {
            FileReader fr=new FileReader(file);
            System.out.println(fr.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
