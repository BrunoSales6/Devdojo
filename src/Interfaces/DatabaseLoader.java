package Interfaces;

public class DatabaseLoader implements DateLoader,DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando bancos de dados.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo bancos de dados.");

    }
}
