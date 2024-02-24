package file;

import java.io.File;
import java.io.IOException;

public class Diretorio {
    public static void main(String[] args) {
        File diretorio=new File("pasta");
        boolean isDiretorioCriado = diretorio.mkdir();
        System.out.println(isDiretorioCriado);
        File fileArquivo= new File(diretorio,"arquivo2.txt");
        try {
            boolean isCriadoArquivo = fileArquivo.createNewFile();
            System.out.println(isCriadoArquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File fileRenamed=new File(diretorio,"arquivo2novo");
        boolean b = fileArquivo.renameTo(fileRenamed);
        System.out.println(b);

    }
}
