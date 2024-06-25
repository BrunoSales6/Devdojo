package Interfaces;

public class FileLoader implements DateLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivo.");

    }
}
