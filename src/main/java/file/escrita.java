package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class escrita {
    public static void main(String[] args) {
        File file=new File("C:\\idea\\Devdojo\\pasta_de_arquivos\\Escrito.txt");
        try(FileWriter fileWriter=new FileWriter(file,true)) {
           fileWriter.write("Escrevendooo\n");
           fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
