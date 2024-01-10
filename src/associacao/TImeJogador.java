package associacao;

public class TImeJogador {
    public static void main(String[] args) {
        Jogador j1=new Jogador("KK");
        Jogador j12=new Jogador("Neymar");
        Time time=new Time("Brasil");
        j1.setTime(time);
        j12.setTime(time);
        Jogador[] jogadores={j1,j12};
        time.setJogadores(jogadores);
        time.imprime();
        System.out.println("--------------");
        j1.imprime();
        j12.imprime();


    }
}
