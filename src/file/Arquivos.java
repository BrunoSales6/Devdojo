package file;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class Arquivos {
    public static void main(String[] args) {
        File file= new File("C:\\idea\\Devdojo\\pasta_de_arquivos\\Arquivo do balacubaco");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            System.out.println("Última modificação: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
