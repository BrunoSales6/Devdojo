package teste;

import dominio.Funcionary;

public class FuncionaryTest {
    public static void main(String[] args) {
        Funcionary funcionary=new Funcionary();
        funcionary.nome="Bruno";
        funcionary.idade=19;
        funcionary.salary=new double[]{3000,4000,2000};

        funcionary.imprime();
        funcionary.media();
    }
}
