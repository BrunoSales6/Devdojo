package Interfaces;



public class Dateloaderteste {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader=new DatabaseLoader();
        FileLoader fileLoader=new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.check();
    }

}
