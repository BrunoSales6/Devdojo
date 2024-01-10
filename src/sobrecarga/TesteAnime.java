package sobrecarga;

public class TesteAnime {
    public static void main(String[] args) {
        Anime anime=new Anime();
        anime.init("Yuyu Hakusho","Luta",168);
        anime.init("Yuyu Hakusho","Ação",168,"Mappa");
        anime.init("Yuyu Hakusho","Ação",168,"Mappa","Akira Toriyama");
        anime.imprime();

    }
}
