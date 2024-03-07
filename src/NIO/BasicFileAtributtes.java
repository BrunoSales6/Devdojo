package NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAtributtes {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File arquivo = new File("pasta/arq.txt");
        boolean isCreated = arquivo.createNewFile();
        boolean isModifed = arquivo.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(isModifed);

        Path path = Paths.get("pasta/path.txt");
        Files.createFile(path);
        FileTime filetime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,filetime);



    }
}
